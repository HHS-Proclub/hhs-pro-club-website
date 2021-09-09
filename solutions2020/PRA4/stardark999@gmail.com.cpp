#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int m; cin >> m;
        int a[m], tot = 0;
        for (int i = 0; i < m; i++) {
            char c; cin >> c;
            a[i] = c - '0';
            tot += a[i];
        }
        bool ans = 0;
        for (int i = 2; i <= tot; i++) {
            if (tot % i == 0) {
                int des = tot / i, cur = 0, use = 0;
                bool good = 1;
                for (int j = 0; j < m && good; j++) {
                    cur += a[j];
                    if (cur == des) {
                        cur = 0;
                        use++;
                    } else if (cur > des) good = 0;
                }
                if (good && use == i) {
                    ans = 1; break;
                }
            }
        }
        cout << (ans ? "YES" : "NO") << endl;
    }
    return 0;
}
