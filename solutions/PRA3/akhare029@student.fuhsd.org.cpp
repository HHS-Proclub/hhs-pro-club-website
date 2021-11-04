#include <bits/stdc++.h>
using namespace std;

struct Song {
  long long t;
  long long b;
  bool operator < (Song other) const {
  	if(b != other.b) {
  	  return b > other.b;
  	} else {
  	  return t > other.t;
  	}
  }
};

int const NMAX = 300000;
int testCases;
int n, k;
Song s[1 + NMAX];

int main() {
	cin >> testCases;
	for(int i = 1; i <= testCases; i++) {
	  cin >> n >> k;
	  for(int j = 1; j <= n; j++) {
	  	cin >> s[j].t >> s[j].b;
	  }
	  sort(s+1, s+n+1);
	  set<long long> topK;
	  long long ans = 0;
	  long long sum = 0;
	  for(int j = 1; j <= k; j++) {
	  	topK.insert(s[j].t);
	  	sum += s[j].t;
	  	ans = max(ans, 1LL * s[j].b * sum);
	  }
	  for(int j = k+1; j <= n; j++) {
	  	if(s[j].t > *topK.begin()) {
	  	  sum += (s[j].t - *topK.begin());
	  	  topK.erase(topK.begin());
	  	  topK.insert(s[j].t);
	  	  ans = max(ans, s[j].b * sum);
	  	}
	  }
	  cout << ans << "\n";
	}
	return 0;
}