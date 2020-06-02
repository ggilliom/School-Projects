#Garrett Gilliom and Ruochen "Michael" Xu
password = input("Please enter a phrase: ")
passwordList = password.split()
firsts = ""
punctList = '.,?!;:'
for word in passwordList:
  if word[0] == "o":
    firsts = firsts + "0"
  elif word[0] == 'a':
    firsts = firsts + '@'
  elif word[0] == 'l':
    firsts = firsts + '1'
  else:
    firsts = firsts + word[0]
  for punct in punctList:
    if punct in word:
      firsts = firsts + punct
print(firsts)
