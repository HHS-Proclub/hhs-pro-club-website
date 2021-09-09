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
const int INF = 10000001;
int n, width, maxJump, stones, counter, maxFrogs;
int stonepos[100000001];

bool bin_search(int f)
{
  // cout << "Counter+1: " << counter+1 << endl;
  if (f == 0)
  {
    return true;
  }

  if (counter+1 < f)
  {
    return false;
  }
  // cout << "Going through loop: " << endl;
  for (int index1 = 0; index1 <= counter; index1++)
  {
    int index2 = index1+f;
    if (index2 > counter)
    {
      index2 = counter;
    }
    if (stonepos[index2] - stonepos[index1] > maxJump)
    {
      return false;
    }
  }
  return true;
}

int main() {
    cin >> n;
    for (int x = 0; x < n; x++)
    {
      cin >> width >> maxJump;

      stonepos[0] = 0;
      counter = 1;
      for (int w = 1; w < width; w++)
      {
        cin >> stones;
        for (int s = 0; s < stones; s++)
        {
          stonepos[counter] = w;
          counter++;
        }
      }
      stonepos[counter] = width;

      /*cout << endl;
      for (int x = 0; x <= counter; x++)
      {
        cout << stonepos[x] << " ";
      }*/

      int left = 0;
      int right = INF;
      int frogs;

      while (left <= right)
      {
        frogs = (right+left)/2;
        // cout << "Left: " << left << " Right: " << right << endl;
        // cout << "frogs: " << frogs << endl;
        if (!bin_search(frogs))
        {
          // cout << frogs << " frogs don't work" << endl;
          right = frogs-1;
        }
        else
        {
          // cout << frogs << " frogs works" << endl;
          maxFrogs = frogs;
          left = frogs+1;
        }
      }
      cout << maxFrogs << endl;
    }
    return 0;
}
