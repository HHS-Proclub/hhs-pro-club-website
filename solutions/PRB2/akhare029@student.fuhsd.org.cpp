#include <bits/stdc++.h>

using namespace std;

int t;
string s1, s2, s3;

int computeVowels(string s) {
  int ret = 0;
  for(int i = 0; i < s.length(); i++) {
    ret += (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u');
  }
  return ret;
}

int main() {
  cin >> t;
  for(int i = 1; i <= t; i++) {
    getline(cin >> ws, s1);
    //cout << "here1\n";
    getline(cin >> ws, s2);
    //cout << "here2\n";
    getline(cin >> ws, s3);
    //cout << "here3\n";
    int a, b, c;
    a = computeVowels(s1);
    b = computeVowels(s2);
    c = computeVowels(s3);
    if(a == 5 && b == 7 && c == 5) {
      cout << "YES\n";
    } else {
      cout << "NO\n";
    }
  }
}
