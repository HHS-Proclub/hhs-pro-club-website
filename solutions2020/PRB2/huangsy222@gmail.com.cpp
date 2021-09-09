#include <cstdio>

#define MAX_SL 15
#define MAX_S 300

using namespace std;

int cases;
int R, C, N, K;

struct student {
	int x, y;
	student (int a, int b) {
		x = a;
		y = b;
	}
	student () {
		student(-1, -1);
	}
	bool inRect(int a, int b, int c, int d) {			//a = x1, b = y1, c = x2, d = y2. x1 <= x2, y1 <= y2
		return (x>=a&&x<=c&&y>=b&&y<=d);
	}	
} students[MAX_S];

int main() {
	scanf(" %d", &cases);
	for(int caseN = 0;caseN < cases;caseN++) {
		scanf(" %d %d %d %d", &R, &C, &N, &K);
		for(int i = 0;i < N;i++) {
			scanf(" %d %d", &students[i].y, &students[i].x);
		}
		int ans = 0;
		for(int x1 = 1;x1 <= C;x1++) {
			for(int y1 = 1;y1 <= R;y1++) {
				
				for(int x2 = x1;x2 <= C;x2++) {
					for(int y2 = y1;y2 <= R;y2++) {
						
						int count = 0;
						for(int i = 0;i < N;i++) {
							if(students[i].inRect(x1, y1, x2, y2)) {
								count++;
							}
						}
						if(count>=K) {
							ans++;
						}
						
					}
				}
				
			}
		}
		
		printf("%d\n", ans);
	}
}