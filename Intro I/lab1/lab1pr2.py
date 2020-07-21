# Garrett Gilliom and Ruochen "Michael" Xu
day = ""
month = ""
year = ""
date = input("Please enter date in MM/DD/YYYY format: ")
if date[1:2] != '/':
  month = date[:2]
  if date[4:5] != '/':
    day = date[3:5]
    year = date[6:]
  else:
    day = '0' + date[3:4]
    year = date[5:]
else:
  month = '0' + date[:1]
  if date[3:4] != '/':
    day = date[2:4]
    year = date[5:]
  else:
    day = '0' + date[2:3]
    year = date[4:]
newDate = day + '.' + month + '.' + year
print("Here is the formatted date:", newDate)
