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

struct Coord
{
  int x;
  int y;
};

bool comp(Coord a, Coord b)
{
    return a.x < b.x;
}

int main()
{
    long long int N;
    cin >> N;
    long long int sol[N];

    for (long long int x = 0; x < N; x++)
    {
      struct Coord points[3];
      for (int a = 0; a < 3; a++)
      {
        cin >> points[a].x;
        cin >> points[a].y;
      }
      sort(points, points+3,comp);
      int result = 0;
      if (points[1].y >= points[0].y)
      {
        if (points[2].y >= points[1].y)
        {
          result+=(points[1].y-points[0].y-1)+(points[1].x-points[0].x);
          result+=(points[2].y-points[1].y-1)+(points[2].x-points[1].x);
        }
        else if (points[2].y < points[1].y && points[2].y >= points[0].y)
        {
          result+=(points[1].y-points[0].y-1)+(points[1].x-points[0].x);
          result+=(points[2].x-points[1].x-1);
        }
        else
        {
          result+=(points[1].y-points[0].y-1)+(points[1].x-points[0].x);
          result+=(points[0].y-points[2].y-1)+(points[2].x-points[1].x);
        }
      }
      else
      {
        if (points[2].y <= points[1].y)
        {
          result+=(points[0].y-points[1].y-1)+(points[1].x-points[0].x);
          result+=(points[1].y-points[2].y-1)+(points[2].x-points[1].x);
        }
        else if (points[2].y > points[1].y && points[2].y <= points[0].y)
        {
          result+=(points[0].y-points[1].y-1)+(points[1].x-points[0].x);
          result+=(points[2].x-points[1].x-1);
        }
        else
        {
          result+=(points[0].y-points[1].y-1)+(points[1].x-points[0].x);
          result+=(points[2].y-points[0].y-1)+(points[2].x-points[1].x);
        }
      }
      sol[x] = result+3;
    }

    for (long long int x = 0; x < N; x++)
    {
      cout << sol[x] << endl;
    }
    return 0;
}
