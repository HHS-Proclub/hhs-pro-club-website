#include <iostream>
using namespace std;

int main()
{
    int N;
    cin >> N;
    int score = 0;
    char a[1000];
    char b[1000];
    for (int i = 0; i < N; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < N; i++)
    {
        cin >> b[i];
    }
    for (int i = 0; i < N; i++)
    {
        if (a[i] == b[i])
            score += 4;
        else
            score -= 1;
    }
    cout << score;
}
