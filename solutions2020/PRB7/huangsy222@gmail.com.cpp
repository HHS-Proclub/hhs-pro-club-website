#include <cstdio>
#include <iostream>

using namespace std;

const int MAX_N = 101000;

int arr[MAX_N], arrc;

int main() {
	
	arrc = 0;
	for(int k = 0;k < 101000;k++) {
		arr[arrc++] = ( (1 << k) - 1 ) * ( 1 << (k-1) );
		if(arr[arrc-1] > MAX_N) {
			arr[--arrc] = -1;
		}
	}
	
	int cases;
	scanf("%d", &cases);
	for(int caseN = 0;caseN < cases;caseN++) {
		int x;
		scanf("%d", &x);
		
		for(int i = arrc-1;i >= 0;i--) {
			if(x%arr[i] == 0) {
				printf("%d\n", arr[i]);
				break;
			}
		}
	}
	
	return 0;
}