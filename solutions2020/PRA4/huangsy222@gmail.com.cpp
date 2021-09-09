#include <cstdio>
#include <iostream>
#include <vector>
#include <string>
#include <cmath>

#define MAX_L 1010000

using namespace std;

int cases;
long long N;
int sub1, sub2;
int sub1pos[MAX_L], sub2pos[MAX_L];

char intchars[10] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

struct digit {
	int modThree;
	int trailingZeros;
	bool first;

	digit(int a, int b, bool c) {
		modThree = a;
		trailingZeros = b;
		first = c;
	}
	digit() {
		digit(-1, 0, false);
	}
	
};

vector<digit> toVec(vector<int> digits) {
	int zeroOverload = 0;
	vector<digit> ret;
	bool f = true;
	
	for(int i = 0;i < digits.size();i++) {
		if(digits[i] == 0) {
			zeroOverload++;
		} else {
			if(digits[i]%3 == 1) {
				sub1pos[sub1++] = ret.size();
			}
			if(digits[i]%3 == 2) {
				sub2pos[sub2++] = ret.size();
			}
			
			if(ret.size() >= 1) {
				ret[ret.size()-1].trailingZeros = zeroOverload;
			}
			ret.push_back(digit(digits[i], 0, f));
		
			f = false;
			zeroOverload = 0;
		
		}
	}
	if(ret.size()>=1)
		ret[ret.size()-1].trailingZeros = zeroOverload;
	
	return ret;
}

vector<int> getDigits(string s) {
	vector<int> ret;
	for(int i = 0;i < s.size();i++) {
		for(int n = 0;n < 10;n++) {
			if(s[i]==intchars[n]) {
				ret.push_back(n);
				break;
			}
		}
	}
	return ret;
}

int csum(vector<int> a) {
	int ret = 0;
	for(int i = 0;i < a.size();i++) {
		ret = (ret+a[i])%3;
	}
	return ret;
}

int main() {
	scanf(" %d", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {
		
		string rawInput;
		cin >> rawInput; 
		
		sub1 = sub2 = 0;
		
		vector<int> intArray = getDigits(rawInput);
		int rem3 = csum(intArray);
		
		
		vector<digit> digArray = toVec(intArray);
		
		int answer = -1;
		
		switch (rem3) {
			case 0: answer = 0; break;
			case 1: 
		
				answer = MAX_L;
				if(sub1 >= 1) {
					answer = min(answer, 1);
				}

				if(sub2 >= 2) {
					answer = min(answer, 2);
				}
				
			break;
			case 2: 
			
				answer = MAX_L;
				if(sub2 >= 1) {
					answer = min(answer, 1);
				}

				if(sub1 >= 2) {
					answer = min(answer, 2);
				}
			
			
				
			break;
		}
		if(answer >= MAX_L || (intArray.size() == 1&&(intArray[0] == 0||(intArray[0]%3!=0)))) {
			answer = -1;
		}
		
		if(digArray.size() <= 2) {
			if(digArray.size() == sub1 || digArray.size() == sub2) {
				answer = -1;
			}
		}
		
		printf("%d\n", answer);
	}
	
	return 0;
}

/*

case 1:
sub1:
- 3301
- 1033
sub2:
- 3003205
- 509602
- 200500009
case 2:
sub2:
- 3302
- 2033
sub1:
- 3003104
- 409601
- 100400009










10
3301
1033
3003205
509602
200500009
3302
2033
3003104
409601
100400009
10040000901

answers:
1
2
2
3
8
1
2
2
3
8


*/