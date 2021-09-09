#include <iostream>
using namespace std;
int numCases,N, sol = 1;
int A[100000];
int power (int k) {
	int num = 1;
	for (int i = 0; i < k; i++) {
		num *= 2;
	}
	return num;
}

int main() {
	for (int i = 1; i <= 10000; i++) {
		A[i] = (power(i)-1)*power(i-1);
	}
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++) {
		int i = 1;
		cin >> N;
		while (A[i] <= N) {
			if (N%A[i] == 0) {
				sol = A[i];
			}
			i++;
 		}
		cout << sol << endl;
	}
}
