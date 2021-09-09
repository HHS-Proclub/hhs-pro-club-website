#include <iostream>
#include <algorithm>

#define MAXX 5000

using namespace std;


int X;
int inEdge[MAXX], outEdge[MAXX];

int main() {
  int N;
  cin >> N;
  for (int i = 0; i < N; i++) {
    // Test case
    cin >> X;
    int f;
    for (int j = 0; j < X; j++) {
      cin >> f;
      outEdge[j] = --f;
    }

    // Do a simple search for triangles
    bool hasTri = false;
    for (int j = 0; j < X; j++) {
      if (outEdge[outEdge[outEdge[j]]] == j) {
        cout << "YES" << endl;
        hasTri = true;
        break;
      }
    }

    if (!hasTri) cout << "NO" << endl;
  }
}