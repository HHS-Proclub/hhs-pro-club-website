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
        int n;
        cin >> n;
        int as[n];
        for (int i = 0; i < n; ++i) {
            cin >> as[i];
        }
        sort(as, as + n);
        long long sum = 0;
        int cnt = 0;
        for (int i = n - 1; i >= 0; --i) {
            sum += ((as[i] * cnt) + 1);
            ++cnt;
        }
        cout << sum << '\n';
    }

    return 0;
}