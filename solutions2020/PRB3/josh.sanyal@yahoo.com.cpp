#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <list>

using namespace std;

int cases;
long long number;


int main() {
	scanf(" %d", &cases);
	
	for (int ab=0; ab<cases; ab++) {
            
            scanf(" %lld", &number);
            
            long long tempNumber = number;
            long long tempNumber1 = number;
            list <int> difDigits;
            
            int digitsM = 0;
            
            while (tempNumber > 0) {
                tempNumber = tempNumber/10;
                digitsM++;
            }
            
            int digits[20];
            
            for (int i = 0; i < digitsM; i++) {
                int c = i;
                int count = 0;
                digits[i] = tempNumber1 % 10;
                tempNumber1 = tempNumber1/10;
                
                while (c > 0) {
                    c--;
                    if(digits[i] != digits[c]) {
                        count++;
                    }
                }
                
                if (count == i) {
                    difDigits.push_back(digits[i]);
                }
                
            }
            
            difDigits.sort();
            int diffDigits[difDigits.size()];
            
            int save = difDigits.size();
            
            for (int a = 0 ; a < save; a++) {  
                
                int hi = difDigits.front();
                difDigits.pop_front();
                diffDigits[a] = hi;
            }
            
  
                
            int iterations = 0;
            bool answerNotFound = true;
            int index = 0;
            
            int why = 0;
            for (int c = 0; c < save; c++) {
                if (diffDigits[0] == diffDigits[c]) {
                    why++;
                }
                
            }
            
            if (why == save) {
                answerNotFound = false;
                number = number + (diffDigits[0] * pow (10, digitsM));
            }
            
            while (answerNotFound) {
               int lastDigit = digits[index];
               index++;
               int lastDigitIndex;
               
               for (int b = 0 ; b < save; b++) { 
                   
                   if (lastDigit == diffDigits[b]) {                      
                       lastDigitIndex = b ;
                       
                       
                   }
               }
               
               
               if (lastDigitIndex < save-1) {
                   answerNotFound = false;
                   number = number - (diffDigits[lastDigitIndex] * pow (10, iterations)) + (diffDigits[lastDigitIndex+1] * pow (10, iterations));
               }
               else {               
                   long long num = (diffDigits[0] * pow (10, iterations));
                   long long num2 = (digits[iterations] * pow (10, iterations));
                   
                   number = number - num2 + num;
                   
               }
               iterations++;
               
               
               
                
            }
            
            printf("%lld\n", number);
            
            
            
            
	}

	return 0;
}