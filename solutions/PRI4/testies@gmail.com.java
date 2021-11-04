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

int main() {
    setIO();
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vi x(n), d(n);
        for (int i = 0; i < n; i++) {
            cin >> x[i] >> d[i];
        }
        bool flag = false;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i != j && x[i]+d[i] == x[j] && x[j]+d[j] == x[i]) {
                    flag = true;
                    break;
                }
            }
        }
        cout << (flag ? "YES" : "NO") << '\n';
    }
}