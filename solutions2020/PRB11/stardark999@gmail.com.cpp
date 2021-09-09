#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int a, m, k; cin >> a >> m >> k;
        int b[a], d[a - 1];
        for (int i = 0; i < a; i++) cin >> b[i];
        sort(b, b + a);
        for (int i = 0; i < a - 1; i++) d[i] = b[i + 1] - b[i];
        sort(d, d + a - 1);
        int ans = k;
        for (int i = 0; i < a - k; i++) ans += d[i];
        cout << ans << endl;
    }
    return 0;
}
