#include <iostream>
#include <array>

int n;

int main() {
  std::cin >> n;
  int a[n];
  int b[n];
  for (int i = 0; i < n; i++) {
    std::cin >> a[i];
    std::cin >> b[i];
  }
  for (int i = 0; i < n; i++) {
    std::cout << (a[i] + b[i]) << std::endl;
  }
}