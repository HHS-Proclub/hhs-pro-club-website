#include <iostream>
using namespace std;

int main()
{
    int n, total = 0;
    cin >> n;
    char ans[n];
    char ans1[n];
    for (int i = 0; i < n; i++)
    {
        cin >> ans[i];
    }
    for (int i = 0; i < n; i++)
    {
        cin >> ans1[i];
    }
    for (int i = 0; i < n; i++)
    {
        if (ans[i] == ans1[i])
            total += 4;
        else
            total -=1;
    }
    cout << total;
}
