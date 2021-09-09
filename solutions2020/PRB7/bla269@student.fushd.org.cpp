#include <iostream>
using namespace std;

int numCases;
int a, b;
bool ans;

bool possible(int x, int y) {
    for (int i = 0; i < x; i++) {
        if ((x-i)%2 == 0) {
            int numW = (x-i)/2;
            if (y == (2*i) + numW) {
                return true;
            }
        }
    }
    return false;
}
int main() {

    cin >> numCases;

    for (int numCase = 0; numCase < numCases; numCase++) {
        cin >> a >> b;
        ans = true;
        int divisor = 1;
        int count1 = 0;
        int count2 = 0;

        while (a != 1 && b != 1) {
            divisor++;

            while (a % divisor == 0) {
                a /= divisor;
                count1++;
            }

            while (b % divisor == 0) {
                b /= divisor;
                count2++;
            }

            if (!possible(min(count1,count2), max(count1,count2))) {
                ans = false;
                break;
            }
            count1 = 0;
            count2 = 0;
        }
        if (ans) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
}

