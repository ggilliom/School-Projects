from collections import defaultdict

def supersort(a, k):
		"""
		The main sorting algorithm. You'll complete the
		three funcions count_values, get_positions, and construct_output.

		Params:
			a.....the input list
			k.....the maximum element in a
      
		Returns:
			sorted version a
		"""
		counts = count_values(a, k)
		positions = get_positions(counts)
		return construct_output(a, positions)

def count_values(a, k):
	fin = list([0]*(k+1))
	for spot in a:
		fin[spot] += 1
	return fin



def test_count_values():
		assert count_values([2,2,1,0,1,0,1,3], 3) == [2, 3, 2, 1]
    
def get_positions(counts):
		"""
		Params:
			counts...counts of each value in the input
		Returns:
			a list p where p[i] indicates the location of the first
      appearance of i in the desired output.

		>>> get_positions([2, 3, 2, 1])
		[0, 2, 5, 7]    
		"""

		thing = scan(plus, 0, counts)
		pos = thing[0]
		pos = [0] + pos
		pos = pos[:len(pos)-1]
		return pos

    
def test_get_positions():
		assert get_positions([2, 3, 2, 1]) == [0, 2, 5, 7]
    
def construct_output(a, positions):
		"""
		Construct the final, sorted output.

		Params:
			a...........input list
			positions...list of first location of each value in the output.

		Returns:
			sorted version of a

		>>> construct_output([2,2,1,0,1,0,1,3], [0, 2, 5, 7])
		[0,0,1,1,1,2,2,3]    
		"""
		fin = []
		num = 0
		positions.append(float('inf'))
		#print("len of a", len(a))
		#print("range of len(a)", list(range(len(a))))
		for spot in list(range(len(a))):
			if spot >= positions[num+1]:
				num += 1
			fin.append(num)

		return fin

def test_construct_output():
		assert construct_output([2,2,1,0,1,0,1,3], [0, 2, 5, 7]) == [0,0,1,1,1,2,2,3]
		assert construct_output([1,2,2,3,0,0,2,3,1,1], [0, 2, 5, 8]) == [0,0,1,1,1,2,2,2,3,3]
    
def count_values_mr(a, k):
		"""
		Use map-reduce to implement count_values.
		This is done; you'll have to complete count_map and count_reduce.
		"""
		# done.
		int2count = dict(run_map_reduce(count_map, count_reduce, a))
		return [int2count.get(i,0) for i in range(k+1)]

def test_count_values_mr():
		assert count_values_mr([2,2,1,0,1,0,1,3], 3) == [2, 3, 2, 1]

def count_map(value):
		###TODO [(2,[1,1,1], (3,[1,1])]
		'''
		tuple:(value, [1,1,1...#times its repeated])
		param: value == original list
		[2,2,1,0,1,0,1,3]
		
		'''
		print(value)
		pass
		return [(value, 1)]

def count_reduce(group):
		###TODO group[0], group[1]
		'''
		group == list that count_map returns
		return list of tuples: (value, count)
		'''
		reduced = (group[0], reduce(plus, 0, group[1]))
		return reduced

# the below functions are provided for use above.

def run_map_reduce(map_f, reduce_f, mylist):
		# done. 
		pairs = flatten(list(map(map_f, mylist)))
		groups = collect(pairs)
		return [reduce_f(g) for g in groups]

def collect(pairs):
		# done.     
		result = defaultdict(list)
		for pair in sorted(pairs):
				result[pair[0]].append(pair[1])
		return list(result.items())

def plus(x,y):
		# done. 
		return x + y


def scan(f, id_, a):
		# done. 
		return (
						[reduce(f, id_, a[:i+1]) for i in range(len(a))],
							reduce(f, id_, a)
						)

def reduce(f, id_, a):
		# done. do not change me.
		if len(a) == 0:
				return id_
		elif len(a) == 1:
				return a[0]
		else:
				return f(reduce(f, id_, a[:len(a)//2]),
									reduce(f, id_, a[len(a)//2:]))
    
def iterate(f, x, a):
		# done. do not change me.
		if len(a) == 0:
				return x
		else:
				return iterate(f, f(x, a[0]), a[1:])
    
def flatten(sequences):
		return iterate(plus, [], sequences)


#print(count_map([0,1,2,4,3,3]))
#get_positions([2, 3, 2, 1])
#print(count_values([2,2,1,0,1,0,1,3],3))