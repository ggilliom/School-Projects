# Garrett Gilliom and Matt Ryan
import time

def F(n):
  if n == 0:
    return 0
  if n == 1 or n == 2:
    return 1
  else:
    return F(n-1) + F(n-2)

def f(n):
  added = 0
  first = 0
  second = 1
  if n == 1:
    return 1
  for i in range(n - 1):
    added = first + second
    first = second
    second = added
  return added

tStartF = time.time()
#print(F(40))
tFinishF = time.time()
FTime = tFinishF - tStartF
print("Recursion: " + str(FTime))
tStartf = time.time()
print(f(20))
tFinishf = time.time()
fTime = tFinishf - tStartf
print("Loop: " + str(fTime))
