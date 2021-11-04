#include <iostream>
using namespace std;

int const NMAX = 100;
int tests;
int n;
int a[1 + NMAX];

int main() {
	cin >> tests;
	int ans;
	for(int t = 1; t <= tests; t++) {
	  cin >> n;
	  for(int i = 1; i <= n; i++) {
	  	cin >> a[i];
	  }
	  ans = 0;
	  for(int i = 1; i+2 <= n; i++) {
	  	if(a[i] == 1 && a[i+1] == 0 && a[i+2] == 1) {
	  	  a[i+2] = 0;
	  	  ans++;
	  	}
	  }
	  cout << ans << "\n";
	}
	return 0;
}