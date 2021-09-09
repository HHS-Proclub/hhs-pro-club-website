#include <iostream>
#include <set>
#include <vector>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    int n; cin >> n;
    while (n--) {
        int m; cin >> m;
        int v[m]; for (int i = 0; i < m; i++) cin >> v[i];
        int mxl = 0;
        set<pair<int, int> > st;
        st.insert(make_pair(-1000001, 0));
        for (int i = 0; i < m; i++) {
            set<pair<int, int> >::iterator it = st.lower_bound(make_pair(v[i], 0));
            --it;
            int lvv = it -> second + 1;
            st.insert(make_pair(v[i], lvv));
            mxl = max(mxl, lvv);
            it = st.upper_bound(make_pair(v[i], m + 1));
            vector<pair<int, int> > to_erase;
            while (it != st.end()) {
                if (it -> second <= lvv) to_erase.push_back(*it);
                else break;
                ++it;
            }
            for (int j = 0; j < to_erase.size(); j++) st.erase(st.find(to_erase[j]));
        }
        cout << mxl << endl;
    }
    return 0;
}
