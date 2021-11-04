#include<iostream>
#include<math.h>

using namespace std;

long long gcd(long long a, long long b) {
    if (!a)
        return b;
    // cout << a << endl;
    return gcd(b % a, a);
}

long long sumOfDigits(long long n) {
    long long numDigits = ceil(log10(n));
    long long sumOfDigits = 0;
    for(long long i = numDigits; i >= 0; i--) {
        long long power = (long long) (pow(10, numDigits - i));
        int digit = n / power;
        sumOfDigits += (digit % 10);
    }
    return sumOfDigits;
}

int main() {
    int count;
    scanf("%i\n", &count);

    while(count > 0) {
        long long num;
        scanf("%lld\n", &num);
        long long numDigits = ceil(log10(num));
        long long sum = sumOfDigits(num);
        if(num % 3 == 0) {
            cout << num << endl;
            break;
        }
        cout << (long long)(ceil(num / 3)) % 3 + num << endl;
        // while(1) {
        //     if(gcd(num, sum) != 1) {
        //         cout << num << endl;
        //         break;
        //     } else {
        //         sum = sumOfDigits(++num);
        //     }
        // }
        --count;
    }
    return 0;
}