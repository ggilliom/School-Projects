#Garrett Gilliom and Ruochen "Michael" Xu
passwords = []
private = []
stars = ''
password = input("Please enter a password (press [enter] to finish): ")
while len(password) > 0:
  passwords.append(password)
  password = input("Please enter a password (press [enter] to finish): ")
for word in passwords:
  stars = ''
  for char in word:
    stars = stars + '*'
  private.append(stars)
print(passwords)
print(private)