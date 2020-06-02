## Copy all function definitions from IDLE to here

## look_up
def look_up(d):
  name = input("Enter a name: ")
  if name not in d:
    print("Not found.")
  else:
    print(d[name])

## add
def add(d):
  name = input("Enter a name: ")
  print()
  major = input("Enter a major: ")
  print()
  if name in d:
    print("A person with this name already exists in the system.")
  else:
    d[name] = major

## change 
def change(d):
  name = input("Enter a name: ")
  if name not in d:
    print("That name is not found.")
  else:
    major = input("Enter the new major: ")
    d[name] = major

## delete 
def delete(d):
  name = input("Enter a name: ")
  if name not in d:
    print("That name is not found.")
  else:
    d.pop(name)

## display 
def display(d):
  for term in d:
    print(term + " is a wizard in " + d[term])

## get_menu_choice 
def get_menu_choice():
  print("Majors of College Students")
  print("---------------------------")
  print("1. Look up a student's major")
  print("2. Add a new major")
  print("3. Change a major")
  print("4. Delete a student")
  print("5. Display all students")
  print("6. Quit the program")
  print()
  num = input("Enter your choice: ")
  print()
  while ord(num[0]) < 48 or ord(num[0]) > 55:
    num = input("Enter a valid choice: ")
  return int(num)

# read
def reading(majors):
  file = open("majors.txt", "r")
  name = file.readline()
  name = name[:-1]
  major = file.readline()
  major = major[:-1]
  while name != '' and major != '':
    majors[name] = major
    name = file.readline()
    name = name[:-1]
    major = file.readline()
    major = major[:-1]
  file.close()

# write
def writing(majors):
  file = open("majors.txt","w")
  keys = majors.keys()
  for spot in keys:
    file.write(spot + '\n')
    file.write(majors[spot] + '\n')
  file.close()

## The main part of your program
majors = {}
# File should have a new line for each name and major with an extra line at the very bottom. For example:
'''
Harry
Computer Science
Ron
Physics
Hermione
Mathematics
Hagrid
English

'''
reading(majors)

choice = 0

while choice != 6:

        choice = get_menu_choice()

        if choice == 1:
            look_up(majors)
        elif choice == 2:
            add(majors)
        elif choice == 3:
            change(majors)
        elif choice == 4:
            delete(majors)
        elif choice == 5:
            display(majors)

writing(majors)
