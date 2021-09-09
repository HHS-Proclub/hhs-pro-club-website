#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int x[3], y[3];
        for (int i = 0; i < 3; i++) cin >> x[i] >> y[i];
        sort(x, x + 3);
        sort(y, y + 3);
        cout << x[2] - x[0] + y[2] - y[0] + 1 << endl;
    }
    return 0;
}
