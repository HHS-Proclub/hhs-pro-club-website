#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int a, b, c; cin >> a >> b >> c;
        int d[a], e[b]; for (int i = 0; i < a; i++) cin >> d[i];
        for (int j = 0; j < b; j++) cin >> e[j];
        sort(d, d + a); sort(e, e + b);
        long long l = 0, r = 2000000100;
        while (l < r) {
            int ix = 0;
            long long mid = (l + r) / 2;
            bool good = 1;
            for (int i = 0; i < a && good; i++) {
                while (ix < b && abs(d[i] - e[ix]) + abs(e[ix] - c) > mid) ix++;
                if (ix == b) good = 0;
                ix++;
            }
            if (good) r = mid;
            else l = mid + 1;
        }
        cout << l << endl;
    }
    return 0;
}
