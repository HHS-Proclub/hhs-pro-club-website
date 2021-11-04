#include <iostream>

long long gcd(long long a, long long b) {
    return b == 0 ? a : gcd(b, a % b);
}

int main() {
    std::cin.tie(nullptr);
    std::ios_base::sync_with_stdio(false);

    int t;
    std::cin >> t;
    ++t;
    while (--t > 0) {
        long long x;
        std::cin >> x;
        long long n = x, sum = 0, m;
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            n /= 10;
        }
        while (gcd(x, sum) == 1) {
            ++x;
            n = x, sum = 0;
            while (n > 0) {
                m = n % 10;
                sum = sum + m;
                n /= 10;
            }
        }
        std::cout << x << '\n';
    }
    return 0;
}