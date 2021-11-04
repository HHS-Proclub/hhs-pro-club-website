#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

void vectorExample() {
	vector<int> v = { 5, 3, 0, 4, 7, 3 };
	sort(v.begin(), v.end());

	for (int i = 0;i < v.size();i++) {
		cout << v.at(i) << endl;
	}
}

int main() {
	int t;
	cin >> t;


	string temp;
	getline(cin, temp);

	char vowels[5] = { 'a', 'e', 'i', 'o', 'u' };
	int vowelCount = 0;
	bool isHaiku;

	string in;
	for (int i = 0;i < t;i++) {
		//cout << "hello" << t;
		isHaiku = true;
		for (int j = 0;j < 3;j++) {
			getline(cin, in);
			vowelCount = 0;
			for (int k = 0;k < in.length();k++) {
				for (int l = 0;l < 5;l++) {
					if (tolower(in.at(k)) == vowels[l]) {
						vowelCount++;
					}
				}
			}
			//cout << vowelCount << endl;
			if (j % 2 == 1) {
				if (vowelCount != 7) {
					isHaiku = false;
				}
			}
			else {
				if (vowelCount != 5) {
					isHaiku = false;
				}
			}
		}
		if (isHaiku) {
			cout << "YES" << endl;
		}
		else {
			cout << "NO" << endl;
		}
	}
}
