#include <bits/stdc++.h>

using namespace std;

long long t;
long long n;

long long sumDigits(long long n) {
  string s = to_string(n);
  long long ret = 0;
  for(long long i = 0; i < s.length(); i++) {
    ret += (s[i] - '0');
  }
  return ret;
}

long long gcd(long long a, long long b) {
  if(b == 0) {
    return a;
  }
  return gcd(b, a%b);
}

int main() {
  cin >> t;
  for(long long i = 1; i <= t; i++) {
    cin >> n;
    long long x1 = gcd(n, sumDigits(n));
    long long x2 = gcd(n+1, sumDigits(n+1));
    long long x3 = gcd(n+2, sumDigits(n+2));
    if(x1 > 1) {
      cout << n << "\n";
    } else if(x2 > 1) {
      cout << n+1 << "\n";
    } else {
      cout << n+2 << "\n";
    }
  }
}
