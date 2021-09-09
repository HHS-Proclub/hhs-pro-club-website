#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
string number;
long long A[3], sum, numZeros,ans;
int main(){
	int numCases;
	cin >>numCases;
	for (int cases = 0; cases < numCases; cases++){
		cin >>number;
		ans = -1;
		numZeros = 0;
		sum = 0;
		for (int i = 0; i < 3; i++){
			A[i] = 0;
		}
		for (int i = 0; i < number.length(); i++){
			A[(number[i])%3]++;
			sum += (number[i]);
			sum  = sum %3;
		}
		if (sum == 0){
			ans = 0;
		}
		else if(sum == 1){
			numZeros = 0;
			if (A[1] == 1 && number[0]%3 == 1){
				while (number[numZeros+1]=='0'){
					numZeros++;
				}
				ans = 1 + numZeros;
			}
			else if (A[1] > 1){
				ans = 1;
			}
			numZeros = 0;
			if (A[2] == 2){
				if (number[0]%3==2){
					if (number[1]%3 == 2){
						while (number[numZeros+2]=='0'){
							numZeros++;
						}
						if (numZeros+2 < ans || ans == -1){
							ans  = numZeros + 2;
						}
					}else{
						while (number[numZeros+1]=='0'){
							numZeros++;
						}
						if (numZeros+2 < ans || ans == -1){
							ans = numZeros + 2;
						}
					}
				}
				else if (ans > 2 || ans == -1){
					ans = 2;
				}	
			}
			else if (A[2] >= 3){
				if (ans > 2 || ans == -1){
					ans = 2;
				}
			}
		}	
		else if(sum == 2){
			numZeros = 0;
			if (A[2] == 1 && number[0]%3 == 2){
				while (number[numZeros+1]=='0'){
					numZeros++;
				}
				ans = 1 + numZeros;
			}
			else if (A[2] > 1){
				ans = 1;
			}
			numZeros = 0;
			if (A[1] == 2){
				if (number[0]%3==1){
					if (number[1]%3 == 1){
						while (number[numZeros+2]=='0'){
							numZeros++;
						}
						if (numZeros+2 < ans || ans == -1){
							ans  = numZeros + 2;
						}
					}else{
						while (number[numZeros+1]=='0'){
							numZeros++;
						}
						if (numZeros+2 < ans || ans == -1){
							ans = numZeros + 2;
						}
					}
				}
				else if (ans > 2 || ans == -1){
					ans = 2;
				}	
			}
			else if (A[1] >=3){
				if (ans > 2 || ans == -1){
					ans = 2;
				}
			}
			
		}
		if (ans == number.length()){
			cout << -1<<endl;
		}else{
			cout << ans<<endl;
		}
	}
}
