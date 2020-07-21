# Garrett Gilliom and Matt Ryan

'''Recursively checks if a list of numbers is sorted increasingly
lst == [1,2,3,4] returns True
lst == [1,2,2,3] returns True
lst == [1,2,3,2] returns False'''
def is_sorted(lst): # O(1)
  if len(lst) == 1: # O(1)
    return True # O(1)
  
  if lst[0] > lst[1]: # O(1)
    return False # O(1)
  
  return is_sorted(lst[1:]) # O(1)


'''Takes in a file name, returns if the file's contents are sorted increasingly. Returns false if empty'''
def is_file_sorted(filename): # O(1)
  check = True # O(1)
  numsFile = [] # O(1)
  f = open(filename, "r") # O(1)
  fileList = f.readlines() # O(n)

  if len(fileList) == 0: # O(1)
    check = False # O(1)
  
  for spot in fileList: # O(n)
    numsFile.append(int(spot)) # O(1)
  
  check = is_sorted(numsFile) # O(n) because the function is recursive, going through each item in the list for worst-case
  
  if check == False: # O(1)
    return "Looks like " + filename + " needs to be sorted" # O(1)
  else: # O(1)
    return "Congratulations! The file " + filename + " is nicely sorted!" # O(1)

filename = input("Please enter file name: ") # O(1)

print(is_file_sorted(filename)) # O(1)

'''
Big O: O(n)
Justification: All lines of code are O(1) except for lines 22 (call to readlines() function), 27 (for loop), and 30 (call to is_sorted, a recursive function that checks each item in a list in worse-case), which are all O(n). n + n + n = 3, but in Big O notation this is simplified to just O(n).
'''