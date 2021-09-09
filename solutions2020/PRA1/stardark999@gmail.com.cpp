#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int a; cin >> a;
        while (true) {
            a++;
            int a2 = a;
            bool vis[10]; for (int i = 0; i < 10; i++) vis[i] = 0;
            bool good = 1;
            while (a2) {
                if (vis[a2 % 10]) good = 0;
                vis[a2 % 10] = 1;
                a2 /= 10;
            }
            if (good) {
                cout << a << endl;
                break;
            }
        }
    }
    return 0;
}
