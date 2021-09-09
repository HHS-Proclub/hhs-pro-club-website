#include <iostream>
#include <algorithm>
using namespace std;
int numCases;
long long n, A[100000], l, r, numZ, numO;
string B;
int main () {
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++) {
		cin >> n;
		for (int i = 0; i < n; i++) {
			cin >> A[i];
		}
		cin >> B;
		numZ = 4;
		for (int i = 4; i < B.length(); i++) {
			if (numZ == 4 && B[i] == '1') {
				for (int j = i-4; j < i; j++) {
					l = max(l,A[j]);
				}
				numZ = 0;
				numO = 0;
			}
			else if (numO == 4 && B[i] == '0') {
				for (int j = i-4; j < i; j++) {
					r = min(r,A[j]);
				}
				numZ = 0;
				numO = 0;
			}
			
			if (B[i] == '1') {
				numO++;
				numZ = 0;
			} else {
				numZ++;
				numO = 0;
			}
		}
		cout << l << " " << r << endl;
	}
	
}
