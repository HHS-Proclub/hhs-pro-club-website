#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    for(int i = 0; i < n; i++)
    {
        string special;
        cin >> special;
        int cnt = 0;
        bool magic = true;
        while(cnt < special.size())
        {
            if(special[cnt] != '1')
            {
                magic = false;
                break;
            }
            if(special[cnt+1] == '4' && special[cnt+2] == '4')
            {
                cnt += 3;
            }
            else if(special[cnt+1] == '4')
            {
                cnt += 2;
            }
            else
            {
                cnt++;
            }
        }
        if(magic)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }
    return 0;
}
