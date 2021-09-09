#include <iostream>
using namespace std;

int main()
{
    int count1 = 0;
    int length;
    string str;
    cin >> length;
    cin >> str;
    char c = str[0];
    int current = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] != c || (i == str.length() - 1 && str[i] != c))
        {
            c = str[i];
            if (current > count1) count1 = current;
            current = 1;
        }
        else if (i == str.length() - 1 && str[i] == c)
        {
            current++;
            if (current > count1) count1 = current;
        }
        else
        {
            current++;
        }
    }
    cout << count1;
}
