#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int m; cin >> m;
        int a[m]; for (int i = 0; i < m; i++) cin >> a[i];
        bool g[m][m];
        int deg[m]; for (int i = 0; i < m; i++) deg[i] = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                for (int k = 1; k < 31; k++) if (a[i] + a[j] == (1 << k)) {
                    g[i][j] = g[j][i] = 1;
                    break;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) if (j != i && g[i][j]) deg[i]++;
            if (deg[i] == 0) ans++;
        }
        cout << ans << endl;
    }
    return 0;
}
