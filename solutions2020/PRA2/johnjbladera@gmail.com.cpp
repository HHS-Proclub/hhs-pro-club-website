#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    vector<bool> primes(1000001, true);
    primes[0] = primes[1] = false;
    for (int x = 2; x * x <= primes.size(); x++)
        if (primes[x])
            for (int a = x + x; a < primes.size(); a += x)
                primes[a] = false;

    int n;
    cin >> n;
    while (n-- > 0) {
        int a;
        cin >> a;
        int res = 0, ori = a;
        int dig = (int)log10(a);
        int dec = 1;
        for (int x = 0; x < dig; x++)
            dec *= 10;
        while (a > 0) {
            int d = a % 10;
            res += d * dec;
            dec /= 10;
            a -= d;
            a /= 10;
        }
        cout << (primes[res] && res != ori && primes[ori] ? "YES\n" : "NO\n");
    }
    return 0;
}