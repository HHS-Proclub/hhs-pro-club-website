#include <iostream>
#include <algorithm>

// scuffed and intensely specialized implementation of a discrete one-dimensional kd-tree
struct bitree {
	int l, r; // inclusive
	enum { ZERO, ONE, MANY } type;
	union {
		struct {
			int x, d;
		} one;
		struct {
			struct bitree *l, *r;
		} many;
	} data;

	bitree(int l, int r)
		: type(ZERO), l(l), r(r)
	{
	}
	~bitree() {
		switch(type) {
		case ZERO:
			break;
		case ONE:
			break;
		case MANY:
			delete data.many.l;
			delete data.many.r;
			break;
		}
	}

	bool test(int x, int &d_o) {
		switch(type) {
		case ZERO:
			return false;
			break;
		case ONE:
			if(x == data.one.x) {
				d_o = data.one.d;
				return true;
			}
			break;
		case MANY:
			if(x - l <= (r - l) / 2) {
				return data.many.l->test(x, d_o);
			} else {
				return data.many.r->test(x, d_o);
			}
			break;
		}
		return false;
	}
	void insert(int x, int d) {
		switch(type) {
		case ZERO:
			type = ONE;
			data.one.x = x;
			data.one.d = d;
			break;
		case ONE:
			{
				int y = data.one.x;
				int e = data.one.d;
				type = MANY;
				data.many.l = new bitree(l, l + (r - l) / 2);
				data.many.r = new bitree(l + (r - l) / 2 + 1, r);
				insert(x, d);
				insert(y, e);
			}
			break;
		case MANY:
			if(x - l <= (r - l) / 2) {
				data.many.l->insert(x, d);
			} else {
				data.many.r->insert(x, d);
			}
			break;
		}
	}
};

int main() {
	int t;
	std::cin >> t;
	for(int i = 0; i < t; i++) {
		struct bitree s(-1e4, 1e4);
		int n;
		std::cin >> n;
		bool h = false;
		for(int j = 0; j < n; j++) {
			int x_j, d_j;
			std::cin >> x_j;
			std::cin >> d_j;
			if(h) {
				continue;
			}
			int d_o;
			if(s.test(x_j + d_j, d_o) && x_j + d_j + d_o == x_j) {
				h = true;
			}
			s.insert(x_j, d_j);
		}
		if(h) {
			std::cout << "YES" << std::endl;
		} else {
			std::cout << "NO" << std::endl;
		}
	}
	return 0;
}
