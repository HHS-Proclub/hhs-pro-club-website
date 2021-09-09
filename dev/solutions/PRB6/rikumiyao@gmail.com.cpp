#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
void printArray(vector<vector<int> >arr){
	for(int x=0;x<arr.size();x++){
		for(int y=0;y<arr[x].size();y++){
			if(y!=arr[x].size()-1){
				cout << arr[x][y] << " ";
			}
			else{
				cout << arr[x][y] << endl;
			}
		}
	}
}
vector<vector<int> > rotate(vector<vector<int> > arr, int start, int end){
	int n = arr.size();
	// vector<vector<int> >temp(n, vector<int>(n,0));
	// for(int x=0;x<n;x++){
	// 	for(int y=0;y<n;y++){
	// 		temp[x][y] = arr[x][y];
	// 	}
	// }
	vector<vector<int> >temp(arr);
	for(int x=start+1;x<=end;x++){
		arr[start][x] = temp[start][x-1];
	}
	for(int x=start+1;x<=end;x++){
		arr[x][end] = temp[x-1][end];
	}
	for(int x=end-1;x>=start;x--){
		arr[end][x] = temp[end][x+1];
	}
	for(int x=end-1;x>=start;x--){
		arr[x][start] = temp[x+1][start];
	}
	return arr;
}
int main(void){
	int n;
	cin >> n;
	// cout << n << endl;
	vector<vector<int> > arr(n, vector<int>(n,0));
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin >> arr[i][j];
		}
	}
	for(int x=0;x<n/2;x++){
		arr = rotate(arr, x, n-x-1);
		// printArray(arr);
	}
	printArray(arr);
}


