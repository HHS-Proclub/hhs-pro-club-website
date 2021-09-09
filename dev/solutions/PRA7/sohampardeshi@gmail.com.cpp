#include<bits/stdc++.h>
#define fi(i, a, b) for(int i = a; i < b ; ++i)
#define fd(i, a, b) for(int i = a; i < b ; --i)
#define all(c) c.begin(), c.end()

using namespace::std;
int compute_min_cost(vector<int> &h, vector<int> &v)
{
    int Hsegs = 1, Vsegs = 1, i = 0, j = 0;
    long long  cost = 0;
    while(i < h.size() && j < v.size())
    {
        if(h[i] > v[j])
        {
            cost += h[i++]*Hsegs;
            Vsegs++;
        }
        else
        {
            cost += v[j++]*Vsegs;
            Hsegs++;
        }
    }
    while(i < h.size())
    {
        cost += h[i++]*Hsegs;
    }
    while(j < v.size())
    {
        cost += v[j++]*Vsegs;
    }
    return cost;
}
bool compy(int a, int b)
{
    return a > b;
}
int main()
{
    int n, m ,ausi;
    cin>>m>>n;
    vector<int> h(m-1, 0);
    vector<int> v(n-1, 0);
    fi(i, 0, m-1)
    {
        cin>>ausi;
        h[i] = ausi;
     }
     fi(i, 0, n-1)
     {
         cin>>ausi;
         v[i] = ausi;
     }
     sort(all(h), compy);
     sort(all(v), compy);

     cout<<compute_min_cost(h, v)%(1000000000+7)<<endl;
}
