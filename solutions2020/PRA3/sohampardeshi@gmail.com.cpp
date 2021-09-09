#include <iostream>
#include <math.h>
#include <algorithm>
using namespace std;


struct task{ int importance, days, view; };
bool task_sorter(task const& lhs, task const& rhs){
	return ((double)lhs.days / lhs.importance) < ((double)rhs.days / rhs.importance);
}
int days(task arr[], int size, int totalDays, int workReq){
	int wcnt = 0, dcnt = 0;
	for(int i = 0; i < size; i++){
		int day = arr[i].days;
		int wrk = arr[i].importance;

		if(wcnt + wrk >= workReq){
			int dcnt2 = dcnt + day;
			for(int j = i; j < size; j++)
				if(wcnt + arr[j].importance >= workReq)
					dcnt2 = min(dcnt2, dcnt + arr[j].days);

			return dcnt2;
		}
		dcnt += day;
		wcnt += wrk;
	}

	return -1;
}


int main() {
	int cases;
	cin >> cases;
	for(int i = 0; i < cases; i++){
		int x, n, d; // days, assignments, work
		cin >> x >> n >> d;

		task arr[n]; // loaded tasks
		for(int j = 0; j < n; j++)	cin >> arr[j].importance >> arr[j].days;
		sort(arr, arr + n, &task_sorter);
		int total = days(arr, n, x, d);
		cout << (total == -1 ? -1 : x - total )<< endl;
	}
	return 0;
}
