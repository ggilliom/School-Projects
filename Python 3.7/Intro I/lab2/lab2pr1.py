#Garrett Gilliom and Ruochen "Michael" Xu
uppers = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
lowers = 'abcdefghijklmnopqrstuvwxyz'
nums = '0123456789'
syms = '!?,.;:$#_&'
checker = False
while checker == False:
  checker = True
  password = input("Please enter a password:\n")
  upCheck = 0
  lowCheck = 0
  numsCheck = 0
  symsCheck = 0
  if len(password) < 8 or len(password) > 20:
    checker = False
  else:
    for spot in password:
      if spot == ' ':
        checker = False
  if checker == True:
    for char in password:
     for upLetter in uppers:
       if char == upLetter:
         upCheck += 1
     for lowLetter in lowers:
       if char == lowLetter:
         lowCheck += 1
     for numLetter in nums:
       if char == numLetter:
         numsCheck += 1
     for symLetter in syms:
       if char == symLetter:
         symsCheck += 1
  if upCheck == 0 or lowCheck == 0 or numsCheck == 0 or symsCheck == 0:
   checker = False
print("Password accepted")
