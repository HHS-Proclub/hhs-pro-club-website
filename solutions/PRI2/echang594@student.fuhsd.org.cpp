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

int numSyllables(string s) {
    int num = 0;
    for (int i = 0; i < sz(s); i++) {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
            num++;
        }
    }
    return num;
}

int main() {
    setIO();
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        int one = 0, zero = 0, streak = 0;
        for (int i = 0; i < sz(s); i++)
        {
            if (s[i] == '0') {
                zero++;
                streak++;
            } else {
                one++;
                streak = 0;
            }
        }
        if (one == 1) {
            cout << zero << '\n';
        }
        else if (streak) {
            cout << 2*zero-streak+one+1 << '\n';
        } else {
            cout << 2*zero+one+1 << '\n';
        }
    }
}