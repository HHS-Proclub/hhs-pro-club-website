#include <bits/stdc++.h>

using namespace std;

int LIS(int arr[], int n)
{
	int L[n] = { 0 };

	L[0] = 1;

	for (int i = 1; i < n; i++)
	{
		for (int j = 0; j < i; j++)
		{
			if (arr[j] < arr[i] && L[j] > L[i])
				L[i] = L[j];
		}
		L[i]++;
	}

	int lis = INT_MIN;
	for (int i = 0; i < n; i++) {
		int x = L[i];
		lis = max(lis, x);
	}

	return lis;
}

int main()
{
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        int length;
        cin >> length;
        int arr[length];
        for (int j = 0; j < length; j++) {
            cin >> arr[j];
        }
        cout << LIS(arr, length) << endl;
    }
}
