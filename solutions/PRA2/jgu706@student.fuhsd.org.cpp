#include <iostream>

int main() {
	int count;
	std::cin >> count;
	for(int test = 0; test < count; test++) {
		int n, k;
		std::cin >> n >> k;
		int left = 0;
		int right = n;
		while(left != right) {
			int v = (left + right) / 2;
			int divide = 1;
			int remaining = n;
			while(v >= divide) {
				remaining -= v / divide;
				divide *= k;
			}
			if(remaining > 0) {
				left = v + 1;
			} else {
				right = v;
			}
		}
		std::cout << left << std::endl;
	}
}