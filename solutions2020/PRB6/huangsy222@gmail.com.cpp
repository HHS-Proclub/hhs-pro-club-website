#include <iostream>
#include <cstdio>
#include <deque>

#define MAX_N 1010000

using namespace std;

int cases;
long long N, K;
long long cur;

int main() {
	scanf("%d", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {
		scanf(" %lld %lld", &N, &K);
		deque<long long> players;
		
		for(int i = 0;i < N;i++) {
			long long v;
			scanf(" %lld", &v);
			players.push_back(v);
		}
		
		cur = players.front();
		players.pop_front();
		
		long long row = 0;
		
		for(int att = 0;att < 1000000;att++) {
			
			if(cur > players.front()) {
				players.push_back(players.front());
				players.pop_front();
				row++;
				
				if(row >= K&&row >= N) {
					break;
				}
			} else {
				row = 1;
				
				players.push_back(cur);
				cur = players.front();
				players.pop_front();
			}
		}
		
		printf("%lld\n", cur);
	}
}