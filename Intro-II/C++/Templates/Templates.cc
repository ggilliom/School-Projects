# include <iostream>

using namespace std;

// Templates provide generic functionality
// To declare template functions or classes, we use the following syntax
// template <typename T> void foo(params...){...}
// template <class T> class ClassName {...};
// As per the C++ specifications (14.1.2), "there is no semantic difference
// between class and typename in a template-parameter"

template <typename T> T maximum(T a, T b)
{
	return a < b ? b : a; // if a < b, return b; else, return a (if/else statement)
}

int main()
{
	int i = 3;
	int j = 4;
	cout << "Maximum(" << i << ", " << j << "): " << maximum(i,j) << endl;

	char a = 'a';
	char b = 'b';
	cout << "Maximum(" << a << ", " << b << "): " << maximum(a,b) << endl;

	return 0;
}
