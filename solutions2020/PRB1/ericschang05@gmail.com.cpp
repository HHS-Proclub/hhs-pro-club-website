#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    for(int i = 0; i < n; i++)
    {
        long long a, b;
        cin >> a >> b;
        long long c = a * b;
        cout << c << endl;
    }
    return 0;
}
