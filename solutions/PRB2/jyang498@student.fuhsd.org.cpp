#include <iostream>

using namespace std;

int main() {
    std::cin.tie(nullptr);
    std::ios_base::sync_with_stdio(false);

    int t;
    cin >> t;
    ++t;
    string tmp;
    getline(cin, tmp);
    while (--t) {
        string s1, s2, s3;
        getline(cin, s1);
        getline(cin, s2);
        getline(cin, s3);

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for (char i: s1) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                ++cnt1;
            }
        }
        for (char i: s2) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                ++cnt2;
            }
        }
        for (char i: s3) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                ++cnt3;
            }
        }
        if (cnt1 == 5 && cnt2 == 7 && cnt3 == 5) {
            cout << "YES" << '\n';
        } else {
            cout << "NO" << '\n';
        }
    }

    return 0;
}