#include <iostream>
#include <vector>
#include <set>
using namespace std;

int dfs(vector<bool> &seen,vector<int> &prices,vector<set<int> > &adj,int current,int curPrice){
	seen[current]=true;
	auto it=adj[current].begin();
//	cout<<current<<endl;
	for(int i=0;i<adj[current].size();i++){
		if(!seen[*it]){
			curPrice=min(dfs(seen,prices,adj,*it,curPrice),curPrice);
		}
		it++;
	}
	return min(prices[current],curPrice);
}

int main(){
	int t;cin>>t;
	for(int cantTouch=0;cantTouch<t;cantTouch++){
		vector<bool> seen;
		vector<int> prices;
		vector<set<int> > adj;
		int current;
		int curPrice;
		long cost=0;
		int numFriends;
		int numConnections;
		cin>>numFriends>>numConnections;
		for(int i=0;i<numFriends;i++){
			set<int> tempSet;
			int temp;
			seen.push_back(false);
			cin>>temp;
			prices.push_back(temp);
			adj.push_back(tempSet);
		}
		for(int i=0;i<numConnections;i++){
			int a;int b;
			cin>>a>>b;
			adj[a-1].insert(b-1);
			adj[b-1].insert(a-1);
		}
		for(int i=0;i<numFriends;i++){
			if(!seen[i]){
				current=i;
				curPrice=prices[i];
//				cout<<i<<" "<<cost<<endl;
				cost+=(long)dfs(seen,prices,adj,current,curPrice);
			}
		}
		cout<<cost<<endl;
	}
	return 0;

}
