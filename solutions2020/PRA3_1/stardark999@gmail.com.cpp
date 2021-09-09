#include <iostream>
#include <queue>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int k, m; cin >> k >> m;
        priority_queue<long long> pq;
        for (int i = 0; i < m; i++) {
            int l; cin >> l;
            pq.push(-l);
        }
        long long ans = 0;
        while (pq.size() >= 2) {
            int x1 = -pq.top(); pq.pop();
            int x2 = -pq.top(); pq.pop();
            ans += x1 + x2;
            pq.push(-x1 - x2);
        }
        cout << ans << endl;
    }
    return 0;
}
