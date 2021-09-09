#include <iostream>

int main() {
	int a, b, c;
	std::cin >> a >> b >> c;
	std::cout << ((a > b + c - 1) ? b + c - 1 : a) + ((b > a + c - 1) ? a + c - 1 : b)	+ ((c > a + b - 1) ? a + b - 1 : c) << std::endl;
	return 0;
}
