import csv,os

keep = [0,1,2,3] #keep track of columns we actually change in canvas and remove the unchanged ones later. These first ones are necessary to keep, stuff like student name, email, etc

def ModFunction(current,new):
    '''
    This function is applied to every grade we update. It can be used to modify the way we update grades. It takes the current grade (in canvas) and the new grade to update (in zybook/gradescope) and
    returns the new grade we want to apply. Default it should just return new but you can change it to, say, max(float(current),float(new)). If you do this be careful of empty grades -- all the entries
    are strings (either numbers or blank) so you'll have to convert first to integers if you want to apply, say, max
    '''
    return new.strip()

def FindUser(canvas,canvasname,new,newname,target):
    '''
    Takes the canvas matrix, the column in it that has the names of the students, the new matrix (zybook or gradescope), the column in the new matrix that has the students names, and the name of a user
    that we want to find. Returns the row associated with that user in the new matrix, or None if it couldn't find them. If multiple matches for the same name occur (for example, jsmith@tulane.edu, jsmith1@tulane.edu)
    returns None as well and prints an error message
    '''
    found = []
    for row in range(len(new)):
        if canvas[target][canvasname].lower() in new[row][newname].lower():
            found.append(row)
    if len(found) == 1:
        return found[0]
    elif len(found) == 0:
        return None
    else:
        print("Error finding row in new (non-canvas) matrix associated with user",canvas[target][canvasname],"multiple possible matches:")
        for i in found:
            print(new[i])
        return None


    
def Transfer(canvas,new,canvasname,newname,NewTarget,lab=None):
    '''
    Main workhorse function. Transfers a grade (for all students) from the new matrix to the canvas one.
    Inputs: canvas matrix, new matrix, canvas username column, new username column, column of grade in new matrix we are updating, boolean whether or not this is a lab (for auto detection)
    It will ask user interactively for column in canvas. It tries to filter down to ones which are appropriate for the grade you're entering, but you always have the option to press '?' and
    get the whole list
    Outputs: None, prints successful if each update was successful, appropriate error message otherwise
    '''
    f = new[0][1] #there are a huge number of columns in canvas and we are going to ask the user to pick one, use string f to filter down to just the ones we suspect are relevant
    #We look for the HW number the user entered if zybooks
    if lab != None:
        f = new[0][NewTarget]
    found = None
    for i in range(len(canvas[0])):
        if canvas[0][i][:len(f) + 2] == f + ' (':
            if found != None:
                found = None
                break
            found = i
    if found != None:
        CanTarget = int(found)
    if lab != None:
        f = lab
        
        
    if found == None:
        #this means we didn't automatically find an exact match
        PrettyPrint(canvas[0],f)
        CanTarget = input("Indicate the column in Canvas we'd like to update (List filtered looking for chapter " + f + ", enter '?' for full list)\n")
        if CanTarget == '?':
            PrettyPrint(canvas[0])
            CanTarget = int(input("Indicate the column in Canvas we'd like to update"))
        else:
            CanTarget = int(CanTarget)
        
    keep.append(CanTarget)
    good = 0
    bad = 0
    #Once we have our target, add it to the 'columns to keep' list global variable
    for CanUser in range(1,len(canvas)): #start at 1 to ignore the header row
        if len(canvas[CanUser][canvasname]) == 0:
            pass
        #there are many empty strings in the canvas file, for 'points possible' and to indicate columns are muted, etc. 
        else:
            NewUser = FindUser(canvas,canvasname,new,newname,CanUser)
            if NewUser == None:
                print("Couldn't find",canvas[CanUser][canvasname])
                bad += 1
            else:
                canvas[CanUser][CanTarget] = ModFunction(canvas[CanUser][CanTarget],new[NewUser][NewTarget]) #apply mod function before changing grades.
                print("Updated grade for",canvas[CanUser][canvasname])
                good += 1
    print("Updated", good, "entries. Failed to find ", bad,"entries.")
    return

                
