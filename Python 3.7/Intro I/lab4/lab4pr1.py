majors = {'Harry' : 'Computer Science', 'Hermione' : 'Mathematics', 'Ron' : 'English'}
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
  print(num)
  return int(num)

def display(d):
  for term in d:
    print(term + " is a wizard in " + d[term])

get_menu_choice()