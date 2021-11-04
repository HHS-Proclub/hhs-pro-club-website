#include <iostream>

int increment(int n) { return n + 1; }

int main() {
  int n;
  std::cin >> n;
  std::cout << increment(n) << std::endl;
  return 0;
}
