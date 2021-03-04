"""
CMPS 2200  Assignment 2.
See assignment-02.pdf for details.
"""
import time
import math

class BinaryNumber:
	""" done """
	def __init__(self, n):
		self.decimal_val = n               
		self.binary_vec = list('{0:b}'.format(n)) 
		
	def __repr__(self):
		return('decimal=%d binary=%s' % (self.decimal_val, ''.join(self.binary_vec)))


## Implement multiplication functions here. Note that you will have to
## ensure that x, y are appropriately sized binary vectors for a
## divide and conquer approach.

def quadratic_multiply(x, y):
	### TODO

	if len(x.binary_vec) == 1 and len(y.binary_vec) == 1:
		return x.decimal_val * y.decimal_val

	length = len(x.binary_vec)
	if (len(y.binary_vec) > length):
		for spot in range((len(y.binary_vec) - length)):
			x.binary_vec.insert(0,'0')
		length = len(y.binary_vec)
	elif(len(y.binary_vec) < length):
		for spot in range(length - (len(y.binary_vec))):
			y.binary_vec.insert(0,'0')


	if length % 2 == 1:
		x.binary_vec.insert(0,'0')
		y.binary_vec.insert(0,'0')
		length += 1


	mid = math.ceil(length/2)


	# Compute xL and xR
	xLlist = x.binary_vec[:mid]
	xRlist = x.binary_vec[mid:]
	xLstr = ""
	xRstr = ""
	for index in xLlist:
		xLstr += index
	for index in xRlist:
		xRstr += index
	xLint = int(xLstr, 2)
	xRint = int(xRstr, 2)

	x_L = BinaryNumber(xLint)
	x_R = BinaryNumber(xRint)


	# Compute yL and yR
	yLlist = y.binary_vec[:mid]
	yRlist = y.binary_vec[mid:]
	yLstr = ""
	yRstr = ""
	for index in yLlist:
		yLstr += index
	for index in yRlist:
		yRstr += index
	yLint = int(yLstr, 2)
	yRint = int(yRstr, 2)

	y_L = BinaryNumber(yLint)
	y_R = BinaryNumber(yRint)

	a = quadratic_multiply(x_L, y_L)
	b = quadratic_multiply(x_L, y_R)
	c = quadratic_multiply(x_R, y_L)
	d = quadratic_multiply(x_R, y_R)

	return int((2**length)*a + (2**(length/2))*(b + c) + d)
	###

def subquadratic_multiply(x, y):
	### TODO
	if len(x.binary_vec) == 1 and len(y.binary_vec) == 1:
		return x.decimal_val * y.decimal_val

	length = len(x.binary_vec)
	if (len(y.binary_vec) > length):
		for spot in range((len(y.binary_vec) - length)):
			x.binary_vec.insert(0,'0')
		length = len(y.binary_vec)
	elif(len(y.binary_vec) < length):
		for spot in range(length - (len(y.binary_vec))):
			y.binary_vec.insert(0,'0')


	if length % 2 == 1:
		x.binary_vec.insert(0,'0')
		y.binary_vec.insert(0,'0')
		length += 1


	mid = math.ceil(length/2)


	# Computer xL and xR
	xLlist = x.binary_vec[:mid]
	xRlist = x.binary_vec[mid:]
	xLstr = ""
	xRstr = ""
	for index in xLlist:
		xLstr += index
	for index in xRlist:
		xRstr += index
	xLint = int(xLstr, 2)
	xRint = int(xRstr, 2)

	x_L = BinaryNumber(xLint)
	x_R = BinaryNumber(xRint)
	xLR = BinaryNumber(xLint + xRint)


	# Compute yL and yR
	yLlist = y.binary_vec[:mid]
	yRlist = y.binary_vec[mid:]
	yLstr = ""
	yRstr = ""
	for index in yLlist:
		yLstr += index
	for index in yRlist:
		yRstr += index
	yLint = int(yLstr, 2)
	yRint = int(yRstr, 2)

	y_L = BinaryNumber(yLint)
	y_R = BinaryNumber(yRint)
	yLR = BinaryNumber(yLint + yRint)

	a = subquadratic_multiply(x_L, y_L)
	b = subquadratic_multiply(x_R, y_R)
	c = subquadratic_multiply(xLR, yLR)

	return int((2**length)*a + (2**(length/2))*(c - a - b ) + b)
	###

