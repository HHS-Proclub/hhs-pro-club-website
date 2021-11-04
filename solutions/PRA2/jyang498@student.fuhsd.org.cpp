#include <iostream>

using namespace std;

#pragma GCC optimize("Ofast")
#pragma GCC target("avx,avx2,fma")

int test(int v, int k) {
    int sum = 0, tmp = v;
    while (tmp > 0) {
        sum += tmp;
        tmp /= k;
    }
    return sum;
}

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int t;
    cin >> t;
    ++t;
    while (--t) {
        int n, k;
        cin >> n >> k;

        int min = 0, max = n;
        while (min <= max) {
            int mid = (min + max) / 2;

            if (test(mid, k) >= n) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        cout << min << '\n';
    }

    return 0;
}