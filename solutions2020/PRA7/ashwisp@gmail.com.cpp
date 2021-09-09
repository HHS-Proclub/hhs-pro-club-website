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
long long int min_swaps, swaps00, swaps25, swaps50, swaps75;
string num;
const long long int INF = 10000000000;

long long int checkFor00()
{
  swaps00 = 0;
  string copy1 = num;
  long long int index1 = -1;
  long long int index2 = -1;
  for (int z = copy1.length()-1; z >= 0; z--)
  {
    if (copy1[z] == '0')
    {
      index1 = z;
      for (int b = z; b < copy1.length()-1; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps00+=copy1.length()-1-z;
      break;
    }
  }

  for (int z = copy1.length()-2; z >= 0; z--)
  {
    if (copy1[z] == '0')
    {
      index2 = z;
      for (int b = z; b < copy1.length()-2; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps00+=copy1.length()-2-z;
      break;
    }
  }
  if (copy1[0] == '0')
  {
    bool flag = false;
    for (int z = 0; z < copy1.length()-2;z++)
    {
      if (copy1[z] != '0')
      {
        swaps00+=z;
        flag = true;
        break;
      }
    }
    if (!flag)
    {
      swaps00 = INF;
    }
  }

  if (index1 == -1 || index2 == -1)
  {
    swaps00 = INF;
  }
  // cout << copy1 << endl;
  // cout << swaps00 << endl;
  return swaps00;
}

long long int checkFor50()
{
  swaps50 = 0;
  string copy1 = num;
  long long int index1 = -1;
  long long int index2 = -1;
  for (int z = copy1.length()-1; z >= 0; z--)
  {
    if (copy1[z] == '0')
    {
      index1 = z;
      for (int b = z; b < copy1.length()-1; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps50+=copy1.length()-1-z;
      break;
    }
  }

  for (int z = copy1.length()-2; z >= 0; z--)
  {
    if (copy1[z] == '5')
    {
      index2 = z;
      for (int b = z; b < copy1.length()-2; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps50+=copy1.length()-2-z;
      break;
    }
  }

  if (copy1[0] == '0')
  {
    bool flag = false;
    for (int z = 0; z < copy1.length()-2;z++)
    {
      if (copy1[z] != '0')
      {
        swaps50+=z;
        flag = true;
        break;
      }
    }
    if (!flag)
    {
      swaps50 = INF;
    }
  }

  if (index1 == -1 || index2 == -1)
  {
    swaps50 = INF;
  }
  // cout << copy1 << endl;
  // cout << swaps50 << endl;
  return swaps50;
}

long long int checkFor25()
{
  swaps25 = 0;
  string copy1 = num;
  long long int index1 = -1;
  long long int index2 = -1;
  for (int z = copy1.length()-1; z >= 0; z--)
  {
    if (copy1[z] == '5')
    {
      index1 = z;
      for (int b = z; b < copy1.length()-1; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps25+=copy1.length()-1-z;
      break;
    }
  }

  for (int z = copy1.length()-2; z >= 0; z--)
  {
    if (copy1[z] == '2')
    {
      index2 = z;
      for (int b = z; b < copy1.length()-2; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps25+=copy1.length()-2-z;
      break;
    }
  }

  if (index1 == -1 || index2 == -1)
  {
    swaps25 = INF;
  }

  if (copy1[0] == '0')
  {
    bool flag = false;
    for (int z = 0; z < copy1.length()-2;z++)
    {
      if (copy1[z] != '0')
      {
        swaps25+=z;
        flag = true;
        break;
      }
    }
    if (!flag)
    {
      swaps25 = INF;
    }
  }
  // cout << copy1 << endl;
  // cout << swaps25 << endl;
  return swaps25;
}

long long int checkFor75()
{
  swaps75 = 0;
  string copy1 = num;
  long long int index1 = -1;
  long long int index2 = -1;
  for (int z = copy1.length()-1; z >= 0; z--)
  {
    if (copy1[z] == '5')
    {
      index1 = z;
      for (int b = z; b < copy1.length()-1; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps75+=copy1.length()-1-z;
      break;
    }
  }

  for (int z = copy1.length()-2; z >= 0; z--)
  {
    if (copy1[z] == '7')
    {
      index2 = z;
      for (int b = z; b < copy1.length()-2; b++)
      {
        swap(copy1[b], copy1[b+1]);
      }
      swaps75+=copy1.length()-2-z;
      break;
    }
  }

  if (copy1[0] == '0')
  {
    bool flag = false;
    for (int z = 0; z < copy1.length()-2;z++)
    {
      if (copy1[z] != '0')
      {
        swaps75+=z;
        flag = true;
        break;
      }
    }
    if (!flag)
    {
      swaps75 = INF;
    }
  }

  if (index1 == -1 || index2 == -1)
  {
    swaps75 = INF;
  }
  // cout << copy1 << endl;
  // cout << swaps75 << endl;
  return swaps75;
}

int main() {
    int n;
    cin >> n;
    long long int sol[n];

    for (int x = 0; x < n; x++)
    {
      cin >> num;
      min_swaps = 0;
      bool flag = false;
      for (int y = 0; y < num.length(); y++)
      {
        if (num[y] == '5' || num[y] == '0')
        {
          flag = true;
        }
      }

      if (!flag)
      {
        min_swaps = -1;
      }
      else if (stoll(num) % 25 == 0)
      {
        min_swaps = 0;
      }
      else
      {
        long long int swaps[4];
        swaps[0] = checkFor00();
        swaps[1] = checkFor25();
        swaps[2] = checkFor50();
        swaps[3] = checkFor75();
        if (swaps[0] == INF && swaps[1] == INF && swaps[2] == INF && swaps[3] == INF)
        {
          min_swaps = -1;
        }
        else
        {
          sort(swaps, swaps+4);
          min_swaps = swaps[0];
        }
      }
      sol[x] = min_swaps;
    }

    for (int a = 0; a < n; a++)
    {
      cout << sol[a] << endl;
    }
    return 0;
}
