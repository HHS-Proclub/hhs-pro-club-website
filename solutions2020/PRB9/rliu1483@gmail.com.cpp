#include <iostream>
using namespace std;

int main() {
	int tests;
	cin >> tests;
	while(tests-->0) {
		unsigned long long num;
		cin >> num;
		cout << 19+9*(num-1) << '\n';
	}
	return 0;
}
