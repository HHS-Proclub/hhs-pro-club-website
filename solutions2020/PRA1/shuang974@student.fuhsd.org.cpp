#include <iostream>

using namespace std;

int v[10000], vm;


int find(int g) {

int l = -1, h = vm;
while(h > l + 1) {
int m = (l + h)/2;
if(g < v[m]) h = m;
else l = m;
}

return h;
}

int p10[6];

bool vs[10];
int r;
void gen(int a) {
if(a < 0) {
v[vm++] = r;
return;
}

for(int i = 0;i < 10;i++) {

if(!vs[i]) {

vs[i] = true;
r += p10[a] * i;
gen(a - 1);
vs[i] = false;
r -= p10[a] * i;

}

}

}

int main() {

for(int i = 0;i < 10;i++) vs[i] = false;
p10[0] = 1;
for(int i = 1;i < 6;i++) p10[i] = p10[i - 1] * 10;
r = 0;

gen(3);

int t;
cin >> t;
while(t--) {
int z;
cin >> z;
cout << v[find(z)] << endl;
}

return 0;
}