#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int i; cin >> i;
    while (i--) {
        int n, d; cin >> n >> d;
        int m; cin >> m;
        while (m--) {
            int x, y; cin >> x >> y;
            if (x + y <= 2 * n - d && x + y >= d && y - x >= -d && y - x <= d) cout << "YES\n";
            else cout << "NO\n";
        }
    }
    return 0;
}
