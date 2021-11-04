#include <bits/stdc++.h>

using namespace std;

int dfs(int u, vector<int>& gold, vector<vector<int>>& adj, vector<bool>& visited) {
  visited[u] = true;
  int mini = gold[u];
  for (int v : adj[u]) {
    if (!visited[v]) {
      mini = min(mini, dfs(v, gold, adj, visited));
    }
  }
  return mini;
}

int main() {
  int t;
  cin >> t;
  while (t--) {
    int n, m;
    cin >> n >> m;
    vector<int> gold(n);
    for (int i = 0; i < n; i++) {
      cin >> gold[i];
    }
    vector<vector<int>> adj(n);
    for (int i = 0; i < m; i++) {
      int x, y;
      cin >> x >> y;
      adj[--x].push_back(--y);
      adj[y].push_back(x);
    }
    vector<bool> visited(n);
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        ans += dfs(i, gold, adj, visited);
      }
    }
    cout << ans << '\n';
  }
}