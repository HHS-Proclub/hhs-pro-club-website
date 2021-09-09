#include <iostream>
using namespace std;

int main()
{
    string str;
    cin >> str;
    bool b = true;
    int n = str.length();
    for (int i = 0; i < n / 2; i++)
    {
        if (str[i] != str[n - i - 1]) b = false;
    }
    if (b)
        cout << "true";
    else
        cout << "false";
}
