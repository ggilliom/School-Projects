from main import compare_work
import numpy as np
import pandas as pd
from sklearn.linear_model import LinearRegression

# Get data

def gen_data():
	compare_data = compare_work(lambda n: 1, lambda n: n,
		lambda n: np.log(n)/np.log(2))
	
	# Store
	d = {}
	for i, name in enumerate(["n", "O(1)", "O(n)", "O(logn)"]):
		d[name] = [v[i] for v in compare_data]
		
	df = pd.DataFrame(d)
	df.to_csv("runtime.csv")

def analyze_work():
	df = pd.read_csv("runtime.csv", index_col=0)
	
	print("for a==b==2:")
	# Work for f(n) = 1
	lr = LinearRegression()
	X = df["n"].values[:,None]
	y = df["O(1)"].values
	r2 = lr.fit(X, y).score(X, y)
	print("f(n) = 1 rsquared in n space: {}".format(r2))
	
	# Work for f(n) = logn
	lr = LinearRegression()
	X = df["n"].values[:,None]
	y = df["O(n)"].map(lambda n: n*(np.log(n)/np.log(2))).values
	r2 = lr.fit(X, y).score(X, y)
	print("f(n) = n rsquared in nlogn space: {}".format(r2))
	
	# Work for f(n) = n
	lr = LinearRegression()
	X = df["n"].values[:,None]
	y = df["O(logn)"].map(lambda n: n*(np.log(n)/np.log(2))).values
	r2 = lr.fit(X, y).score(X, y)
	print("f(n) = logn rsquared in nlogn space: {}".format(r2))

def analyze_ab():
	compare_data = compare_work(lambda n: n**2, lambda n: n**4)
	print(compare_data)
	# Store
	d = {}
	for i, name in enumerate(["n", "n^2", "n^4"]):
		d[name] = [v[i] for v in compare_data]
		
	df = pd.DataFrame(d)
	print(df)
	lr = LinearRegression()
	X = df["n"].values[:, None]
	y = df["n^2"].map(lambda n: n**2 * (np.log(n)/np.log(2))).values
	r2 = lr.fit(X, y).score(X, y)
	print("for c == 2 ")
	print("f(n) = n^2 rsquared in n^3 space {}".format(r2))

	

analyze_ab()
