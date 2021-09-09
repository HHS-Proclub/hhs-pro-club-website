#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int w, l; cin >> w >> l;
        int a[w - 1]; for (int i = 0; i < w - 1; i++) cin >> a[i];
        int ans = 1000000001, cur = 0;
        for (int i = 0; i < w - 1; i++) {
            if (i >= l) cur -= a[i - l];
            cur += a[i];
            if (i >= l - 1) ans = min(ans, cur);
        }
        cout << ans << endl;
    }
    return 0;
}
