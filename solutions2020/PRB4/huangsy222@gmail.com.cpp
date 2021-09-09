#include <cstdio>
#include <utility>
#include <algorithm>

#define MAX_N 1010000

using namespace std;

int cases;
int A, B, C;
int N;
pair<int, int> mice[MAX_N];
int extra[MAX_N];

int main() {
	scanf(" %d", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {
	
		scanf(" %d %d %d %d", &A, &B, &C, &N);
	
		for(int i = 0;i < N;i++) {
			scanf(" %d %d", &mice[i].first, &mice[i].second);
		}
		
		sort(mice, mice+N);
		
		int comp = 0;
		long long price = 0;
		int xn = 0;
	
		for(int i = 0;i < N;i++) {
			
			if(mice[i].second == 0) {
			
				if(A > 0) {
					A--;
					price += mice[i].first;
					comp++;
				} else {
					extra[xn++] = mice[i].first;
				}
			
			}
			
			if(mice[i].second == 1) {
			
				if(B > 0) {
					B--;
					price += mice[i].first;
					comp++;
				} else {
					extra[xn++] = mice[i].first;
				}
			}
		}
		sort(extra, extra+xn);
		for(int i = 0;i < xn;i++) {
			if(C > 0) {
				C--;
				price += extra[i];
				comp++;
			}
		}
	
		printf("%d %lld\n", comp, price);
	}
	
	return 0;
}