#include <cstdio>

using ll = long long;

int T;
ll m, n;

int main(void)
{
	scanf("%d", &T);
	while(T--)
	{
		scanf("%lld%lld", &m, &n);
		printf("%lld\n", m*n);
	}
	return 0;
}
