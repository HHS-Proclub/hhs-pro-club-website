#include <iostream>
#include <cstdio>
#include <string>
#include <queue>

using namespace std;

int cases;
string N;

int main() {
	scanf("%d", &cases);
	
	for(int caseN = 0;caseN < cases;caseN++) {
		cin >> N;
		queue<char> ans;
		
		int row = 1;
		int cons = 0;
		for(int i = 0;i < N.length();i++) {
			char c = N[i];
			bool iscons = !(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
			
			if(i>0&&N[i]==N[i-1]) {
				row++;
			} else {
				row = 1;
			}
			
			if(iscons) {
				cons++;
			} else {
				cons = 0;
			}
			
			if(row >= 3) {
				cons--;
			}
			
			
			if(cons >= 3) {
				ans.push(' ');
				row = 1;
				cons = 1;
			}
			
			ans.push(c);
			
		}
		
		while(!ans.empty()) {
			cout << ans.front();
			ans.pop();
		}
		cout << endl;
	}
	
	return 0;
}