#include <iostream>
#include <cstdio>

using namespace std;

long long pow(long long base, int power) {
	if(power < 0) {
		return 0;
	} else if(power == 0) {
		return 1;
	} else if (power == 1) {
		return base;
	}
	
	int v = pow(base, power/2);
	
	return (v*v*(power%2==1 ? base : 1));
}

int cases;
long long N;
int K;

int main() {
	scanf("%d\n", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {
		scanf(" %lld %d", &N, &K);
		
		if(N==0) {
			for(int i = 0;i < K;i++) {
				printf("0");
			}
			printf("\n");
			continue;
		}
		
		int c2 = 0, c5 = 0;
		
		long long r = N;
		while(r > 0 && r%2 == 0) {
			c2++;
			r = r/2;
		}
		r = N;
		while(r > 0 && r%5 == 0) {
			c5++;
			r = r/5;
		}
		
		int zeros = min(c2, c5);
		
		if(zeros >= K) {
			printf("%lld\n", N);
			continue;
		} else if ((c2 <= K&&c5 > K) || (c2 > K&&c5 <= K)) {
			if(K > c2) {
				N = N*pow(2, K-c2);
			}
			if(K > c5) {
				N = N*pow(5, K-c5);
			}
			
			printf("%lld\n", N);
		} else {
			N = N*pow(2, max(c2, c5)-c2);
			N = N*pow(5, max(c2, c5)-c5);
			printf("%lld", N);
			for(int q = max(c2, c5);q < K;q++) {
				printf("0");
			}
			printf("\n");
		}
	}
}

