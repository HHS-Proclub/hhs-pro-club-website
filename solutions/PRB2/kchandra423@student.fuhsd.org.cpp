#include <iostream>

using namespace std;

int countSyllables(const std::string &phrase) {
    int count = 0;
    for (char c: phrase) {
        c = tolower(c, std::locale());
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
    }
    return count;
}


int main() {
    std::string num;
    std::getline(std::cin, num);
    for (int i = 0; i < std::stoi(num); i++) {
        bool passed = true;
        std::string phrase;
        std::getline(std::cin, phrase);
        if (countSyllables(phrase) != 5) {
            passed = false;
        }
        std::getline(std::cin, phrase);
        if (countSyllables(phrase) != 7) {
            passed = false;
        }
        std::getline(std::cin, phrase);
        if (countSyllables(phrase) != 5) {
            passed = false;
        }
        if (passed) {
            std::cout << "YES"<<endl;
        } else {
            std::cout << "NO"<<endl;
        }


    }

    return 0;
}
