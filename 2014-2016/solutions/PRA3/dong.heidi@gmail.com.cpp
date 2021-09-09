#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int p[n];
    int total = 0;
    for (int i=0; i<n; i++) {
        cin >> p[i];
        total += p[i];
    }
    int sum = 0;
    int sideSum = 0;
    for (int i=0; i<n; i++) {
        sum = (total-p[i])/2;
        sideSum += i>0 ? p[i-1] : 0;
        if (sideSum==sum) {
            cout << i;
        }
    }
}
