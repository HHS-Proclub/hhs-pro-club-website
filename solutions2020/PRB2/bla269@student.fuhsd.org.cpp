#include <iostream>
using namespace std;

int N;
int rooms[310];
int ans;

int main() {
    int numC;
    cin >> numC;
    for (int num = 0; num < numC; num++) {
        cin >> N;
        ans = 0;
        for (int i = 0; i < N; i++) {
            cin >> rooms[i];
        }

        for (int i = 1; i < N-1; i++) {
            if (rooms[i-1] == 1 && rooms[i] == 0 && rooms[i+1] == 1) {
                rooms[i+1] = 0;
                ans++;
            }
        }
        cout << ans << endl;
    }
}
