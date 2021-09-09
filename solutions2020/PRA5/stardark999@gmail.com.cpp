#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
#define INF (1000000000ll * 1000000000ll)

using namespace std;

vector<long long> pwv;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    long long cnt = 0;
    for (long long i = 2; i <= 1000000; i++) {
        long long pv = i * i * i;
        for (int j = 3; ; j++) {
            long long srv = roundl(sqrtl(pv));
            if (srv * srv != pv) pwv.push_back(pv);
            if (log2(pv) + log2(i) >= 60) break;
            pv *= i;
        }
    }
    sort(pwv.begin(), pwv.end());
    pwv.erase(unique(pwv.begin(), pwv.end()), pwv.end());
    while (n--) {
        long long l, r; cin >> l >> r;
        long double dl = powl(l - 1, 0.5), dr = powl(r, 0.5);
        long long ans = (long long) dr - (long long) dl;
        ans += lower_bound(pwv.begin(), pwv.end(), r + 1) - pwv.begin();
        ans -= lower_bound(pwv.begin(), pwv.end(), l) - pwv.begin();
        cout << ans << endl;
    }
    return 0;
}
