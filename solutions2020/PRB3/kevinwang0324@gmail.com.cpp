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
        sort(wood, wood+pieces, greater<int>());
        int total = length;
        for (int i = 0; i < pieces - 1; i++) {
            energy += total;
            total -= wood[i];
        }
        cout << energy << endl;
    }
}

