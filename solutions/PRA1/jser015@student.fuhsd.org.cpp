#include <iostream>
using namespace std;

int findSumOfDigits(long long);
int findGCD(long long, int);
int euclidAlg(int, long long);

int main()
{
    int t{ 0 };
    long long n{ 0 };

    cin >> t;
    long long x{ 0 };

    for (int i = 0;i < t;i++) {
        // get n from cin
        cin >> n;

        // find the value "x"
        for (x = n;findGCD(x, findSumOfDigits(x)) == 1;x++) {

        }

        cout << x << endl;
    }
}

int findSumOfDigits(long long num) {
    // find the sum of the digits
    int sumOfDigits{ 0 };
    for (long long numCopy = num;numCopy > 0;numCopy /= 10) {
        sumOfDigits += numCopy % 10;
    }

    return sumOfDigits;
}

int findGCD(long long x, int sumOfDigits) {
    int smallerNum{ 0 };
    long long biggerNum{ 0 };

    if (x > sumOfDigits) {
        biggerNum = x;
        smallerNum = sumOfDigits;
    }
    else {
        biggerNum = sumOfDigits;
        smallerNum = x;
    }

    int returnVal = euclidAlg(smallerNum, biggerNum);
    //cout << "GCD between " << x << " and " << sumOfDigits << ": " << returnVal << endl;

    return returnVal;
}

int euclidAlg(int smallerNum, long long biggerNum) {
    //cout << "smaller nummber: " << smallerNum << " bigger number: " << biggerNum << endl;

    if (smallerNum == 0) {
        return biggerNum;
    }

    biggerNum %= smallerNum;
    return euclidAlg(biggerNum, smallerNum);
}
