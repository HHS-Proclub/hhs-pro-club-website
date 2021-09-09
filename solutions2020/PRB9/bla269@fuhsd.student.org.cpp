#include <iostream>
#include <algorithm>
using namespace std;
long long numCases, n, k, A, B;
long long ans;
void recur(long long numCoins, long long value) {
	if (value == 1) {
		ans = min(ans,numCoins);
		return;
	}
	if (numCoins < ans) {
		if (value%k == 0) {
		recur(numCoins+B,value/k);
	}
		recur(numCoins+A,value-1);
	} else {
		return;
	}
	
} 
int main () {
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++) {
		cin >> n >> k >> A >> B;
		ans = n*A;
		recur(0,n);
		cout << ans << endl;
	}
}
