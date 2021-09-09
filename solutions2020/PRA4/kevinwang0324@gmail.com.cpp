#include <iostream>
#include <string>

using namespace std;
#define Long unsigned long long

bool checkSeg(int A[], int seg, int length) {
    int sum = 0;
    for (int i = 0; i < length; i++) {
        sum += A[i];
        if (sum > seg) return false;
        else if (sum == seg) sum = 0;
    }
    return true;
}

bool checkTicket(Long ticketNum) {
    int seg = 0;
    int sum = 0;
    int length = to_string(ticketNum).length();
    string ticketChars = to_string(ticketNum);
    int ticketDigits[length];
    for (int i = 0; i < length; i++) {
        ticketDigits[i] = ticketChars[i] - '0';
    }
    for (int i = 0; i < length; i++) {
        sum += ticketDigits[i];
    }
    for (int i = 2; i < length; i++) {
        if (sum % i != 0) continue;
        seg = sum / i;
        if (checkSeg(ticketDigits, seg, length)) return true;
    }
    return false;
}

/*
Sample Input:
2
5
73452
4
1248
*/

int main() {
    int numTickets;
    cin >> numTickets;
    Long tickets[numTickets];
    int digits[numTickets];
    bool answer;
    int sum = 0;
    for (int i = 0; i < numTickets; i++) {
        cin >> digits[i] >> tickets[i];
        answer = checkTicket(tickets[i]);
        if (answer) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}



