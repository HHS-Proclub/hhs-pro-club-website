#include <cstdio>

#define MAX_N 1010000

using namespace std;

int cases, N;
int goal[MAX_N];

int search(int g) {
	for(int i = 0;i < N;i++) {
		if(g==goal[i]) {
			return i;
		}
	}
	return -1;
}

int main() {
	scanf(" %d", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {
		scanf(" %d", &N);
		int ctr = 0;
		for(int i = 0;i < N;i++) {
			int t;
			scanf(" %d", &t);
			if(t!=0) {
				goal[ctr++] = t;
			}
		}
		
		int prev = -1;
		bool p = true;
		for(int i = 0;i < N;i++) {
			int lf;
			scanf(" %d", &lf);
			if(lf==0) {
				continue;
			}
			
			if(prev==-1) {
				prev = search(lf);
			} else {
				prev = (prev+1)%(ctr);
				if(goal[prev]!=lf) {
					p = false;
				}
			}
		}
		printf("%s\n", (p ? "YES" : "NO"));
	}
	return 0;
}