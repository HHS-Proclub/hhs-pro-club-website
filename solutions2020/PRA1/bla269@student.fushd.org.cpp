#include <iostream>
#include <algorithm>
using namespace std;

int numCases;
int value;
bool used[10];


bool checkUnique(int x) {
	for (int i = 0; i < 10; i++) {
		used[i] = false;
	}
	while (x > 0) {
		if (used[x%10]) {
			return false;
		} else {
			used[x%10] = true;
		}
		x /= 10;
	}
	
	return true;
}

int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> value;
		value++;
		while (!checkUnique(value)) {
			value++;
		}			
		cout << value << endl;
	}
}
