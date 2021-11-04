#include <iostream>

using namespace std;

string trimLeft(string str) {
    int idx = 0;
    for (int i = 0; i < str.length(); ++i) {
        if (str.at(i) != '0') {
            idx = i;
            break;
        }
    }
    return str.substr(idx);
}

//string trimRight(string str) {
//    int idx = int(str.length()) - 1;
//    for (int i = idx; i >= 0; --i) {
//        if (str.at(i) != '0') {
//            idx = i;
//            break;
//        }
//    }
//    return str.substr(0, idx + 1);
//}

int main() {
    std::cin.tie(nullptr);
    std::ios_base::sync_with_stdio(false);

    int t;
    cin >> t;
    ++t;
    while (--t) {
        string tmp;
        cin >> tmp;

        int cnt = 0;
        tmp = trimLeft(tmp);
        while (tmp != "1") {
            ++cnt;
            if (tmp.back() == '0') {
                tmp = tmp.substr(0, tmp.length() - 1);
            } else {
                ++tmp.back();
                for (int i = int(tmp.length()) - 1; i > 0; --i) {
                    if (tmp.at(i) == '2') {
                        tmp.at(i) = '0';
                        ++tmp.at(i - 1);
                    }
                }
                if (tmp.front() == '2') {
                    string one = "1";
                    tmp.front() = '0';
                    tmp = one.append(tmp);
                }
            }
        }
        cout << cnt << '\n';
    }

    return 0;
}