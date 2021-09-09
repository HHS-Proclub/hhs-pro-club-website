#include <iostream>
#include <algorithm>
using namespace std;
int numCases;
int C, N;
int cost[10000];
bool noPair[10000];
int group[1000][1000];
int numTerms[100];
int sum, numCycle,small, occur;
bool add;
pair <int,int> rel[10000];
void combine (int n1, int n2) {
	for (int i = 0; i < numTerms[n2]; i++) {
		group[n1][numTerms[n1]] = group[n2][i];
		group[n2][i] = 0;
		numTerms[n1]++;
	}
}
int main() {
	cin >> numCases;
	for (int cases = 0; cases < numCases; cases++) {
		sum = 0;
		numCycle = 0;
		cin >> C >> N;
		for (int i = 0; i < C; i++) {
			cin >> cost[i];
			noPair[i] = true;
			numTerms[i] = 0;
			for (int j = 0; j < C; j++) {
				group[i][j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			cin >> rel[i].first >> rel[i].second;
			noPair[rel[i].first-1] = false;
			noPair[rel[i].second-1] = false;
		}
		for (int i = 0; i < C; i++) {
			if (noPair[i]) {
				sum += cost[i];
			}
		}
		for (int i = 0; i < N; i++) {
			add = false;
			occur = -1;
			if (i == 0) {
				group[numCycle][0] = rel[i].first;
				group[numCycle][1] = rel[i].second;
				numTerms[numCycle] = 2;
				numCycle = 1;
			} else {
				for (int j = 0; j < numCycle; j++) {
					for (int k = 0; k < numTerms[j]; k++) {
						if (rel[i].first == group[j][k]) {
							if (add) {
								combine(occur,j);
								j = numCycle-1;
								k = numTerms[j]-1;
								occur = -1;
							} else {
								add = true;
								occur = j;
							}
						}
						if (rel[i].second == group[j][k]) {
							if (add) {
								combine(occur,j);
								j = numCycle-1;
								k = numTerms[j]-1;
								occur = -1;
							} else {
								add = true;
								occur = j;
							}
						}
					}
				}
				if (!add) {
					numCycle++;
					group[numCycle-1][0] = rel[i].first;
					group[numCycle-1][1] = rel[i].second;
					numTerms[numCycle-1] = 2;
				}
				if (add && occur!=-1) {
					group[occur][numTerms[occur]] = rel[i].first;
					group[occur][numTerms[occur]+1] = rel[i].second;
					numTerms[occur] += 2;
				}
			}
			
		}
//		for (int i = 0; i < numCycle; i++) {
//			for (int j = 0; j < numTerms[i]; j++) {
//				cout << group[i][j] << "  ";
//			}
//			cout << endl;
//		}
		for (int i = 0; i < numCycle; i++) {
			small = 9999999;
			for (int j = 0; j < numTerms[i]; j++) {
				small = min(small,cost[group[i][j]-1]);
			}
			sum+= small;
		}
		cout << sum << endl;
	}
}
