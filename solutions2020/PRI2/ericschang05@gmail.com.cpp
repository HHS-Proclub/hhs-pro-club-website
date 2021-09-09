#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    for(int i = 0; i < n; i++)
    {
        int m;
        string str, str2;
        bool used = false;
        cin >> m >> str;
        for(int j = 0; j < 9; j++)
        {
            char c;
            cin >> c;
            str2 += c;
        }
        for(int j = 0; j < m; j++)
        {
            if(str2[str[j]-'1'] >= str[j])
            {
                str[j] = str2[str[j]-'1'];
                used = true;
            }
            else if(used)
            {
                break;
            }
        }
        cout << str << endl;
    }
    return 0;
}
