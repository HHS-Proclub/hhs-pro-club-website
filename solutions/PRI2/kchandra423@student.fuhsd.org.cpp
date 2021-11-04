#include <iostream>

using namespace std;

unsigned long long daisyMethod(unsigned long long num) {
    if (num < 1) {
        return 0;
    }
    unsigned long long count = 0;
    while (num != 1) {
        count++;
        if (num % 2 != 0) {
            num += 1;
        } else {
            num = num >> 1;
        }
    }
    return count;
}

unsigned long long convertToBase10() {
    string binarystring;
    unsigned long long sum = 0;
    getline(cin, binarystring);
    for (unsigned long long j = 0; j < binarystring.length(); j++) {
        if (binarystring[binarystring.length() - 1 - j] == '1') {
            sum += 1ll << j;
        }
    }
    return sum;
}

int main() {
    string num;
    getline(cin, num);
    for (int i = 0; i < stoi(num); i++) {
        unsigned long long number = convertToBase10();
        cout << daisyMethod(number) << endl;
    }
    return 0;
}
