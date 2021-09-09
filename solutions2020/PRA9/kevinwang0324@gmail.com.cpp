#include <iostream>
#include <cmath>
using namespace std;

#define INF 1000000000

int a, n, b;
int h[25];
int sum, best = INF;

int main () {
    cin >> a;

    for (int y = 0; y < a; y++) {
        cin >> n >> b;
        for (int i = 0; i < n; i++)
            cin >> h[i];

        for (int i = 0; i < (1 << n); i++) {
            sum = 0;

            for (int j = 0; j < n; j++)
                if (i & (1 << j))
                    sum += h[j];

            if (sum >= b && sum < best) {
                best = sum;
            }
        }

        cout << abs(best - b) << endl;
        best = INF;
    }
}
