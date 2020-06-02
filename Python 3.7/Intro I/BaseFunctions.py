def toBinary(string):
  binary = ''
  for char in string:
    binary = binary + (str(bin(ord(char))))[0] + (str(bin(ord(char))))[2:]
  return binary

def decToBase(num, base):
  end = ''
  count = 0
  for power in reversed(range(8)):
    count = 0
    if num >= base ** power:
      while num >= (base ** power) * count:
        count += 1
      count -= 1
    end = end + str(count)
    num = num - (base ** power) * count
  return end

def charToBase(char, base):
  num = ord(char)
  end = ''
  count = 0
  for power in reversed(range(8)):
    count = 0
    if num >= base ** power:
      while num >= (base ** power) * count:
        count += 1
      count -= 1
    end = end + str(count)
    num = num - (base ** power) * count
  return end

'''string = input("Please enter a string: ")
print(toBinary(string)'''

def stringToBase(string, base):
  end = ''
  count = 0
  for char in string:
    num = ord(char)
    for power in reversed(range(8)):
      count = 0
      if num >= base ** power:
        while num >= (base ** power) * count:
          count += 1
        count -= 1
      end = end + str(count)
      num = num - (base ** power) * count
    
  return end

num = int(input("Enter a number: "))
char = input("Enter a character: ")
string = input("Enter a string: ")
base = int(input("Enter a base: "))

print(decToBase(num, base))
print()
print(charToBase(char, base))
print()
print(stringToBase(string, base))
print()
print(toBinary(string))
