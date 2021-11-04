#include <bits/stdc++.h>
using namespace std;

long long const CMAX = 1000000000;
long long const NMAX = 100000;
long long tests;
long long n, m;
long long c[1 + NMAX];
bool vis[1 + NMAX];
vector<long long> g[1 + NMAX];
long long ans;
long long minCost;

void dfs(long long from) {
  vis[from] = true;
  minCost = min(minCost, c[from]);
  for(long long i = 0; i < g[from].size(); i++) {
  	long long to = g[from][i];
  	if(vis[to] == false) {
  	  dfs(to);
  	}
  }
}

int main() {
  cin >> tests;
  long long ans;
  for(long long t = 1; t <= tests; t++) {
    cin >> n >> m;
    for(long long i = 1; i <= n; i++) {
      cin >> c[i];
	  vis[i] = false;
	  g[i].clear();
	}
	for(long long i = 1; i <= m; i++) {
	  long long a, b;
	  cin >> a >> b;
	  g[a].push_back(b);
	  g[b].push_back(a);
	}
	ans = 0;
	for(long long i = 1; i <= n; i++) {
	  if(vis[i] == false) {
	  	minCost = CMAX;
	  	dfs(i);
	  	ans += 1LL * minCost;
	  }
	} 
	cout << ans << "\n";
  }
  return 0;
}