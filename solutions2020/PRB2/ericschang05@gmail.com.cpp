#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    for(int i = 0; i < n; i++)
    {
        int m, k = 0;
        cin >> m;
        int room[m];
        for(int j = 0; j < m; j++)
        {
            cin >> room[j];
        }
        for(int j = 1; j < m - 1; j++)
        {
            if(room[j] == 0 && room[j-1] == 1 && room[j+1] == 1)
            {
                k++;
                room[j+1] = 0;
            }
        }
        cout << k << endl;
    }
    return 0;
}
