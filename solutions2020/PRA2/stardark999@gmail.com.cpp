#include <iostream>
#include <vector>

using namespace std;

vector<int> primes;

bool isPrime(int x) {
    int cnt = 0;
    for (int i = 0; i < primes.size(); i++) {
        while (x % primes[i] == 0) {
            x /= primes[i];
            cnt++;
        }
    }
    if (x != 1) cnt++;
    return cnt == 1;
}

bool prime[1000];

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    for (int i = 2; i < 1000; i++) {
        if (prime[i]) continue;
        primes.push_back(i);
        for (int j = 2 * i; j < 1000; j += i) prime[j] = 1;
    }
    int n; cin >> n;
    while (n--) {
        string a; cin >> a;
        int x1 = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            x1 *= 10;
            x1 += a[i] - '0';
        }
        int x2 = 0;
        for (int i = 0; i < a.length(); i++) {
            x2 *= 10;
            x2 += a[i] - '0';
        }
        cout << (isPrime(x1) && isPrime(x2) && x1 != x2 ? "YES" : "NO") << endl;
    }
    return 0;
}
