#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int N;
    cin >> N;
    int a[1000];
    for (int i = 0; i < N; i++)
        cin >> a[i];
    sort(a, a + N);
    cout << a[N-1];
}
