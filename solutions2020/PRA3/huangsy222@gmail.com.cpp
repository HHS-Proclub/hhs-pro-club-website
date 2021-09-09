#include <cstdio>

#define MAX_N 1010000000

using namespace std;

int cases;
long long n, k, p;
long long below, higher;

long long count(long long largest, long long amount) {			//largest is largest # of pillows, amount is number of people to one side of it. Returns number of total pillows needed. 
	
	long long bt = largest*(largest+1)/2;
	
	if(amount>=largest) {
		bt += (amount-largest);
	} else {
		long long diff = largest-amount;
		bt -=  diff*(diff+1)/2;
	}
	
	return bt;
}

int main() {
	scanf(" %d", &cases);
	for(int caseN = 0;caseN < cases;caseN++) {
		scanf(" %lld %lld %lld", &n, &k, &p);				//n guests, k pillows, p is position
		
		long long low = 0, high = MAX_N;				//low = possible (answer), high = impossible
		while(high>low+1) {
			long long mid = (high+low)/2;
			
			long long tn = mid+count(mid-1, p-1)+count(mid-1, n-p);
			//printf("%lld->%lld\n", mid, tn);
			if(tn<=k) {
				low = mid;
			} else {
				high = mid;
			}
		}
		
		printf("%lld\n", low);
	}
	return 0;
}