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
        freopen((name + ".out").c_str(), "w", stdout);
    }
}

bool valid(int n, int v, int k) {
    int lines = 0, p = 0;
    while (v >= pow(k, p))
    {
        lines += (int)(v/pow(k, p));
        p++;
    }
    return lines >= n;
}

int main() {
    setIO();
    int t;
    cin >> t;
    while (t--)
    {
        int n, k;
        cin >> n >> k;
        int l = 0, r = 1e9;
        while (l < r) {
            int m = l+(r-l)/2;
            if (valid(n, m, k)) {
                r = m;
            } else {
                l = m+1;
            }
        }
        cout << l << '\n';
    }
}