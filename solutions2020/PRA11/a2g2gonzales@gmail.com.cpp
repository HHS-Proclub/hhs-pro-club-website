//
//  main.cpp
//  lis
//
//  Created by r on 7/10/17.
//  Copyright © 2017 r. All rights reserved.
//

#include <iostream>
#include <cstring>
using namespace std;

int seq[20002], best[20002];
int N;

int main(int argc, const char * argv[]) {
    int t = 0;
    cin >> t;
    for (int asdf = 0; asdf < t; asdf++) {
        cin >> N;
        for (int i = 0; i < N; i++) {
            cin >> seq[i];
        }
        int highestrun = 1;
        best[0] = seq[0];
        for (int i = 0; i < N; i++) {
            if (seq[i] < best[0]) {
                best[0] = seq[i];
            }
            for (int j = highestrun - 1; j >= 0; j--) {
                if (seq[i] > best[j] && (j == highestrun - 1 || seq[i] < best[j + 1])) {
                    j++;
                    best[j] = seq[i];
                    if (j == highestrun) {
                        highestrun++;
                    }
                    break;
                }
            }
        }
        cout << highestrun << endl;
        memset(seq, 0, sizeof(seq));
        memset(best, 0, sizeof(best));
    }
    return 0;
}