#include <iostream>
#include <cstring>

using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int t;
    cin >> t;
    ++t;
    while (--t) {
        int n;
        cin >> n;

        int a[n];
        for (int i = 0; i < n; ++i) {
            cin >> a[i];
        }

        int tmp = n - 1;
        int cnt[n];
        memset(cnt, 0, sizeof cnt);
        for (int i = 1; i < tmp; ++i) {
            if (a[i] == 0 && a[i - 1] == 1 && a[i + 1] == 1) {
                ++cnt[i - 1];
                ++cnt[i + 1];
            }
        }

        int cnt2 = 0;
        tmp = n - 2;
        for (int i = 2; i < tmp; ++i) {
            if (cnt[i] == 2) {
                ++cnt2;
                a[i] = 0;
                cnt[i] = 0;
                --cnt[i - 2];
                --cnt[i + 2];
            }
        }
        for (int i = 0; i < tmp; ++i) {
            if (cnt[i]) {
                ++cnt2;
//                cnt[i] = 0;
                cnt[i + 2] = 0;
            }
        }

        cout << cnt2 << '\n';
    }

    return 0;
}