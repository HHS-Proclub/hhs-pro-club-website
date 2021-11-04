#include <bits/stdc++.h>

using namespace std;

int const NMAX = 1e9;
int t;
int n, k;

bool works(int guess) {
  int sum = 0;
  int val = guess;
  while(val > 0) {
    sum += val;
    val /= k;
  }
  //cout << guess << " " << sum << "\n";
  return (sum >= n);
}

int binarysearch(int from, int to) {
  if(from < to) {
    int guess = (from + to)/2;
    if(works(guess)) {
      return binarysearch(from, guess);
    } else {
      return binarysearch(guess+1, to);
    }
  }
  return from;
}

int main() {
  cin >> t;
  for(int i = 1; i <= t; i++) {
    cin >> n >> k;
    int v = binarysearch(1, NMAX);
    cout << v << "\n";
  }
}
