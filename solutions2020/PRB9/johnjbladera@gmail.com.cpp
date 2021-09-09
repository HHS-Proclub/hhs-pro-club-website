#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    vector<int> arr;
    for (int x = 19; arr.size() < 10000; x++) {
        int sum = 0;
        int t = x;
        while (t > 0) {
            int d = t % 10;
            sum += d;
            t -= d;
            t /= 10;
            if (sum > 10)
                break;
        }
        if (sum == 10)
            arr.push_back(x);
    }

    int n;
    cin >> n;
    while (n-- > 0) {
        int a;
        cin >> a;
        cout << arr[a - 1] << '\n';
    }
    return 0;
}