#include <bits/stdc++.h>

using namespace std;

int main() {
  int t;
  cin >> t;
  while (t--) {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++)
    {
      cin >> a[i];
    }
    int cnt = 0;
    for (int i = 1; i < a.size()-1; i++)
    {
      if (a[i-1] == 1 && a[i] == 0 && a[i+1] == 1) {
        a[i+1] = 0;
        cnt++;
      }
    }
    cout << cnt << '\n';
  }
}