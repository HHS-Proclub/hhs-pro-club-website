#include <iostream>

using namespace std;

int ways;
int n;
int g[10][10];

bool inGrid(int i, int j);
void move(int i, int j);

int main() {
    cin >> n;
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            cin >> g[i][j];
        }
    }
    move(0, 0);
    cout << ways;
}

bool inGrid(int i, int j) {
    return i<n && i>=0 && j<n && j>=0;
}

void move(int i, int j) {
    if (i==n-1 && j==n-1) {
        ways++;
        return;
    }
    else {
        g[i][j] = 1;
    }
    if (inGrid(i+1, j) && !g[i+1][j])
        move(i+1, j);
    if (inGrid(i, j+1) && !g[i][j+1])
        move(i, j+1);
    if (inGrid(i-1, j) && !g[i-1][j])
        move(i-1, j);
    if (inGrid(i, j-1) && !g[i][j-1])
        move(i, j-1);
}

