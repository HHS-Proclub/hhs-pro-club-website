#include <iostream>

int vowel_count(std::basic_string<char> text) {
	int count = 0;
	for(int index = 0; index < text.length(); index++) {
		char letter = text[index];
		count += (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
	}
	return count;
}

int main() {
	int count;
	std::cin >> count;
	std::cin >> std::ws;
	for(int test = 0; test < count; test++) {
		std::string a, b, c;
		std::getline(std::cin, a);
		std::getline(std::cin, b);
		std::getline(std::cin, c);
		std::cout << (vowel_count(a) == 5 && vowel_count(b) == 7 && vowel_count(c) == 5 ? "YES" : "NO") << std::endl;
	}
}