#include <iostream>
#include <cmath>

using namespace std;


int findLinesOfCode(long long num, long long v, int k) {
    long long sum = v;
    long long val = v;
    while (val > 0) {
        val /= k;
        sum += val;
    }
    if (sum > num) {
        return 1;
    } else if (sum == num) {
        return 0;
    } else {
        return -1;
    }

}


/*
 * n= sum(v/k^i,i)
 */
int main() {
    string numoflines;
    getline(cin, numoflines);

    for (long long i = 0; i < stoi(numoflines); i++) {
        string line;
        long long num;
        int k;
        getline(cin, line);
        num = stoi(line.substr(0, line.find(' ')));
        k = stoi(line.substr(line.find(' '), line.length()));
        long long v = 1;
        int output = findLinesOfCode(num, v, k);
        while (output == -1) {
            v *= 2;
            output = findLinesOfCode(num, v, k);
        }
        while(output>=0){
            v--;
            output = findLinesOfCode(num, v, k);
        }
        cout << v+1 << endl;


    }
    return 0;
}
