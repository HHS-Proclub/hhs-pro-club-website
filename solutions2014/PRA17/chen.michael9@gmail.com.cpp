#include <iostream>
#include <fstream>
using namespace std;

bool isLeap(int y)
{
    if (y % 4 == 0 && (y % 100 != 100 || y % 400 == 0))
        return true;
    return false;
}

int nextYear(int y)
{
    int year = y + 1;
    int d = 0;
    if (isLeap(year))
        d += 2;
    else
        d += 1;
    while (d != 0)
    {
        if (isLeap(year)) d += 2;
        else d+= 1;
        year += 1;
        d = d % 7;
    }
    return year;
}

int main()
{
    int n;
    cin >> n;
    int years[1000];
    for (int i = 0; i < n; i++)
    {
        cin >> years[i];
    }
    for (int i = 0; i < n; i++)
    {
        cout << nextYear(years[i])<< endl;
    }
}
