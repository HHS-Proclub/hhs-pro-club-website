#include <iostream>
#include <cmath>
#include <algorithm>
#include <array>
using namespace std;

int main() {
  array<int, 4> sides;
  int sum = 0;

  for (int i = 0; i < 4; i++){
    cin >> sides[i];
  }

  sort(sides.begin(), sides.end());

  int median = (sides[1] + sides[2]) / 2;

  for (int i = 0; i < 4; i++){
    sum += abs (sides[i] - median);
  }

  cout << sum;
  return 0;
}
