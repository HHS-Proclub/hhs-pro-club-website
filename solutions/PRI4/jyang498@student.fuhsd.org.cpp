#include <iostream>
#include <cstring>

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

        pair<int, int> arr[n];
        for (int i = 0; i < n; ++i) {
            cin >> arr[i].first >> arr[i].second;
        }

        bool ans = false;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i].first + arr[i].second == arr[j].first && arr[j].first + arr[j].second == arr[i].first) {
                    ans = true;
                    break;
                }
            }
            if (ans) {
                break;
            }
        }

        cout << (ans ? "YES" : "NO") << '\n';
    }

    return 0;
}