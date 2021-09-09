#include <iostream>
using namespace std;
long long N, K,current = 0;
int A[1000000];
bool ansFound = true;
int main(){
	int numCases;
	cin >>numCases;
	for (int cases= 0; cases < numCases; cases++){
		cin >> N >> K;
		current = 0;
		for (int i = 0; i < N; i++){
			cin >> A[i];
		}
		
		for (int i = 0; i < N; i++){
			ansFound = true;
			for (int j = 1; j <= K; j++){
				if (current + j == N){
					ansFound = true;
					break;
				}
				else if (A[current]<A[current+j]){
					current = current + j;
					i = current - 1;
					ansFound = false;
					break;
				}
			}
			if(ansFound){
				cout << A[current]<<endl;
				break;
			}
		}
	}
}
