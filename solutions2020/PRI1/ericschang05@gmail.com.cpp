#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    for(int i = 0; i < n; i++)
    {
        int b, s, h;
        cin >> b >> s >> h;
        if(s < h)
        {
            swap(s, h);
        }
        cout << b - h + 1 << endl;
    }
    return 0;
}
