#include <iostream>
#include <algorithm>
#include <cctype>

int main() {
	int t;
	std::cin >> t;
	for(int i = 0; i < t; i++) {
		std::string s;
		std::cin >> s;
		int l = 0;
		std::for_each(s.begin(), s.end(), [&l](char c) {
			if(std::islower(c)) {
				l++;
			}
			if(std::isupper(c)) {
				l--;
			}
		});
		if(l >= 0) {
			std::for_each(s.begin(), s.end(), [](char &c) {
				c = std::tolower(c);
			});
		} else {
			std::for_each(s.begin(), s.end(), [](char &c) {
				c = std::toupper(c);
			});
		}
		std::cout << s << std::endl;
	}
	return 0;
}