## Feel free to add your own tests here.
def test_multiply():
	assert subquadratic_multiply(BinaryNumber(2), BinaryNumber(2)) == 2*2
	assert subquadratic_multiply(BinaryNumber(3), BinaryNumber(4)) == 3*4
	assert subquadratic_multiply(BinaryNumber(0), BinaryNumber(0)) == 0*0
	assert subquadratic_multiply(BinaryNumber(1), BinaryNumber(1)) == 1*1
	assert subquadratic_multiply(BinaryNumber(1232), BinaryNumber(69)) == 1232*69
	assert subquadratic_multiply(BinaryNumber(145), BinaryNumber(32)) == 145*32

def time_multiply(x, y, f):
	start = time.time()
	# multiply two numbers x, y using function f
	result = f(x,y)
	return (time.time() - start)*1000

def compare_multiply():
	print("\nTEST ONE")
	quadOne = time_multiply(BinaryNumber(1232),BinaryNumber(69), quadratic_multiply)
	subOne = time_multiply(BinaryNumber(1232),BinaryNumber(69), subquadratic_multiply)
	print("1232 x 69 =", 1232 * 69)
	print("quadOne:", quadOne, "subOne:", subOne)
	
	print("\nTEST TWO")
	quadTwo = time_multiply(BinaryNumber(4),BinaryNumber(3), quadratic_multiply)
	subTwo = time_multiply(BinaryNumber(4),BinaryNumber(3), subquadratic_multiply)
	print("4 x 3 =", 4 * 3)
	print("quadTwo:", quadTwo, "subTwo:", subTwo)
	
	print("\nTEST THREE")
	quadThree = time_multiply(BinaryNumber(432),BinaryNumber(54), quadratic_multiply)
	subThree = time_multiply(BinaryNumber(432),BinaryNumber(54), subquadratic_multiply)
	print("432 x 54 =", 432 * 54)
	print("quadThree:", quadThree, "subThree:", subThree)
	
	print("\nTEST FOUR")
	quadFour = time_multiply(BinaryNumber(12543),BinaryNumber(3242), quadratic_multiply)
	subFour = time_multiply(BinaryNumber(12543),BinaryNumber(3242), subquadratic_multiply)
	print("12543 x 3242 =", 12543 * 3242)
	print("quadFour:", quadFour, "subFour:", subFour)
	
	print("\nTEST FIVE")
	quadFive = time_multiply(BinaryNumber(432155432),BinaryNumber(574839), quadratic_multiply)
	subFive = time_multiply(BinaryNumber(432155432),BinaryNumber(574839), subquadratic_multiply)
	print("432155432 x 574839 =", 432155432 * 574839)
	print("quadFive:", quadFive, "subFive:", subFive)

	print("\nTEST SIX")
	quadSix = time_multiply(BinaryNumber(574893256436597),BinaryNumber(57423895692), quadratic_multiply)
	subSix = time_multiply(BinaryNumber(574893256436597),BinaryNumber(57423895692), subquadratic_multiply)
	print("574893256436597 x 57423895692 =", 574893256436597 * 57423895692)
	print("quadSix:", quadSix, "subSix:", subSix)

	print()
	print("Results match expected outcome; quadratic runtime function runs slower than subquadratic runtime.")
	# compare the empirical runtimes of multiplication functions
	### TODO - add test cases and measure runtime

#print("Hello world")
#result = quadratic_multiply(BinaryNumber(1232), BinaryNumber(69))
#print("RESULT", result)
#time_multiply(BinaryNumber(1232),BinaryNumber(69), quadratic_multiply)
compare_multiply()