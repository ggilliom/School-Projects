# Garrett Gilliom and Matt Ryan

def uppercount(s):
  if s == "": # Base case
    return 0
  else: # Recursive steps
    if s[0] in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ': 
      return 1 + uppercount(s[1:])
    else:
      return 0 + uppercount(s[1:])
# Can check if a password has enough capital letters in it
# To check if a word is improperly capitalized with too many or too few capital letters

def clean_string(string):
  if string == "": # Base case
    return ""
  else: # Recursive steps
    if string[0] in "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ":
      return string[0] + clean_string(string[1:])
    else:
      return clean_string(string[1:])

def clean_list(l1, l2):
  if l1 == []: # Base Case
    return []
  else: # Recursive Steps
    if l1[0] in l2:
      return clean_list(l1[1:], l2)
    else:
      return [l1[0]] + clean_list(l1[1:], l2)