#include <iostream>
using namespace std;

int main() {
    int numCases;
    cin >> numCases;

    for (int numCase = 0; numCase < numCases; numCase++) {
        int a, b, c;

        cin >> a >> b >> c;

        cout << max(b - (b+c-a), c - (b+c-a)) + 1 << endl;
    }
}
