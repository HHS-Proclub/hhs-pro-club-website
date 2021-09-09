#include <iostream>
#include <cmath>

using namespace std;

int years, n, d, m;
struct Point {
    int x, y;
};

double areaOfTriangle(Point a, Point b, Point c) {
    return abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
}

bool isInRectangle(Point v1, Point v2, Point v3, Point v4, Point check) {
    double areaOfRect = areaOfTriangle(v1, v2, v3) + areaOfTriangle(v2, v3, v4);
    double area1 = areaOfTriangle(v1, v2, check);
    double area2 = areaOfTriangle(v2, v3, check);
    double area3 = areaOfTriangle(v3, v4, check);
    double area4 = areaOfTriangle(v1, v4, check);
    return (areaOfRect == area1 + area2 + area3 + area4);
}

int main() {
    cin >> years;
    for (int i = 0; i < years; i++) {
        cin >> n >> d >> m;
        Point v1, v2, v3, v4;
        v1.x = 0;
        v1.y = d;
        v2.x = d;
        v2.y = 0;
        v3.x = n;
        v3.y = n-d;
        v4.x = n-d;
        v4.y = n;
        for (int i = 0; i < m; i++) {
            Point cricket;
            cin >> cricket.x >> cricket.y;
            if (isInRectangle(v1, v2, v3, v4, cricket)) {
                cout << "YES" << endl;
            }
            else {
                cout << "NO" << endl;
            }
        }
    }


}


