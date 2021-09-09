#include <iostream>
#include <cmath>
using namespace std;

int solve(int n)
{
    if (n % 2 == 0)
        return 2;
    else
    {
        double squareRoot = sqrt(n);
        for (int i = 3; i < squareRoot; i++)
        {
            if (n % i == 0) return i;
        }
        return -1;
    }
}

int main()
{
    int n;
    cin >> n;
    int y = solve(n);
    if (y == -1)
        cout << -1;
    else
        cout << n / y << endl << y;
}
