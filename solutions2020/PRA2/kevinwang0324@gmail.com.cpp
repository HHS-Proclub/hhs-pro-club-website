#include <iostream>
#include <cmath>

using namespace std;

bool isPrime (int n) {
    for (int i = 2; i <= sqrt(n); i++) {
        if (n%i==0) return false;
    }
    return true;
}

int reverseNumber(int n) {
    int num = 0;
    while (n > 0) {
        num *= 10;
        num += n % 10;
        n /= 10;
    }
    return num;
}

bool isEmirp(int n) {
    int reverseNum = reverseNumber(n);
    if (isPrime(n) && isPrime(reverseNum) && reverseNum != n) return true;
    return false;
}
int main() {
    int n;
    cin >> n;
    int num[n];


    for (int i = 0; i < n; i++) {
        cin >> num[i];
        if (isEmirp(num[i])) {
            cout << "YES" << endl;
        }

        else {
            cout << "NO" << endl;
        }
    }
}
