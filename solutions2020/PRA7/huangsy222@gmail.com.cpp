#include <cstdio>
#include <vector>
#include <utility>
#include <algorithm>
#include <stack>

using namespace std;

const int MAX_N = 101000;

int main() {
	int cases;
	scanf("%d", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {

		vector<int> adj[MAX_N];
		pair<int, int> cost[MAX_N];
		bool affected[MAX_N];
		
		int n, e;
		scanf("%d %d", &n, &e);
		
		for(int i = 1;i <= n;i++) {
			scanf("%d", &cost[i].first);
			cost[i].second = i;
			affected[i] = false;
		}
		
		sort(cost+1, cost+n+1);
		
		for(int i = 0;i < e;i++) {
			int a, b;
			scanf("%d %d", &a, &b);
			
			adj[a].push_back(b);
			adj[b].push_back(a);
		}
		
		stack<int> tv;
		int ans = 0;
		for(int i = 1;i <= n;i++) {
			int node = cost[i].second;
			if(!affected[node]) {
				ans += cost[i].first;
				
				tv.push(node);
				while(!tv.empty()) {
					int cn = tv.top();
					tv.pop();
					
					affected[cn] = true;
					
					for(int j = 0;j < adj[cn].size();j++) {
						if(affected[adj[cn][j]]) {
							continue;
						} else {
							affected[adj[cn][j]] = true;
							tv.push(adj[cn][j]);
						}
					}
				}
				
			}
			
		}
		
		printf("%d\n", ans);
		
	}
}