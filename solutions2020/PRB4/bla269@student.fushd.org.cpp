#include <iostream>

using namespace std;

int numCases;

int numSlimes;

int slimeValues[500000];
long long sum, smallest = -1;
bool allNegative;
bool allPositive;

int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		cin >> numSlimes;
		allNegative = true;
		allPositive = true;
		smallest = -1;
		sum = 0;
		for (int i = 0; i < numSlimes; i++) {
			cin >> slimeValues[i];
			if (slimeValues[i] < 0) {
				allPositive = false;
				sum += slimeValues[i]*-1;
				if (-slimeValues[i] < smallest || smallest == -1) {
					smallest = -1*slimeValues[i];
				}
			}
			else if (slimeValues[i] >= 0) {
				allNegative = false;
				sum += slimeValues[i];
				if (slimeValues[i] < smallest || smallest == -1) {
					smallest = slimeValues[i];
				}
			}
			
		}
		
		if ((!allPositive && !allNegative) || numSlimes == 1) {
			cout << sum << endl;
		}
		else {
			sum -= 2*smallest;
			cout << sum<< endl;
		}
		
		
		
	}	
}
