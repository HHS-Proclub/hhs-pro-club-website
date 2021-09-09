#include <iostream>

using namespace std;

string str; int n;

int fix_p(int i1, int i2) {
    if (n == 2) return 0;
    int j = 0;
    for (int i = 0; i < n; i++) {
        if (i == i1 || i == i2) continue;
        if (str[i] - '0' != 0) return j;
        j++;
    }
    return 1000000000;
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int nn; cin >> nn;
    while (nn--) {
        cin >> str;
        int ind[10][2];
        for (int i = 0; i < 10; i++) ind[i][0] = ind[i][1] = -1;
        n = str.length();
        for (int i = 0; i < n; i++) {
            ind[str[i] - '0'][1] = ind[str[i] - '0'][0];
            ind[str[i] - '0'][0] = i;
        }
        int ans = 1000000000;
        if (ind[0][1] != -1) {
            ans = min(ans, n - 1 - ind[0][0] + n - 2 - ind[0][1] + fix_p(ind[0][0], ind[0][1]));
        }
        if (ind[2][0] != -1 && ind[5][0] != -1) {
            int x = n - 1 - ind[5][0], y = n - 2 - ind[2][0];
            if (ind[5][0] < ind[2][0]) y++;
            ans = min(ans, x + y + fix_p(ind[5][0], ind[2][0]));
        }
        if (ind[0][0] != -1 && ind[5][0] != -1) {
            int x = n - 1 - ind[0][0], y = n - 2 - ind[5][0];
            if (ind[0][0] < ind[5][0]) y++;
            ans = min(ans, x + y + fix_p(ind[5][0], ind[0][0]));
        }
        if (ind[7][0] != -1 && ind[5][0] != -1) {
            int x = n - 1 - ind[5][0], y = n - 2 - ind[7][0];
            if (ind[5][0] < ind[7][0]) y++;
            ans = min(ans, x + y + fix_p(ind[5][0], ind[7][0]));
        }
        cout << (ans == 1000000000 ? -1 : ans) << endl;
    }
    return 0;
}
