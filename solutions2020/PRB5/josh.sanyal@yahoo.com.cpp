#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

int cases;


int main() {
    scanf(" %d", &cases);
    long long number = 0;
    long long zeros = 0;
    long long tempnumber = 0;
    
    for (int i=0; i<cases; i++) {
        
        scanf(" %lld", &number);
        scanf(" %lld", &zeros);
        
        tempnumber = number;
        bool answerNotFound = true;
        
        if (zeros == 0) {
            answerNotFound = false;
        }
        int counter = 0;
        
        int twos = 0;
        int fives = 0;
        
        while(tempnumber %2 == 0) {
            tempnumber = tempnumber/2;
            twos++;
        }
        while(tempnumber %5 == 0) {
            tempnumber = tempnumber/5;
            fives++;
        }
        
        
        while (answerNotFound) {
            counter = 0;
            
            if (twos > fives) {
                number*=5;
                fives++;
            }
            else if (fives > twos) {
                number*=2;
                twos++;
            }
            else {
                number*=10;
            }
            
            tempnumber = number;
            
            while (tempnumber % 10 == 0) {
                tempnumber /= 10;
                counter++;
            }
            
            
            if (counter == zeros) {
                answerNotFound = false;
            }
        }

        
        printf("%lld\n", number);
        
    }
    
}