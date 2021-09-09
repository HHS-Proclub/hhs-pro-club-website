#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    if (n % 3 == 0 && n % 5 != 0)
    {
        cout << "buzz";
    }
    else if (n % 3 != 0 && n % 5 == 0)
    {
        cout << "fizz";
    }
    else if (n % 3 == 0 && n % 5 == 0)
    {
        cout << "fizzbuzz";
    }
    else
    {
        cout << n;
    }
}
