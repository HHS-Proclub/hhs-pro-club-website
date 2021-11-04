#include <bits/stdc++.h>
using namespace std;


int const NMAX = 100;
int t;
int n;
int x[1 + NMAX], d[1 + NMAX];


int main() {
  cin >> t;
  for(int tc = 1; tc <= t; tc++) {
          cin >> n;
          for(int i = 1; i <= n; i++) {
            cin >> x[i] >> d[i];   
          }
          bool ans = false;
          for(int i = 1; i <= n; i++) {
            for(int j = i+1; j <= n; j++) {
                    if(x[i] + d[i] == x[j] && x[i] == x[j] + d[j]) {
                      ans = true;
                    }
            }
          }
          if(ans == true) {
            cout << "YES\n";
          } else {
            cout << "NO\n";
          }
  }
}