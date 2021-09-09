#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>
#include <iostream>

using namespace std;

long long cases;
long long numPeople;
long long winsNeeded;

int main() {
    cin >> cases;
    
    for (long long i=0; i<cases; i++) {
        
        long long order[1000000] = {0};
        
        cin >> numPeople >> winsNeeded;
        
        for (long long k=0; k<numPeople; k++) {
            cin >> order[k];
        }
        
        long long cur = -1;
        long long count;
        
        bool answerNotFound = true;
        
        while (answerNotFound) {
            count = 0;
            cur++;
            for (long long a = 1; a<=winsNeeded; a++) {
                if (cur+a < 1000000) {
                    if (order[cur] > order[(cur+a)]) {
                        count++;
                    }
                    else {
                        break;
                    }
                }
                else {
                    count = winsNeeded;
                    break;
                }
                
            }
            
            if (count >= winsNeeded) {
                answerNotFound = false;
            }
            
        }
        
        cout << order[cur] << endl;
        
        
    }
}