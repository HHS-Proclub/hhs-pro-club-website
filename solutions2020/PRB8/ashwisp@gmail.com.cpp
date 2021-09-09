#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <list>

using namespace std;

int main()
{
    int n;
    long long int questions, correct, counter, min_score;
    cin >> n;
    long long int sol[n];

    for (int x = 0; x < n; x++)
    {
      cin >> questions >> correct >> counter;
      bool arr[questions];
      for (long long int y = 0; y < questions; y++)
      {
        arr[y] = false;
      }
      long long int c = 0;
      long long int index = 0;
      long long int times = 0;
      min_score = 0;
      while (c != correct)
      {
        arr[index] = true;
        c++;
        index+=counter;
        if (index >= questions)
        {
          times++;
          index = times;
        }
      }

      long long int consecutive_correct = 0;
      for (long long int z = 0; z < questions; z++)
      {
        if (arr[z])
        {
          consecutive_correct++;
          min_score++;
        }
        else
        {
          consecutive_correct = 0;
        }

        if (consecutive_correct == counter)
        {
          min_score*=2;
          consecutive_correct = 0;
        }
      }
      sol[x] = min_score;
      /*for (long long int y = 0; y < questions; y++)
      {
        cout << arr[y] << " ";
      }
      cout << endl;*/
    }

    for (int a = 0; a < n; a++)
    {
      cout << sol[a] << endl;
    }
    return 0;
}
