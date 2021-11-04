#include <bits/stdc++.h>
using namespace std;

using ll = long long;

using vi = vector<int>;
#define pb push_back
#define all(x) begin(x), end(x)
#define sz(x) (int)(x).size()

using pi = pair<int, int>;
#define f first
#define s second
#define mp make_pair

void setIO(string name = "") {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    if (sz(name)) {
        freopen((name + ".in").c_str(), "r", stdin);
        freopen((name + ".out").c_str(), "r", stdout);
    }
}

ll gcd(ll a, ll b) {
    return b ? gcd(b, a%b) : a;
}

ll digitSum(ll n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

int main() {
    setIO();
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        ll n;
        cin >> n;
        for (int i = 0; i < 3; i++)
        {
            if (gcd(n, digitSum(n)) > 1) {
                cout << n << "\n";
                break;
            }
            n++;
        }
    }
}