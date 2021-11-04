#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;
#define ll long long

bool comp(vector<int> a,vector<int> b){return a[1]>b[1];}

int main(){
	int numTestCases;cin>>numTestCases;
	for(int t=0;t<numTestCases;t++){
		
		int numSongs;int numChoices;
		cin>>numSongs>>numChoices;
		vector<vector<int> > songs;
		for(int i=0;i<numSongs;i++){
			int temp;int temp2;
			cin>>temp>>temp2;
			vector<int> tempVector;
			tempVector.push_back(temp);tempVector.push_back(temp2);
			songs.push_back(tempVector);
		}
		sort(songs.begin(),songs.end(),comp);
		set<int> lengthSet;
		ll currentLength=0;
		ll maxPleasure=0;
		for(int i=0;i<numChoices;i++){
			lengthSet.insert(songs[i][0]);
			currentLength+=songs[i][0];
			maxPleasure=max(maxPleasure,currentLength*(ll)songs[i][1]);
		}
		for(int i=numChoices;i<numSongs;i++){
			lengthSet.insert(songs[i][0]);
			currentLength+=songs[i][0];
			currentLength-=*lengthSet.begin();
//			cout<<currentLength<<endl;
			lengthSet.erase(*lengthSet.begin());
//			auto it=lengthSet.begin();
//			while(it!=lengthSet.end()){
//				cout<<*it<<endl;
//				it++;
//			}
			maxPleasure=max((ll)songs[i][1]*(ll)currentLength,maxPleasure);
		}
		cout<<maxPleasure<<endl;
	}
	return 0;
}
