#include <bits/stdc++.h>
using namespace std;


long long const NMAX = 1000;
long long t;
long long n;
long long a[1 + NMAX];


int main() {
    cin >> t;
    for(long long tc = 1; tc <= t; tc++) {
      cin >> n;
      for(long long i = 1; i <= n; i++) {
              cin >> a[i];
      }
      sort(a+1, a+n+1);
      long long ans = 0;
      for(long long i = 1; i <= n; i++) {
              ans += ((i-1) * a[n-i+1] + 1);
      }
      cout << ans << "\n";
    }
        return 0;
}