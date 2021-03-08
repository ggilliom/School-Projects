"""
CMPS 2200  Recitation 2
"""
### the only imports needed are here
import tabulate
import time
###

import math # needed for iv to test f(n) = lgn

#DONE
def simple_work_calc(n, a, b):
	"""Compute the value of the recurrence $W(n) = aW(n/b) + n

	Params:
	n......input integer
	a......branching factor of recursion tree
	b......input split factor

	Returns: the value of W(n).
	"""
	if b <= 1:
		return -1
	if n <= 1:
		return 1
	else:
		return a * simple_work_calc(n//b, a, b) + n

#DONE
def test_simple_work():
	""" done. """
	assert simple_work_calc(10, 2, 2) == 36
	assert simple_work_calc(20, 3, 2) == 230
	assert simple_work_calc(30, 4, 2) == 650
	# New test cases
	assert simple_work_calc(1, 1, 2) == 1
	assert simple_work_calc(2, 8, 2) == 10
	assert simple_work_calc(12, 2, 2) == 44

#DONE
def work_calc(n, a, b, f):
	"""Compute the value of the recurrence $W(n) = aW(n/b) + f(n)

	Params:
	n......input integer
	a......branching factor of recursion tree
	b......input split factor
	f......a function that takes an integer and returns 
           the work done at each node 

	Returns: the value of W(n).
	"""
	if b <= 1:
		return -1
	if n <= 1:
		return 1
	else:
		return a * work_calc(n//b, a, b, f) + f(n)

def span_calc(n, a, b, f):
	"""Compute the span associated with the recurrence $W(n) = aW(n/b) + f(n)

	Params:
	n......input integer
	a......branching factor of recursion tree
	b......input split factor
	f......a function that takes an integer and returns 
           the work done at each node 

	Returns: the value of W(n).
	"""
	if b <= 1:
		return -1
	if n <= 1:
		return 1
	else:
		return span_calc(n//b, a, b, f) + f(n)
	pass

def test_span_calc():
	assert span_calc(10, 2, 2, lambda n: 1) == 4
	assert span_calc(16, 2, 2, lambda n: 1) == 5
	

#DONE
def test_work():
	""" done. """ 
	#W(n) = aW(n/b) + f(n)
	assert work_calc(10, 2, 2,lambda n: 1) == 15
	assert work_calc(20, 1, 2, lambda n: n*n) == 530
	assert work_calc(30, 3, 2, lambda n: n) == 300
	
	#new test cases
	assert work_calc(2, 1, 1, lambda n: n**3) == -1
	assert work_calc(27, 4, 3, lambda n: 2*n) == 286
	assert work_calc(16, 2, 4, lambda n: (n//2)**2) == 76
	
	'''
	#iv cases 
	assert work_calc(16, 2, 2, lambda n: 1) == ??
	assert work_calc(16, 2, 2, lambda n: math.log(2,n)) == ??
	assert work_calc(16, 2, 2, lambda n: n) == ??
	'''

#DONE
def compare_work(work_fn1, work_fn2, sizes=[10, 20, 50, 100, 1000, 5000, 10000]):
	"""
	Compare the values of different recurrences for 
	given input sizes.

	Returns:
	A list of tuples of the form
	(n, work_fn1(n), work_fn2(n), ...)
	"""
	result = []
	for n in sizes:
		# compute W(n) using current a, b, f

		'''
		if you make a==b==2 here then c < 1 or c > 1 at bottom of file
		'''
		result.append((
			n,
			work_calc(n, 8, 2, work_fn1), # c = 2
			work_calc(n, 8, 2, work_fn2), # c = 4
			))
	return result

#DONE
def print_results(results):
	""" done """
	print(tabulate.tabulate(results,
							headers=['n', 'W_1', 'W_2'],
							floatfmt=".3f",
							tablefmt="github"))

#DONE
def test_compare_work():
	# curry work_calc to create multiple work
	# functions that can be passed to compare_work
    
	work_fn1 = lambda n: n
	work_fn2 = lambda n: n * n

	res = compare_work(work_fn1, work_fn2)
	print_results(res)



'''
#DONE
if __name__ == "__main__":
	print(compare_work(lambda n: n**2, lambda n: n**4, # c values of 2,4
		sizes=[10, 20, 50, 100, 1000, 5000, 10000]))
'''

'''
assert work_calc(16, 2, 2, lambda n: 1) == ??
assert work_calc(16, 2, 2, lambda n: math.log(2,n)) == ??
assert work_calc(16, 2, 2, lambda n: n) == ??


sizes=[1e1, 1e2, 1e3, 1e4, 1e5, 1e6, 1e7]
for spot in sizes:
	print(str(spot) + ": " + str(work_calc(spot, 2, 2, lambda n: )))
'''

'''
print(work_calc(100, 2, 2, lambda n: n))
print(work_calc(8, 2, 2, lambda n: n))
print(work_calc(16, 2, 2, lambda n: n))
'''