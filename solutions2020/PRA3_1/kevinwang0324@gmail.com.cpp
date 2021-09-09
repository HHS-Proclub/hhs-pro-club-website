/*
Input:
4
5 1
5
9 3
2 5 2
10 4
3 2 4 1
10 4
2 3 3 2
*/

/*Output:
0
13
19
20
*/
#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    for (int i = 0;i < n; i++) {
        int length, pieces, energy = 0;
        cin >> length >> pieces;
        int wood[pieces];
        for (int i = 0;i < pieces; i++) {
            cin >> wood[i];
        }
        sort(wood, wood+pieces);
        int total = length;
        for (int i = pieces-1; i > 0; i--) {
            energy += total;
            total -= wood[i];
        }
        cout << energy << endl;
    }
}

