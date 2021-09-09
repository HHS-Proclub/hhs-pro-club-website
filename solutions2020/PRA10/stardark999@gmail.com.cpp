#include <iostream>

using namespace std;

int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int a; cin >> a;
        int g, m = 0;
        for (int i = 0; i < a; i++) {
            int x; cin >> x;
            if (i == 0) g = x;
            else g = gcd(g, x);
            m = max(m, x);
        }
        cout << ((m / g - a) % 2 ? "Luke" : "Morgan") << endl;
    }
    return 0;
}
