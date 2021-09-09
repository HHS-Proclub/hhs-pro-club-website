#include <iostream>

using namespace std;

int numCases;

int A, B;
int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> A >> B;
		cout << A + B << endl;
	}
}
