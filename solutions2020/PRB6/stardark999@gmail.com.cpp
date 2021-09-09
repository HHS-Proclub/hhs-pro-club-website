#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int a, b; cin >> a >> b;
        bool stg[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) cin >> stg[i][j];
        }
        int pfx[a][b + 1], pfx2[a + 1][b];
        for (int i = 0; i < a; i++) {
            pfx[i][0] = 0;
            for (int j = 0; j < b; j++) pfx[i][j + 1] = pfx[i][j] + stg[i][j];
        }
        for (int i = 0; i < b; i++) {
            pfx2[0][i] = 0;
            for (int j = 0; j < a; j++) pfx2[j + 1][i] = pfx2[j][i] + stg[j][i];
        }
        int ans = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (stg[i][j]) continue;
                int cl = pfx[i][j], cr = pfx[i][b] - pfx[i][j + 1];
                ans += (cl > 0); ans += (cr > 0);
                int cu = pfx2[i][j], cd = pfx2[a][j] - pfx2[i + 1][j];
                ans += (cu > 0); ans += (cd > 0);
            }
        }
        cout << ans << endl;
    }
    return 0;
}
