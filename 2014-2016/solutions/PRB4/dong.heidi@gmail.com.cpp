#include <iostream>

using namespace std;

long long fact(int n);

int main() {
    int sum = 0;
    int n;
    for (int i=0; i<4; i++) {
        cin >> n;
        sum += n;
    }
    cout << fact(sum) << endl;
}

long long fact(int n) {
    if (n==1) return n;
    return n*fact(n-1);
}
