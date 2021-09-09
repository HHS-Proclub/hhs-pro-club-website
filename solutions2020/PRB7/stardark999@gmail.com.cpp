#include <iostream>
#include <cmath>
#define EPS 1e-9

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        long double a, b; scanf("%Le %Le", &a, &b);
        long double pq = cbrt(a * b);
        bool good = false;
        if (pq - floor(pq) < EPS) {
            long double p = a / pq, q = b / pq;
            if (p - floor(p) < EPS && q - floor(q) < EPS) good = true;
        }
        printf(good ? "Yes\n" : "No\n");
    }
    return 0;
}
