# Garrett Gilliom and Matt Ryan

import random
import time

# Generates n random numbers 0-99, inclusive
def generate_nums(filename, n):
  random.seed(0)
  f = open(filename, 'w')
  for spot in range(n):
    f.write(str(random.randint(0,99)) + '\n')

# Analyzes Merge Sort Algorithm
def analyze_mergesort(inputfile, outputfile):
  tOpen = time.time() # Begins time
  intList = []
  rFile = open(inputfile, "r")
  fileList = rFile.readlines()
  for spot in fileList: # Puts file values in a list as integers
    intList.append(int(spot))

  rFile.close()
  tClose = time.time() 
  tInput = tClose-tOpen # Time taken to input values

  t3 = time.time()
  tUnsort = time.ctime(t3)
  sortList = merge_sort(intList) # Calls Merge Sort
  t4 = time.time()
  tSorted = t4 - t3 # Time taken to sort values
  
  t5 = time.time()
  tUnwritten = time.ctime(t5)
  wFile = open(outputfile, "w")
  for num in sortList:
    wFile.write(str(num) + '\n') # Writes values into a file
  t6 = time.time()
  tOutput = t6 - t5 # Time taken to write values

  numVals = len(sortList)
  
  print("It took", round(tInput, 6), "seconds to input", numVals, "values from file", inputfile)
  
  print("It took", round(tSorted,6), "seconds to sort", numVals, "values using merge sort")
  
  print("It took", round(tOutput, 6), "seconds to output", numVals, "sorted values to file", outputfile)

  print("Total time the program took is", (round(tInput, 6) + round(tSorted,6) + round(tOutput, 6)))

# Analyzes Selection Sort
def analyze_selection(inputfile, outputfile):
  tOpen = time.time() # Begins time
  intList = []
  rFile = open(inputfile, "r")
  fileList = rFile.readlines()
  for spot in fileList: # Puts file values in a list as integers
    intList.append(int(spot))

  rFile.close()
  tClose = time.time()
  tInput = tClose-tOpen # Time taken to input values

  t3 = time.time()
  tUnsort = time.ctime(t3)
  sortList = selection_sort(intList) # Calls Selection Sort
  t4 = time.time()
  tSorted = t4 - t3 # Time taken to sort values
  
  t5 = time.time()
  tUnwritten = time.ctime(t5)
  wFile = open(outputfile, "w")
  for num in sortList:
    wFile.write(str(num) + '\n') # Writes values into a file
  t6 = time.time()
  tOutput = t6 - t5 # Time taken to write values

  numVals = len(sortList)

  print("It took", round(tInput, 6), "seconds to input", numVals, "values from file", inputfile)
  
  print("It took", round(tSorted,6), "seconds to sort", numVals, "values using merge sort")
  
  print("It took", round(tOutput, 6), "seconds to output", numVals, "sorted values to file", outputfile)
  print("Total time the program took is", (round(tInput, 6) + round(tSorted,6) + round(tOutput, 6)))

def merge_sort( aList ):
    """
    Merge sort recursively divide the list into half, sort both halves
    and then merge the two sorted lists into one.
    """
    # If the aList is size 0 or 1, it's already sorted.
    if len( aList ) <= 1:
        return aList

    else:
        mid = len( aList ) // 2

        # Recursively sort the left and right halves
        left = merge_sort( aList[ :mid ] )
        right = merge_sort( aList[mid:] )
        
        # Merge the two (each sorted) parts back together
        return merge( left, right )
                             
def merge( left, right ):
    """
    Merge to sorted list, left and right, into one sorted list.
    """
    aList = []
    lt = 0
    rt = 0

    # Repeatedly move the smallest of left and right to the new list
    while lt < len( left ) and rt < len( right ):
        if left[ lt ] < right[ rt ]:
            aList.append( left[ lt ]  )
            lt += 1
        else:
            aList.append( right[ rt ] )
            rt += 1

    # There will only be elements left in one of the original two lists.

    # Append the remains of left (lt..end) on to the new list.
    while lt < len(left):
        aList.append( left[ lt ] )
        lt += 1
         
    # Append the remains of right (rt..end) on to the new list.
    while rt < len( right ):
        aList.append( right[ rt ] )
        rt += 1

    return aList

def selection_sort( aList ):
  """Sorts a list in ascending order using the selection sort algorithm.
  """
  n = len( aList )
  for i in range( n - 1 ):
    
      
    # Find the minimum element in the unsorted portion of the list
    
    smallNdx = i # assume the ith element is the smallest.
    
    # Determine if any other element contains a smaller value.
    for j in range( i + 1, n ):
      if aList[ j ] < aList[ smallNdx ] :
        smallNdx = j

    # Swap the ith value and smallNdx value  
                      
    tmp = aList[ i ]
    aList[ i ] = aList[ smallNdx ]
    aList[ smallNdx ] = tmp

  return aList

inputfile = input("Please enter an input file name: ") # Input file name
outputfile = input("Please enter an output file name: ") # Output file name
print("Selection Sort:")
analyze_selection(inputfile, outputfile)
print('\n\n\nMerge Sort:')
analyze_mergesort(inputfile, outputfile)
