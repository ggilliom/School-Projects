# Returns a correctly formatted header for the PPM file
def get_header(width, height):
  form = 'P3'
  dim = str(width) + ' ' + str(height)
  color = '255'
  header = form + '\n' + dim + '\n' + color + '\n'
  return header

# Writes color values of the Netherlands flag into a file
def netherlands(width, height):
  red = ''
  white = ''
  blue = ''
  flag = ''

  for num in range(width):
    red = red + '255 0 0 '
    white = white + '255 255 255 '
    blue = blue + '0 0 255 '
  thickness = int(height / 3)

  for line in range(thickness):
    flag = flag + red

  for line in range(thickness):
    flag = flag + white

  for line in range(thickness):
    flag = flag + blue
  return flag

# Writes color values of the Nigerian flag into a file
def nigeria(width, height):
  greenList = []
  whiteList = []
  flag = ''

  for num in range(height):
    greenList.append('0 128 0 ')
    whiteList.append('255 255 255 ')
  
  thickness = int(width / 3)

  for spot in range(height):
    for place in range(thickness):
      flag = flag + greenList[place]
    for place in range(thickness):
      flag = flag + whiteList[place]
    for place in range(thickness):
      flag = flag + greenList[place]
    #flag = flag + '\n'

  return flag

# Writes color values of the UAE flag into a file
def uae(width, height):
  red = ''
  white = ''
  green = ''
  black = ''
  flag = ''

  horizThick = int(width / 4)
  vertThick = int(height / 3)

  for num in range(horizThick * 3):
    green = green + '0 128 0 '
    white = white + '255 255 255 '
    black = black + '0 0 0 '

  for num in range(horizThick):
    red = red + '255 0 0 '

  for line in range(vertThick):
    flag = flag + red + green

  for line in range(vertThick):
    flag = flag + red + white

  for line in range(vertThick):
    flag = flag + red + black

  return flag


# Asks for flag dimensions, name of file, calls get_header and flag-specific functions, and writes the image into the file
def main():
  flagWidth = int(input("Please, enter width: "))
  flagHeight = int(input("Please, enter height: "))
  outName = input("Please, enter output file name: ")
  file = open(outName,  "w")
  file.write(get_header(flagWidth, flagHeight) + '\n')
  file.write(uae(flagWidth, flagHeight))
  file.close()

main()
