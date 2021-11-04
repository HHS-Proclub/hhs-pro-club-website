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
    cin.ignore();
    while (t--)
    {
        string s1, s2, s3;
        getline(cin, s1);
        getline(cin, s2);
        getline(cin, s3);
        if (numSyllables(s1) == 5 && numSyllables(s2) == 7 && numSyllables(s3) == 5) {
            cout << "YES\n";
        }
        else {
            cout << "NO\n";
        }
    }
}