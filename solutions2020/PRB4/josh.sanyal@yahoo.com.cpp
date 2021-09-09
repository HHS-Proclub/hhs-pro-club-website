#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <vector>

using namespace std;

int cases;
long long aComputers;
long long bComputers;
long long bothComputers;

long long mouses;

vector<long long> costA;
vector<long long> costB;

long long tempCost;
int mouseType;




int main() {
    scanf(" %d", &cases);
    
    for (int i=0; i<cases; i++) {
        
        long long numComputers = 0;
        long long minPrice = 0;
        
        costA.assign(0, 0);
        costB.assign(0, 0);
        
        scanf(" %lld", &aComputers);
        scanf(" %lld", &bComputers);
        scanf(" %lld", &bothComputers);
        
        scanf(" %lld", &mouses);
        
        for (long long k=0; k<mouses; k++) {
            scanf(" %lld", &tempCost);
            scanf(" %d", &mouseType);
            
            if (mouseType == 0) {
                costA.push_back(tempCost);
            }
            else if (mouseType == 1) {
                costB.push_back(tempCost);
            }
        }
        
        sort(costA.begin(), costA.end());
        sort(costB.begin(), costB.end());
        
        
    for (long long a = 0; a<aComputers; a++) {
            if(costA.size() > 0) {
                minPrice += costA.front();
                costA.erase(costA.begin());
                numComputers += 1;
            }
        }
        
        for (long long b  = 0; b<bComputers; b++) {
            if(costB.size() > 0) {
                minPrice += costB.front();
                costB.erase(costB.begin());
                numComputers += 1;
            }
        }
        
        vector<long long> costBoth;
        costBoth.insert( costBoth.end(), costA.begin(), costA.end() );
        costBoth.insert( costBoth.end(), costB.begin(), costB.end() );
        sort(costBoth.begin(), costBoth.end());
        
        for (long long c  = 0; c<bothComputers; c++) {
            if(costBoth.size() > 0) {
                minPrice += costBoth.front();
                costBoth.erase(costBoth.begin());
                numComputers += 1;
            }
        }
        printf("%lld ", numComputers);
        printf("%lld\n", minPrice);
        
    }
    
}