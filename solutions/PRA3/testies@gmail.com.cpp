#include <bits/stdc++.h>

using namespace std;

int main() {
  int t;
  cin >> t;
  while (t--) {
    int n, k;
    cin >> n >> k;
    vector<pair<int, int>> a(n);
    for (int i = 0; i < n; i++)
    {
      cin >> a[i].first >> a[i].second;
    }
    sort(a.begin(), a.end(), [](const auto& a, const auto& b) {
      return a.second > b.second;
    });
    priority_queue<int, vector<int>, greater<int>> pq;
    long long sum = 0, ans = 0;
    for (int i = 0; i < n; i++) {
      pq.push(a[i].first);
      sum += a[i].first;
      if (pq.size() > k) {
        sum -= pq.top();
        pq.pop();
      }
      ans = max(ans, sum*a[i].second);
    }
    cout << ans << '\n';
  }
}