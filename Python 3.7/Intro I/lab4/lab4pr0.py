majors = {'Harry' : 'Computer Science', 'Hermione' : 'Mathematics', 'Ron' : 'English'}

def look_up(d):
  name = input("Enter a name: ")
  if name not in d:
    print("Not found.")
  else:
    print(d[name])
def add(d):
  name = input("Enter a name: ")
  major = input("Enter a major: ")
  if name in d:
    print("A person with this name already exists in the system.")
  else:
    d[name] = major

def change(d):
  name = input("Enter a name: ")
  if name not in d:
    print("That name is not found.")
  else:
    major = input("Enter the new major: ")
    d[name] = major

def delete(d):
  name = input("Enter a name: ")
  if name not in d:
    print("That name is not found.")
  else:
    d.pop(name)





majors = {'Harry' : 'Computer Science', 'Hermione' : 'Mathematics', 'Ron' : 'English'}
look_up(majors)
add(majors)
change(majors)
delete(majors)
