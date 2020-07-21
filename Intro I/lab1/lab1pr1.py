# Garrett Gilliom and Ruochen "Michael" Xu
ssn = input("Please enter SSN: ")
if len(ssn) != 9:
  print("Incorrect SSN length.")
else:
  new_ssn = ssn[:3] + '-' + ssn[3:5] + '-' + ssn[5:]
  print(new_ssn)
  
