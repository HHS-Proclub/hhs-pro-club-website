#include <iostream>
#define MOD 1000000009

using namespace std;

long long pow(long long x, int p) {
    if (p == 0) return 1;
    if (p % 2) return pow(x, p - 1) * x % MOD;
    long long y = pow(x, p / 2);
    return y * y % MOD;
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int a, m, k; cin >> a >> m >> k;
        if (a - a / k >= m) cout << m << endl;
        else {
            int blocks = m - (a - a / k);
            cout << (((pow(2, blocks + 1) - 2 + MOD) % MOD * k % MOD + m) % MOD - blocks * k % MOD + MOD) % MOD << endl;
        }
    }
    return 0;
}