def GetCanvasName(canvas):
    '''
    Inputs: canvas matrix
    Output: column associated with student login IDs (i.e. 'efenske' in 'efenske@tulane.edu') in the canvas matrix
    Find column in canvas matrix associated with the student's name. It should be something like SiS login ID. Tries to automatically find it and informs user if succesful, asks for help from user if not.
    '''
    IDRow = 0
    for i in range(len(canvas[0])):
        if "Login" in canvas[0][i]:
            print("Using Canvas Column",canvas[0][i])
            return i
    PrettyPrint(canvas[0])
    return int(input("Please enter the canvas username column, it should be the Tulane login ID"))




def GetNewName(new,t=""):
    '''
    Inputs: new matrix, a string indicating whether or not to try and use the default Zybook or Gradescope column
    Ouptut: Column associated with student names in new matrix
    Find column in new matrix associated with student's name. Has autodetect for Zybook and Gradescope files if directed, will ask the user for help if these fail.
    '''
    if t == "zybook":
        if 'School' in new[0][0]:
                print("Using column 0 (",new[0][0],") for Zybooks name")
                return 0
        
        PrettyPrint(new[0])
        return int(input("Please enter the column for school email in the ZyBooks file"))
    if t == "gradescope":
        for i in range(len(new[0])):
            if 'Email' in new[0][i]:
                print("Using column",i,"for GradeScope name")
                return i
    PrettyPrint(new[0])
    return int(input("Please enter the column for the student ID (i.e. the column which should have the students TULANE ID -- this is usually 'email', or 'school email'"))

        
def FileFinder(t):
    '''
    Inputs: A string t which represents the types of file we are looking for ('zybook' or 'gradescope' or 'canvas')
    Output: A file (gradescope or canvas) or list of files (zybook) to use
    Files should all be CSVs in the same directory as this python script. If auto detection fails, limited logic to allow user to select a seperate files
    '''
    d = os.listdir()
    csvs = []
    files = []
    for i in d:
        if i[-4:] == '.csv':
            csvs.append(i)
    #just look at csvs in the local directory
    if t == "canvas":
        target = "Grades-CMPS"
    elif t == "zybook":
        target = "TULANECMPS"
    elif t == "gradescope":
        target = "all_sections_scores"
    #set target = a substring in the naming scheme for the appropriate type of file -- these are strings which indicate that a file is a zybook, gradescope, canvas file etc.
    
    for i in csvs:
        if target in i:
            files.append(i)
    #add files to our list which match the target
            
    #sanity checks:
    if t == "canvas" and len(files) != 1:
        return csvs[int(input("Auto detection failed. Please indicate the " + t + " file to use:\n"))]
    elif t == "canvas":
        print("Using", files[0], "as our Canvas file")
        return files[0]
    elif t == "zybook" and len(files) >0:
        print("Using,")
        PrettyPrint(files)
        print("As our Zybooks files")
        return files
    elif t == "zybook":
        PrettyPrint(csvs)
        print("Zybook file detection failed. Enter a file to include, [enter] when done")
        x = input()
        while x != "":
            files.append(csvs[int(x)])
            print("Using files:")
            PrettyPrint(files)
            print("----------------------------------")
            PrettyPrint(csvs)
            print("Zybook file detection failed. Enter a file to include, [enter] when done")
            x = input()
        return files
            
    elif t == "gradescope" and len(files) !=1:
        PrettyPrint(csvs)
        return csvs[int(input("Auto detection failed. Please indicate the " + t + " file to use:\n"))]
    elif t == "gradescope":
        print("Using",files[0],"as our Gradescope file")
        return files[0]


def GetDataFromFile(filename):
    '''
    Inputs: name of csv file to pull data from
    Output: 2d array which is a matrix representing the data in the file
    '''
    data = []
    with open(filename,newline='') as f:
        reader = csv.reader(f,quoting=csv.QUOTE_MINIMAL)
        for row in reader:
            data.append(row)
        return data
def WriteCsv(canvas):
    '''
    Inputs: matrix with (updated) canvas data
    Output: None. It should write the data to output.csv in the local directory
    '''
    with open("output.csv","w",newline='') as g:
        writer = csv.writer(g,delimiter=',',quoting=csv.QUOTE_MINIMAL)
        for i in canvas:
            writer.writerow(i)
        return


    
