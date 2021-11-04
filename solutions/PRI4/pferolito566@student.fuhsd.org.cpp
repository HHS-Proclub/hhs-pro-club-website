#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>
using namespace std;

int main(){
	int numTestCases;
	cin>>numTestCases;
	for(int cantTouchThis=0;cantTouchThis<numTestCases;cantTouchThis++){
		int numCamels;
		cin>>numCamels;
		vector<vector<int> > camelsList;
		for(int i=0;i<numCamels;i++){
			vector<int> tempVect;
			int temp;
			cin>>temp;
			tempVect.push_back(temp);
			cin>>temp;
			tempVect.push_back(temp);
			camelsList.push_back(tempVect);
		}
		unordered_map<int,vector<int> > camelsMap;
		for(int i=0;i<numCamels;i++){
			vector<int> tempVect;
			tempVect.push_back(1);
			tempVect.push_back(camelsList[i][0]+camelsList[i][1]);
			camelsMap[camelsList[i][0]]=tempVect;
		}
		int count=0;
		for(int i=0;i<numCamels;i++){
			if((camelsMap.find(camelsList[i][0]+camelsList[i][1])!=camelsMap.end()) && (camelsMap[camelsList[i][0]+camelsList[i][1]][1]==camelsList[i][0])){
				count++;
			}
		}
		if(count/2>0){
			cout<<"YES"<<endl;
		}else{
			cout<<"NO"<<endl;
		}
	}

	return 0;
}
