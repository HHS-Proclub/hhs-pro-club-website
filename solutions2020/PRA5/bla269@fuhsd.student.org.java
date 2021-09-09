#include <iostream>
#include <string>
char vowels[5] = {'a','e','i','o','u'};
int numConsonants, continous;
using namespace std;
bool isVowel(char x){
	bool vowel = false;
	for (int i = 0; i < 5; i++){
		if (x == vowels[i]){
			vowel = true;
		}
	}
	return vowel;
}
int main(){
	int numCases;
	string str;

	cin >>numCases;
	for (int cases = 0; cases < numCases; cases++){
		cin >> str;
		numConsonants = 0;
		continous = 1;
		for (int i = 0; i < str.length(); i++){
			if (isVowel(str[i])){
				numConsonants= 0;
				continous = 1;
			}
			else{
				numConsonants++;
			} 
			if (str[i] == str[i-1]){
				continous++;
			}
			else{
				continous = 1;
			}
			if (numConsonants >=3 && continous <3){
				str.insert(i," ");
			}
			
		}
		cout << str<<endl;
	}
}
