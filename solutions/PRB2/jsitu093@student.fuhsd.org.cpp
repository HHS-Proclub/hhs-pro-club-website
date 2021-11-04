#include <iostream>
#include <math.h>
#include <string>
#include <algorithm>
#include <fstream>
#include <map>
#include <vector>
#include <deque>
#include <utility>
#include <string>

using namespace std;

char vowels[5] = {'a', 'e', 'i', 'o', 'u'};

int main() {
    int n;
    cin >> n;

    bool output[n];


    
    string temp;
    getline(cin, temp);
    
    for (int i = 0; i < n; i++){
        
        
        string line1;
        string line2;
        string line3;

        getline(cin, line1);
        getline(cin, line2);
        getline(cin, line3);


        int vowelCounter = 0;
        for (int j = 0; j < line1.size(); j++){
            for (int k = 0; k < 5; k++){
                if (line1[j] == vowels[k]){
                    vowelCounter++;
                    break;
                }
            }
        }

        if (vowelCounter != 5){
            output[i] = false;
            continue;
        }

        vowelCounter = 0;
        for (int j = 0; j < line2.size(); j++){
            for (int k = 0; k < 5; k++){
                if (line2[j] == vowels[k]){
                    vowelCounter++;
                    break;
                }
            }
        }

        if (vowelCounter != 7){
            output[i] = false;
            continue;
        }

        vowelCounter = 0;
        for (int j = 0; j < line3.size(); j++){
            for (int k = 0; k < 5; k++){
                if (line3[j] == vowels[k]){
                    vowelCounter++;
                    break;
                }
            }
        }

        if (vowelCounter != 5){
            output[i] = false;
            continue;
        }
        
        output[i] = true;


    }

    for (int i = 0; i < n; i++){
        if (output[i] == false){
            cout << "NO" << endl;
        }
        else {
            cout << "YES" << endl;
        }
    }


}
