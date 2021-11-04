#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int t;
    cin >> t;
    ++t;
    while (--t) {
        string s;
        cin >> s;
        int cnt = 0;
        for (char i: s) {
            if (i < 91) {
                ++cnt;
            }
        }
        if (cnt > (s.length() - cnt)) {
            for (char &i: s) {
                if (i > 96) {
                    i -= 32;
                }
            }
        } else {
            for (char &i: s) {
                if (i < 91) {
                    i += 32;
                }
            }
        }
        cout << s << '\n';
    }

    return 0;
}