def PrettyPrint(L,filt=""):
    '''
    Input: List to print, string to filter entries by
    Output: None. Should print all the entries in the list and their index. Used to show a user options in a list (matching filt) so they may select the entry by number.
    '''
    for i in range(len(L)):
        if filt in L[i]:
            print(i,':',L[i])
            
def RemoveColumn(L,col):
    '''
    Removes column 'col' from 2d array 'L'.
    '''
    
    for i in range(len(L)):
        try:
            del L[i][col]
        except:
            pass
def CleanZybook(zybook,testing=False):
    n = len(zybook[0]) - 1

    # Is this a lab?
    # Checks if there is any lab column other than "lab total". Ignores case.
    if any('lab' in x.lower() for x in zybook[0] if "lab total" not in x.lower()):   
        for i in range(n,-1,-1):
            if 'ID' in zybook[0][i] or 'total' in zybook[0][i].lower() or 'name' in zybook[0][i] or 'Primary' in zybook[0][i] or 'N' in zybook[1][i]:
                RemoveColumn(zybook,i)
        print(zybook[0][1:])
        print("Which lab number is this?")
        lab = input(str(zybook[0][1:]) + "\n(#):")
        for i in range(len(zybook[0])):
            if i!=0:
                zybook[0][i] = 'lab' + lab + 'pr' + str(i-1)
        return lab
            
    else: # This is a hw
        for i in range(n,-1,-1):
            if 'ID' in zybook[0][i] or 'name' in zybook[0][i] or 'Primary' in zybook[0][i] or 'N' in zybook[1][i]:
                RemoveColumn(zybook,i)
        print("Which homework number has the following assignments?")
        hw = input(str(zybook[0][1:]) + "\n(#):")
        zybook[0][1] = "hw" + hw
        print(zybook[0][1])
        return None

def main():
    
    CanvasFileName = FileFinder("canvas")
    #call FileFinder with 'canvas' to get the file name from local directory for the canvas file we'll use
    GradeFileName = ""
    #will stay empty unless we find a Gradescope file
    x = input("Include ZyBooks files? (y/n)\n")
    zyfiles = []
    if x == 'y':
        zyfiles = FileFinder("zybook")
    #if user asked for it, we pull a list of Zybooks files from local directory
    x = input("Include Gradescope files? (y/n)\n")
    if x == 'y':
        GradeFileName = FileFinder("gradescope")
    #if user asked for it, pull name of a gradescope file. 
    print("Beginning update..............")
    canvas = GetDataFromFile(CanvasFileName)
    CanvasNameCol = GetCanvasName(canvas)
    #get data from canvas file and find the column for the student name in it
    
    for f in zyfiles:
        print("Importing ZyBooks file",f)
        zybook = GetDataFromFile(f)
        #print("Zybook[0]=",zybook[0])

        lab = CleanZybook(zybook)

        NewNameCol = GetNewName(zybook,"zybook")
        #get data and student name column from the file we are on
        if lab != None:
            for i in range(len(zybook[0])):
                if i != 0:
                    print("Updating",zybook[0][i])
                    Transfer(canvas,zybook,CanvasNameCol,NewNameCol,i,lab)
            #when working with labs, we keep letting the user insert each problem 1 by 1 until they press 0 to indicate they are done. 
        else:
            # if it's not a lab, we can just use column 1 since we want the total for the zybooks file. 
            target = 1
            #print("Zybook[0]: ", zybook[0])
            #print("Zybook[1]: ", zybook[1])
            
            #print(zybook[74])
            Transfer(canvas,zybook,CanvasNameCol,NewNameCol,target)


    if GradeFileName != "":
        #that means we have a gradescope file
        print("Importing Gradescope file",GradeFileName)
        gs = GetDataFromFile(GradeFileName)
        NewNameCol = GetNewName(gs,"gradescope")
        PrettyPrint(gs[0])
        target = int(input("Gradescope file opened, enter the column to put into Canvas\n"))
        Transfer(canvas,gs,CanvasNameCol,NewNameCol,target)

    for i in range(len(canvas[0])-1,0,-1):
        if i not in keep:
            RemoveColumn(canvas,i)
    #now remove all the unchanged columns in the file
    print("New Canvas csv constructed, writing to output.csv")
    WriteCsv(canvas)

main()






