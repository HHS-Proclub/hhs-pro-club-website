#include <iostream>
#include <cassert>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int a; cin >> a;
    while (a--) {
        int n, b; cin >> n >> b;
        long long h[n]; for (int i = 0; i < n; i++) cin >> h[i];
        long long ans = 1000000000;
        for (int i = 0; i < (1 << n); i++) {
            long long tot = 0;
            for (int j = 0; j < n; j++) if (i & (1 << j)) tot += h[j];
            if (tot >= b) ans = min(ans, tot - b);
        }
        cout << ans << endl;
    }
    return 0;
}
