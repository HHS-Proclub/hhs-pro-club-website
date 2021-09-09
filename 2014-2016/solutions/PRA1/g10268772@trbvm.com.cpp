#include <iostream>
using namespace std;
#define ll int

bool isPrime(ll n) {
	for (ll i = 2; i < n; i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
}
int main() {
	ll n;
	cin >> n;
	ll product = 1;
	for (int i = 1; i < n; i++) {
		if (isPrime(i)) {
			product *= i;
		}
	}
	//base 8
	string result;
	while (product > 0)  //number in base 10
	{
		result = to_string(product%8) + result;  //its not arithemtical "+" dont forget
		product = product/8;
	}
	cout << result << endl;
}