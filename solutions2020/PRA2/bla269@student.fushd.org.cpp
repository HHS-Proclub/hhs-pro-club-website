#include <iostream>
#include <algorithm>
using namespace std;

int numCases;
int value, numPrime;
bool checker;
bool isPrime[1000005];
int prime[100000];

int reverse (int x) {
	int rev = 0;
	
	while (x > 0) {
		rev *= 10;
		rev += x%10;
		x /= 10;
	} 
	
	return rev;
}
int main() {
	
	for (int i = 2; i <= 1000000; i++) {
		checker = true;
		for (int j = 0; j < numPrime; j++) {
			if (prime[j]*prime[j] >= i) {
				break;
			}
			if (i%prime[j] == 0) {
					checker = false;
					break;
			}
		}
		if (checker) {
			isPrime[i] = true;
			prime[numPrime] = i;
			numPrime++;
		}
	}
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> value;
		int rev = reverse(value);
		if (value != rev && isPrime[value] && isPrime[rev] && value > 10) {
			cout << "YES" << endl;
		} else {
			cout << "NO" << endl;
		}
	}
}
