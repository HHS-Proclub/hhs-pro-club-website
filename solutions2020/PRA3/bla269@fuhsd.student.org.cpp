#include <iostream>
using namespace std;
long long n, k, p,ans,total,xBound,yBound;
int main(){
	int numCases;
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++){
		cin >> n >> k >> p;
		total = 0;
		ans = 0;
		xBound = p;
		yBound = p;
		k = k - n;
		while(total <= k){
			ans++;
			if (xBound > 1 && yBound < n){
				total += yBound - xBound +1;
				xBound--;
				yBound++;
			}
			else if(xBound > 1){
				total += yBound - xBound +1;
				xBound--;
			}
			else if(yBound < n){
				total += yBound - xBound +1;
				yBound++;
			}
			else{
				total += yBound - xBound +1;
			}
		}
		cout <<ans << endl;
	}
}
