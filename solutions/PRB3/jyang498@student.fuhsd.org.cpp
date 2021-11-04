#include <iostream>
#include <vector>
#include <cstring>

using namespace std;

void dfs(vector<vector<int>> edges, int comp[], int c[], int &min, int at, int num) {
    comp[at] = num;
    if (c[at] < min) {
        min = c[at];
    }

    for (int next: edges.at(at)) {
        if (!comp[next]) {
            dfs(edges, comp, c, min, next, num);
        }
    }
}

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int t;
    cin >> t;
    ++t;
    while (--t) {
        int n, m;
        cin >> n >> m;

        int cs[n];
        for (int i = 0; i < n; ++i) {
            cin >> cs[i];
        }

        vector<vector<int>> edges(n);
        for (int i = 0; i < m; ++i) {
            int x, y;
            cin >> x >> y;
            --x;
            --y;
            edges[x].push_back(y);
            edges[y].push_back(x);
        }

        int comp[n];
        int num = 0;
        memset(comp, 0, sizeof comp);
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            if (!comp[i]) {
                int min = cs[i];
                dfs(edges, comp, cs, min, i, ++num);
                sum += min;
            }
        }

        cout << sum << '\n';
    }

    return 0;
}