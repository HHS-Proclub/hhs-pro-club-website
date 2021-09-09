#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int d, bc, cc; cin >> d >> bc >> cc;
        int id[d];
        for (int i = 0; i < d; i++) cin >> id[i];
        bool good = 1;
        int ans = 0;
        for (int i = 0; 2 * i < d; i++) {
            int j = d - 1 - i;
            if (i == j) {
                if (id[i] == 2) ans += min(bc, cc);
            } else {
                if (id[i] != 2 && id[j] != 2) {
                    if (id[i] != id[j]) good = 0;
                } else if (id[i] == 2 && id[j] == 2) ans += 2 * min(bc, cc);
                else if (id[i] == 2) ans += (id[j] == 0 ? bc : cc);
                else ans += (id[i] == 0 ? bc : cc);
            }
        }
        cout << (good ? ans : -1) << endl;
    }
    return 0;
}
