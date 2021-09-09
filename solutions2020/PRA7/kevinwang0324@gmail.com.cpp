#include <bits/stdc++.h>
using namespace std;

int main() {
    int a;
    cin >> a;
    for (int i = 0; i < a; i++) {
  unsigned long long n;
  cin >> n;
  string ns = to_string(n);
  bool zero = ns.find("0") != string::npos;
  bool two = ns.find("2") != string::npos;
  bool five = ns.find("5") != string::npos;
  bool seven = ns.find("7") != string::npos;
  bool two_zeros = count(ns.begin(), ns.end(), '0') > 1;
  bool possible = (
    two_zeros or
    (two and five) or
    (five and zero) or
    (seven and five)
  );
  bool solution = false;
  if (!possible) {
    cout << -1 << "\n";
    return 0;
  }
  unordered_set<string> memo;
  memo.insert(ns);
  queue<pair<string, int>> q;
  q.push({to_string(n), 0});
  while (!q.empty()) {
    auto front = q.front();
    q.pop();
    string s = front.first;
    if (s.size() < 2) {
      continue;
    }
    string last = s.substr(s.size() - 2);
    unsigned long long ans = stoull(s);
    if (ans % 25 == 0) {
      cout << front.second << "\n";
      solution = true;
      break;
    } else {
      for (int i = 0; i < s.size() - 1; i++) {
        string sc = s;
        swap(sc[i], sc[i + 1]);
        if (sc[0] != '0' and !memo.count(sc)) {
          q.push({sc, front.second + 1});
          memo.insert(sc);
        }
      }
    }
  }
  if (!solution) {
    cout << -1 << "\n";
  }
    }
}
