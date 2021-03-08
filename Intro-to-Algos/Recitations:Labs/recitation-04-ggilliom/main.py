# recitation-04

from collections import defaultdict


#### PART ONE ###

def run_map_reduce(map_f, reduce_f, docs):
		# done. do not change me.
		"""    
		The main map reduce logic.

		Params:
			map_f......the mapping function
			reduce_f...the reduce function
			docs.......list of input records
		"""
		# 1. call map_f on each element of docs and flatten the results
		# e.g., [('i', 1), ('am', 1), ('sam', 1), ('i', 1), ('am', 1), ('sam', 1), ('is', 1), ('ham', 1)]
		pairs = flatten(list(map(map_f, docs)))
		# 2. group all pairs by their key
		# e.g., [('am', [1, 1]), ('ham', [1]), ('i', [1, 1]), ('is', [1]), ('sam', [1, 1])]
		groups = collect(pairs)
		# 3. reduce each group to the final answer
		# e.g., [('am', 2), ('ham', 1), ('i', 2), ('is', 1), ('sam', 2)]
		return [reduce_f(g) for g in groups]

def word_count_map(doc):
		"""
		Params:
			doc....a string to be split into tokens. split on whitespace.
		Returns:
			a list of tuples of form (token, 1), where token is a whitespace delimited element of this string.
			
		E.g.
		>>> word_count_map('i am sam i am')
		[('i', 1), ('am', 1), ('sam', 1), ('i', 1), ('am', 1)]
		"""
		
		splitDoc = doc.split(" ")
		#print(splitDoc)

		tuples = list(map(lambda x: (x, 1), splitDoc))

		#print(tuples)

		return tuples

		###TODO
    
    

def test_word_count_map():
		assert word_count_map('i am sam i am') == \
						[('i', 1), ('am', 1), ('sam', 1), ('i', 1), ('am', 1)]

def word_count_reduce(group):
	"""
	Params:
		group...a tuple of the form (token, list_of_ones), indicating the number of times each word appears.
	Returns:
		tuple of form (token, int), where int is the number of times that token appears
	E.g.
	>>> word_count_reduce(['i', [1,1]])
	('i', 2)

	NOTE: you should use call the `reduce` function here.
	"""

	reduced = (group[0], reduce(plus, 0, group[1]))

	return reduced

	###TODO
			
    
    
def test_word_count_reduce():
		assert word_count_reduce(('i', [1,1,1])) == ('i', 3)
		assert word_count_reduce(('am', [1, 1, 1, 1, 1, 1])) == ('am', 6)

def test_word_count():
		assert run_map_reduce(word_count_map, word_count_reduce, ['i am sam i am', 'sam is ham']) == \
						[('am', 2), ('ham', 1), ('i', 2), ('is', 1), ('sam', 2)]
		print(run_map_reduce(word_count_map, word_count_reduce, ['test your tests with other tests',
			'and with those tests test your tests']))

def iterate(f, x, a):
		# done. do not change me.
		"""
		Params:
			f.....function to apply
			x.....return when a is empty
			a.....input sequence
		"""
		if len(a) == 0:
				return x
		else:
				return iterate(f, f(x, a[0]), a[1:])
    
def flatten(sequences):
		# done. do not change me.
		return iterate(plus, [], sequences)

def collect(pairs):
		"""
		# done. do not change me.
		Implements the collect function (see text Vol II Ch2)
		E.g.:
		>>> collect([('i', 1), ('am', 1), ('sam', 1), ('i', 1)])
		[('am', [1]), ('i', [1, 1]), ('sam', [1])]    
		"""
		result = defaultdict(list)
		for pair in sorted(pairs):
				result[pair[0]].append(pair[1])
		return list(result.items())


def plus(x, y):
		# done. do not change me.
		return x + y

def reduce(f, id_, a):
		# done. do not change me.
		if len(a) == 0:
				return id_
		elif len(a) == 1:
				return a[0]
		else:
				return f(reduce(f, id_, a[:len(a)//2]),
									reduce(f, id_, a[len(a)//2:]))

    
    
### PART TWO ###

def sentiment_map(doc,
									pos_terms=set(['good', 'great', 'awesome', 'sockdolager']),
									neg_terms=set(['bad', 'terrible', 'waste', 'carbuncle', 'corrupted'])):
		"""
		Params:
			doc.........a string to be split into tokens. split on whitespace.
			pos_terms...a set of positive terms
			neg_terms...a set of negative terms
		Returns:
			a list of tuples of form (positive, 1) or (negative, 1)      
		E.g.
		>>> sentiment_map('it was a terrible waste of time')
		[('negative', 1), ('negative', 1)]

		splitDoc = doc.split(" ")
		print(splitDoc)

		tuples = list(map(lambda x: (x, 1), splitDoc))
		"""

		# Split string into list
		words = doc.split(" ")

		# Filter out non-positive/negative terms
		filtered = list(filter(lambda x: x in pos_terms or x in neg_terms, words))

		# Substitute "positive" for positive terms
		posSub = list(map(lambda x: "positive" if x in pos_terms else x, filtered))

		# Substitute "negative" for negative terms
		allSub = list(map(lambda x: "negative" if x in neg_terms else x, posSub))

		# Add " " to end of each token/term
		spaced = list(map(lambda x: x + " ", allSub))
		
		# Concatenate all tokens
		string = reduce(plus, "", spaced)

		# Delete trailing space
		stringFix = string[0:len(string) - 1]

		# Turn string into tuples
		tuples = word_count_map(stringFix)

		return tuples

		'''
		# Count positive/negative occurrences
		finished = run_map_reduce(word_count_map, word_count_reduce, [stringFix])

		return finished
		'''

    ###TODO


def test_sentiment_map():
		assert sentiment_map('it was a terrible waste of time') == [('negative', 1), ('negative', 1)]

    
def test_sentiment():
		docs = [
				'it was not great but not terrible',
				'thou art a boil a plague-sore or embossed carbuncle in my corrupted blood',
				'it was a sockdolager of a good time'
		]
		result = run_map_reduce(sentiment_map, word_count_reduce, docs)
		assert result == [('negative', 3), ('positive', 3)]

#word_count_map("hello is there my there name name is")
#word_count_reduce(['i', [1,1]])

print(sentiment_map('it good was a a terrible terrible good waste of time great great'))