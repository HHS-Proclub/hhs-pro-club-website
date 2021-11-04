#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
	int numTestCases;
	cin>>numTestCases;
	for(int cantTouchThis=0;cantTouchThis<numTestCases;cantTouchThis++){
		int numCans;
		cin>>numCans;
		vector<int> cansList;
		for(int i=0;i<numCans;i++){
			int temp;
			cin>>temp;
			cansList.push_back(temp);
		}
		int numKnockedDown=0;
		int numShots=0;
		sort(cansList.begin(),cansList.end());
		for(int i=numCans-1;i>=0;i--){
			numShots+=(cansList[i]*numKnockedDown+1);
			numKnockedDown++;
		}
		cout<<numShots<<endl;
		
	}
	return 0;
}
