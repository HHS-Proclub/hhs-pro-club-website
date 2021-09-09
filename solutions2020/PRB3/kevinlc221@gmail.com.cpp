#include <cstdio>
#include <vector>
#include <cmath>
#include <iostream>

const int MAX_L = 20;

using namespace std;

int cases;
long long N;

int ld, sd;
bool inc[MAX_L];

vector<int> chicken(long long v) {
	vector<int> ret;			//ret[i]*10^i
	ld = -1;
	sd = 11;
	while(v>0) {
		ret.push_back(v%10);
		ld = max((int)(v%10), ld);
		sd = min((int)(v%10), sd);
		inc[(int)(v%10)] = true;
		
		v=v/10;
	}
	return ret;
	
}

long long toL(vector<int> v) {
	long long ret = 0;
	for(int i = v.size()-1;i >= 0;i--) {
		ret = ret*10+v[i];
	}
	return ret;
}

int main() {
	scanf(" %d", &cases);
	
	for(int casen = 0;casen < cases;casen++) {
		scanf(" %lld", &N);
		for(int i = 0;i < MAX_L;i++) {
			inc[i] = false;
		}
		
		vector<int> tov = chicken(N);
		
		if(ld==sd) {
			tov.push_back(sd);
			printf("%lld\n", toL(tov));
			continue;
		}
		
		for(int i = 0;i < tov.size();i++) {
			if(tov[i] != ld) {
				
				for(int j = 0;j < 10;j++) {
					if(inc[j]&&j>tov[i]) {
						tov[i] = j;
						break;
					}
				}
				for(int j = i-1;j >= 0;j--) {
					tov[j] = sd;
				}
				break;
			}
		}
		printf("%lld\n", toL(tov));
	}
	
	return 0;
}

