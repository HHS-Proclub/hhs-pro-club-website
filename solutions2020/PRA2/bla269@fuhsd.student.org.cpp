#include <iostream>
using namespace std;
int A[1000000];
int B[1000000];
int main(){
	int numCases;
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++){
		
		int numIslands, posZero,possible = 0;
		bool same = false;
		cin >> numIslands;
		for (int i = 0; i <numIslands; i++){
			cin >> A[i];
			if (A[i] == 0){
				posZero = i;
			}
		}
		for (int i = 0; i <numIslands; i++){
			cin >> B[i];
		}
		
		for (int i = 0; i < numIslands*(numIslands-1); i++){
			same = true;
			//shifting
			if (posZero == numIslands -1){
				A[posZero] = A[0];
				A[0] = 0;
				posZero = 0;
			}
			else{
				A[posZero] = A[posZero+1];
				A[posZero+1] = 0;
				posZero++;
			}

			for (int j = 0; j < numIslands; j++){
				if (A[j] != B[j]){
					same = false;
				}
			}
			if (same){
				cout << "YES"<<endl;
				possible = 1;
			}
		}
		if (possible == 0){
			cout << "NO"<<endl;
		}
	}
	
}
