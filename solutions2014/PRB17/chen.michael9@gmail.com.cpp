#include <iostream>
#include <fstream>
#include <algorithm>
using namespace std;

long gcd(long a, long b)
{
    long r;
    while (b != 0)
    {
        r = a % b;
        a = b;
        b = r;
    }
    return a;
}

int main()
{
    long n1, d1, n2, d2;
    cin >> n1 >> d1 >> n2 >> d2;
    long d = d1 * d2;
    long n = n1 * d2 + n2 * d1;
    long x = gcd(d, n);
    cout << n / x << " " << d / x << endl;
    return 0;
}

