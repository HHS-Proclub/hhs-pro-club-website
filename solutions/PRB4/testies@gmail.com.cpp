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
        string st;
        cin >> st;
        int u = 0;
        for (int i = 0; i < sz(st); i++)
        {
            if (st[i] >= 'A' && st[i] <= 'Z') {
                u++;
            }
        }
        transform(all(st), begin(st), [u, st](char c) {
            return (u > sz(st)/2) ? toupper(c) : tolower(c);
        });
        cout << st << '\n';
    }
}