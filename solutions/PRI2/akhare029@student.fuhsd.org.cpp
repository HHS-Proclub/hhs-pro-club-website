#include <bits/stdc++.h>

using namespace std;

int t;
string s;

void add1(string &s) {
  int pos = s.length()-1;
  while(pos >= 0 && s[pos] == '1') {
    s[pos] = '0';
    pos--;
  }
  if(pos == -1) {
    s = '1' + s;
  } else {
    s[pos] = '1';
  }
}

int solve() {
  int ans = 0;
  while(s.length() > 1) {
    if(s[s.length()-1] == '1') {
      add1(s);
    } else {
      s.erase(s.end()-1);
    }
    ans++;
  }
  return ans;
}

int main() {
  cin >> t;
  for(int i = 1; i <= t; i++) {
    cin >> s;
    int ans = solve();
    cout << ans << "\n";
  }
}
