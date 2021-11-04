#include <iostream>
using namespace std;

int binaryToDecimal() {
	char c;
	cin >> c;

	long long decNum = 0;
	int digit;

	while (isdigit(c) && !isspace(c)) {
		digit = static_cast<int>(c) - 48;
		decNum = decNum * 2 + digit;
		cout << "decNum: " << decNum << " digit: " << digit << endl;
		cin.get(c);
	}
	//cout << decNum << "decnum";
	return decNum;
}

void solve() {
	long long n = binaryToDecimal();

	int steps = 0;

	while (n != 1) {
		if (n % 2 == 0) {
			n /= 2;
		}
		else {
			n++;
		}

		steps++;
	}

	cout << steps << endl;
}

int main() {
	
	/*/string s = "";
	for (int i = 0;i < pow(10, 6);i++) {
		s += "1";
	}
	cout << s;*/

	int t;
	cin >> t;
	for (int i = 0;i < t;i++) {
		solve();
	}
}
