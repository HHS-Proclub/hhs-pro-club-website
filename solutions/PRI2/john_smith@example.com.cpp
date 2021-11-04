#include <iostream>

int main() {
	int count;
	std::cin >> count;
	for(int test = 0; test < count; test++) {
		std::cin >> std::ws;
		int result = 1;
		int run = 0;
		bool first = true;
		bool special = true;
		char bit;
		while((bit = std::cin.get()) != std::char_traits<char>::eof() && bit == '0' || bit == '1') {
			result++;
			if(bit == '0') {
				result++;
				run++;
			} else {
				if(!first) {
					special = false;
				}
				run = 0;
			}
			first = false;
		}
		result -= run;
		result -= special ? 2 : 0;
		std::cout << result << std::endl;
	}
}