#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
char Digits[10];
int numDigits;
bool newDigit = true;

int main(){
	int numCases;
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++){
		string num;
		numDigits = 0;
		cin >> num;
		for (int i = 0; i < num.length(); i++){
			newDigit = true;
			for (int j = 0; j < numDigits; j++){
				if (num[i] == Digits[j]){
					newDigit = false;
				}
			}
			if (newDigit){
				Digits[numDigits] = num[i];
				numDigits++;
			}
		}
		sort (Digits, Digits + numDigits);
		
		for (int i = num.length()-1; i >=0; i--){
			newDigit = false;
			for (int j = 0; j < numDigits; j++){
				if (Digits[j]>num[i]){
					num[i] = Digits[j];
					newDigit = true;
					break;
				}
			}
			if (newDigit){
				cout << num<<endl;
				break;
			}
			else{
				num[i] = Digits[0];
			}
		}
		if (!newDigit){
			cout << Digits[0] <<num<<endl;
		}
	}	
}
