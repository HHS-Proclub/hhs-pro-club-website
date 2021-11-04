#include <iostream>

int main() {
	int count;
	std::cin >> count;
	while(count > 0) {
		int a, b;
		std::cin >> a;
		std::cin >> b;
		std::cout << a + b << std::endl;
		count--;
	}
	return 0;
}