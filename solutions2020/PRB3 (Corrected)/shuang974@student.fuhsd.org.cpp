#include <iostream>
#include <cstdio>

#include <vector>
#include <algorithm>

using namespace std;

int N, T, K;
vector<int> barns;

int binarySearch(vector<int> &arr, int item) {
	int low = -1;
	int high = arr.size();
	while(low+1<high) {
		int mid = (low+high)>>1;
		if(item > arr[mid]) {
			low = mid;
		} else {
			high = mid;
		}
	}
	return high;
}

int main() {
	
	cin >> T;
    for(int t = 0;t < T;t++) {
        barns.assign(0, -1);
        cin >> K >> N;
        
    	for(int i = 0;i < N;i++) {
    		int a;
    		cin >> a;
    		barns.push_back(a);
    	}
    	sort(barns.begin(), barns.end(), [](int a, int b){return a<b;});
	
    	long long answer = 0;
    	while(barns.size()>1) {
    		int inc = barns[0]+barns[1];
    		answer+=inc;
    		barns.erase(barns.begin());
    		barns.erase(barns.begin());
		
    		barns.insert(barns.begin()+binarySearch(barns, inc), inc);
    	}
	    cout << answer << endl;
    }
	
}