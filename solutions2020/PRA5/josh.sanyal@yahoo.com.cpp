#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>
#include <iostream>

using namespace std;

int cases;


int main() {
    cin >> cases;
    string text;
    
    
    for (int i=0; i<cases; i++) {
        cin >> text;
        int counter = 0;
        string answer;
        
        for (int i = 0; i<text.length(); i++) {
            
            if(text[i] == 97 || text[i] == 101 || text[i] == 105 || text[i] == 111 || text[i] == 117) {
                counter = 0;
            }
            else {
                if (i>=2) {
                    if (text[i] == text[i-1] && text[i] == text[i-2]) {
                        counter--;
                    }
                }
                
                counter++;
            }
            
            if(counter == 3) {
                answer += " ";
                counter = 0;
                i--;
            }
            else {
                answer += text[i];
            }
        }
        
        cout << answer << endl;
    }
    
    
    
}