# Garrett Gilliom and Ruochen "Michael" Xu
endSeconds = 0
endMinutes = 0
endHours = 0
seconds = int(input("Please enter the number of seconds:"))
if seconds >= 3600:
  endHours = seconds // 3600
  seconds = seconds % 3600
if seconds >= 60 and seconds < 3600:
  endMinutes = seconds // 60
  endSeconds = seconds % 60
if seconds < 60:
  endSeconds = seconds

if endHours > 0:
  if endHours > 1:
    print(endHours, "hours", end = '')
  else:
   print(endHours, "hour", end = '')

if endHours > 0 and (endMinutes > 0 or endSeconds > 0):
  print(' ', end = '')

if endMinutes > 0:
  if endMinutes > 1:
    print(endMinutes, "minutes", end = '')
  else:
   print(endMinutes, "minute", end = '')

if endMinutes > 0 and endSeconds > 0:
  print(' ', end = '')

if endSeconds > 0:
  if endSeconds > 1:
    print(endSeconds, "seconds", end = '')
  else:
   print(endSeconds, "second", end = '')
print()
