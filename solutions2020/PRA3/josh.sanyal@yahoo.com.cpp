#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <iostream>

using namespace std;

int cases;
long long guests;
long long pillows;
long long royPos;


int main() {
    scanf(" %d", &cases);
    
    
    
    for (int i=0; i<cases; i++) {
        scanf(" %lld", &guests);
        scanf(" %lld", &pillows);
        scanf(" %lld", &royPos);
        
        
         royPos--;
        
        
        
        bool answerNotFound = true;
        long long iterations = 0;
        long long temp = guests;
        
        
        while (answerNotFound) {
            //cout << iterations << " : " <<  temp << "; " << pillows << endl;
            
            int count = 0;
            
            if (temp > pillows) {
                answerNotFound = false;
                break;
            }
            
            iterations++;
            
            temp++;
            
            
            for (int a=1; a<iterations; a++) {
                if (royPos-a >= 0) {
                    temp++;
                    count++;
                }
                if (royPos+a <= guests-1) {
                    temp++;
                    count++;
                }
                
            }
            
            if (count == guests-1) {
                while(answerNotFound) {
                    iterations++;
                    if (temp > pillows) {
                        //cout << temp << ">" << pillows << endl;
                        iterations--;
                        answerNotFound = false;
                        break;
                    }
                    temp += guests;
                    
                }
                break;
            }
            
            
            
            
            
        }
        
        
        
        printf("%lld\n", iterations);
        
        
    }
    
}