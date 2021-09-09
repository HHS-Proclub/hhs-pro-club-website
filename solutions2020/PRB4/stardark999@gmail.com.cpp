#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int m; cin >> m;
        int minv = 1000000001, maxv = -minv;
        long long ans = 0;
        for (int i = 0; i < m; i++) {
            int x; cin >> x;
            minv = min(minv, x);
            maxv = max(maxv, x);
            ans += abs(x);
        }
        cout << (m == 1 ? minv : (minv > 0 ? ans - 2 * minv : (maxv < 0 ? ans + 2 * maxv : ans))) << endl;
    }
    return 0;
}
