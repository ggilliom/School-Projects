# Garrett Gilliom and Ruochen "Michael" Xu
day = ''
month = ''
year = ''
monthList = ['December', 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
date = input("Please enter date in MM/DD/YYYY format: ")
year = date[-4:]
if date[2:3] == '/':
  month = monthList[int(date[:2])]
  if date[5:6] == '/':
    day = date[3:5]
  else:
    day = date[3:4]
else:
  month = monthList[int(date[:1])]
  if date[4:5] == '/':
    day = date[2:4]
  else:
    day = date[2:3]
endDate = month + ' ' + day + ', ' + year
print("Here is the formatted date:", endDate)
