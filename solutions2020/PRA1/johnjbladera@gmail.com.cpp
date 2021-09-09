#include <bits/stdc++.h>

using namespace std;

int A[10000];
int S = 0;

int rec(int x) {
    int a = x + 1;
    bool dig[10] = {false};
    while (a > 0) {
        int d = a % 10;
        if (dig[d])
            return A[x] = rec(x + 1);
        dig[d] = true;
        a -= d;
        a /= 10;
    }
    S = x;
    return A[x] = x + 1;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    for (int x = 1000; x <= 9000; x++) {
        rec(x);
        x = S;
    }
    int n;
    cin >> n;
    while (n-- > 0) {
        int a;
        cin >> a;
        cout << A[a] << '\n';
    }

    return 0;
}