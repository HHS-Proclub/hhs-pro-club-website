#include <iostream>
using namespace std;

int main() {
    int longStep, step, dist, stepsTraveled, distTraveled;
    bool goodFoot = true;
    cin >> longStep >> dist;
    stepsTraveled = 0;
    distTraveled = 0;
    step = longStep/2;
    while (distTraveled<dist) {
        if(goodFoot){
            distTraveled = distTraveled + longStep;
            stepsTraveled++;
            goodFoot = false;
        }
        else if(goodFoot==false){
            distTraveled = distTraveled + step;
            stepsTraveled++;
            goodFoot = true;
        }
    }
    cout << stepsTraveled;
    return 0;
}
