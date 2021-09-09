#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>

using namespace std;

int cases;
int islands;
int currentTrinket;
int noTrinketIndex;

int main() {
	scanf(" %d", &cases);
	
	for (int i=0; i<cases; i++) {
	    
		scanf(" %d", &islands);
		int currentAssortment[islands] = {0};
		int wantedAssortment[islands] = {0};
		
		
		for (int k=0; k<islands; k++) {
			scanf(" %d", &currentTrinket);
			currentAssortment[k] = currentTrinket;
			if (currentTrinket == 0) {
			    noTrinketIndex = k;
			}    
		}
	
	    for (int j=0; j<islands; j++) {
			scanf(" %d", &currentTrinket);
			wantedAssortment[j] = currentTrinket;
		}
		
		
        bool works = false;
	    
		for (int a = 0; a<(islands*(islands-1)); a++) {
		    if (noTrinketIndex == 0) {
		        int hold = currentAssortment[islands-1];
		        currentAssortment[islands-1] = currentAssortment[noTrinketIndex];
		        currentAssortment[noTrinketIndex] = hold;
		        noTrinketIndex = islands-1;
		    }
		    else {
		        int hold = currentAssortment[noTrinketIndex-1];
			    currentAssortment[noTrinketIndex-1] = currentAssortment[noTrinketIndex];
			    currentAssortment[noTrinketIndex] = hold;
			    noTrinketIndex--;
		    }
		    
		    int count = 0;

		    for (int b=0; b<islands; b++) {
		       if (currentAssortment[b] == wantedAssortment[b]) {
		           count++;
		       }
		    }
		    
		    
		    
		    if (count == islands) {
		       works = true;
		    }
			
		}
		
		if (works) {
		    printf("%s\n", "YES");
		}
		else {
		    printf("%s\n", "NO");
		}
	}

	return 0;
}