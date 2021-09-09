#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int an[1000];
    for (int i = 0; i < n; i++)
    {
        int a[3];
        cin >> a[0] >> a[1] >> a[2];
        sort(a, a + 3);
        an[i] = a[1];
    }
    for (int i = 0; i < n; i++)
    {
        cout << an[i] << endl;
    }
}
