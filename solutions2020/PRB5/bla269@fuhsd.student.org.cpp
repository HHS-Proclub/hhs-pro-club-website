#include <iostream>
using namespace std;
int main(){
	int x;
	cin >> x;
	for (int cases = 0; cases < x; cases++){
		int num2=0, num5=0,K;
		long long N, temp;
		cin >> N >> K;
		
		temp = N;
		while (temp%2 ==0){
			num2++;
			temp/=2;
		}
		temp = N;
		while (temp%5 == 0){
			num5++;
			temp /=5;
		}
		
		for (int i  = 0; i < K-num2; i++){
			N*=2;
		}
		for (int i = 0; i < K-num5; i++){
			N*=5;
		}
		cout << N << endl;
	}
}
