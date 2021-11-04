#include <iostream>

int main() {
	int t;
	std::cin >> t;
	for(int i = 0; i < t; i++) {
		int n;
		std::cin >> n;
		int k = 0;
		bool r = false;
		int l = 0;
		int p = 0;
		for(int j = 0; j < n; j++) {
			int a;
			std::cin >> a;
			if(r) {
				if(a == p) {
					k += (1 + l / 2) / 2;
					r = false;
					l = 0;
				} else {
					l++;
				}
			}
			if(!r && a == 1) {
				r = true;
			}
			p = a;
		}
		k += (1 + l / 2) / 2;
		std::cout << k << std::endl;
	}
}