#include<iostream>
#include<string>
#include<math.h>

using namespace std;

int calculate_steps(int n) {
    int steps = 0;
    while(n != 1) {
        if(n % 2 != 0) {
            n++;
            steps++;
        }
        n = n / 2;
        steps++;
    }
    return steps;
}

void solve(string input) {
    int num = stoi(input, 0, 2);
    cout << calculate_steps(num) << endl;
}

int main() {
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        string input;
        cin >> input;
        solve(input);
    }
}