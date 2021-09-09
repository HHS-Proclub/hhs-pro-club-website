#include <iostream>
#include <string>
using namespace std;

int numCases;
int numDigits;
string number;
int digits[100];
int sum[101];
bool isWinning;

void recur(int index, int sumIndex) {
	int segmentSum = 0;
//	while ()
	while (segmentSum < sum[sumIndex] && index < numDigits) {
		segmentSum += digits[index];
		index++;
	}
//	cout << segmentSum << " " << index << " " << sum[sumIndex] << endl;
	if (segmentSum == sum[sumIndex]) {
		if (index == numDigits) {
			isWinning = true;
		} else {
			recur(index,sumIndex);
		}
	}
}

int main() {
	cin >> numCases;
	for (int numCase = 0; numCase < numCases; numCase++) {
		isWinning = false;
		cin >> numDigits;
		cin >> number;
		while (number[0] == '0') {
			number = number.substr(1,number.length()-1);
			numDigits--;
		}
		while(number[numDigits-1] == '0') {
			numDigits--;
		}
		if (number.length() == 0) {
			isWinning = true;
		}
		for (int i = 0; i < numDigits; i++) {
			digits[i] = number[i] -'0';
			sum[i+1] = sum[i] + digits[i];
		}
		
		for (int i = 1; i < numDigits; i++) {
			recur(i,i);
			if (isWinning) {
				break;
			}
		}
		
		if (isWinning) {
			cout << "YES" << endl;
		} else {
			cout << "NO" << endl;
		}
	}
	
}
