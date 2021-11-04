#include <iostream>
#include <vector>
using namespace std;

int main(){
	int t;cin>>t;
	for(int dontTouch=0;dontTouch<t;dontTouch++){
		vector<int> houses;
		int numHouses;cin>>numHouses;
		for(int i=0;i<numHouses;i++){
			int temp;cin>>temp;
			houses.push_back(temp);
		}
		vector<bool> disturbed;
		disturbed.push_back(false);
		for(int i=1;i<numHouses-1;i++){
			if((houses[i-1]==houses[i+1]) && (houses[i-1]==1) && (houses[i]==0)){
				disturbed.push_back(true);
			}else{
				disturbed.push_back(false);
			}
		}
		disturbed.push_back(false);
		int count=0;
		//for(int i=0;i<numHouses;i++){
		//	cout<<disturbed[i]<<endl;
		//}
		for(int i=1;i<numHouses-2;i++){
			if(disturbed[i]){
				if(disturbed[i+2]){
					count++;
					houses[i+1]=0;
					disturbed[i]=false;
					disturbed[i+2]=false;
				}
			}
		}
		for(int i=1;i<numHouses-1;i++){
			if(disturbed[i]){
				count++;
			}
		}
		cout<<count<<endl;
	}
	return 0;
}
