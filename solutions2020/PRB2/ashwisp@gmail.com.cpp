#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <stack>
#include <queue>
#include <list>
#include <math.h>

using namespace std;

double findArea(int x1, int y1, int x2, int y2, int x3, int y3)
{
  return fabs((x1*y2-y1*x2 + x2*y3-y2*x3 + x3*y1-y3*x1)/2.0);
}

int main() {
    int years, n,d, crickets;
    double tri1, tri2, tri3, tri4, rect;
    int x1,y1,x2,y2, x3,y3,x4,y4,cx,cy;
    cin >> years;

    for (int x = 0; x < years; x++)
    {
      cin >> n >> d;
      x1 = 0;
      y1 = d;
      x2 = d;
      y2 = 0;
      x3 = n;
      y3 = n-d;
      x4 = n-d;
      y4 = n;
      cin >> crickets;
      for (int c = 0; c < crickets; c++)
      {
        cin >> cx >> cy;
        tri1 = findArea(cx,cy,x1,y1,x4,y4);
        tri2 = findArea(cx,cy,x1,y1,x2,y2);
        tri3 = findArea(cx,cy,x2,y2,x3,y3);
        tri4 = findArea(cx,cy,x3,y3,x4,y4);
        rect = findArea(x1,y1,x2,y2,x3,y3) + findArea(x2,y2,x3,y3,x4,y4);
        // cout << "tri1: " << tri1 << endl;
        // cout << "tri2: " << tri2 << endl;
        // cout << "tri3: " << tri3 << endl;
        // cout << "tri4: " << tri4 << endl;
        // cout << "rect: " << rect << endl;
        if (rect == tri1 + tri2 + tri3 + tri4)
        {
          cout << "YES" << endl;
        }
        else
        {
          cout << "NO" << endl;
        }
      }

    }
}
