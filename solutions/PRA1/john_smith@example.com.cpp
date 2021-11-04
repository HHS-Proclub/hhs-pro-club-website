/*
If the GCD of two numbers is greater than 1, they are coprime.
The digital sum will be equivalent to the original number modulo 9, and thus modulo 3.
If X is a multiple of 3, S(X) will also be a multiple of 3, and the numbers are not coprime.
Multiples of 3 are thus guaranteed have Carl's property, and performing a linear search will only need at most 2 coprimality checks.

credit: Julia Gu
*/

#include <iostream>
#include <cstdlib>

/* 10^18 is quite big */
#include <cstdint>

/* coprimality test based on binary GCD */
bool coprime(std::uint64_t a, std::uint64_t b) {
	while(true) {
		if(a % 2 == 0) {
			if(b % 2 == 0) {
				return false;
			} else {
				// scuffed
				if(a == 0) {
					return b == 1;
				}
				a >>= 1;
			}
		} else {
			if(b % 2 == 0) {
				// scuffed
				if(b == 0) {
					return a == 1;
				}
				b >>= 1;
			} else {
				std::int64_t difference = a - b;
				if(difference < 0) {
					b = a;
					a = -difference;
				} else {
					a = difference;
				}
			}
		}
	}
}

/* digital sum */
int digital_sum(std::uint64_t number) {
	int result = 0;
	while(number > 0) {
		std::ldiv_t division = std::ldiv(number, 10);
		result += division.rem;
		number = division.quot;
	}
	return result;
}

/* Carl's property */
bool carl(std::uint64_t number) {
	return !coprime(number, digital_sum(number));
}

int main() {
	int count;
	std::cin >> count;
	while(count > 0) {
		std::uint64_t number;
		std::uint64_t candidate;
		std::cin >> number;
		for(candidate = number; !(candidate % 3 == 0 || carl(candidate)); candidate++)
			;
		std::cout << candidate << std::endl;
		count--;
	}
	return 0;
}