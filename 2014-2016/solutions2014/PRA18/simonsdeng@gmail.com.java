import java.util.*;
import java.awt.Point;

public class PRA18 {
	static int r;
	static int c;
	static int w;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		r = in.nextInt();
		c = in.nextInt();
		w = in.nextInt();
		in.nextLine();

		boolean[][] walls = new boolean[r][c];
		Point start = new Point();
		Point end = new Point();
		for (int i = 0; i < r; i++) {
			String s = in.nextLine();
			for (int j = 0; j < c; j++) {
				switch (s.charAt(j)) {
				case '#':
					walls[i][j] = true;
					break;
				case 'S':
					start.x = i;
					start.y = j;
					break;
				case 'E':
					end.x = i;
					end.y = j;
					break;
				}
			}
		}
		in.close();

		System.out.println(djikstras(start, end, walls));
	}

	private static int djikstras(Point start, Point end, boolean[][] walls) {
		final Map<Point, Integer> dist = new HashMap<>();
		Queue<Point> queue = new PriorityQueue<>(10,
				(Point a, Point b) -> dist.get(a) - dist.get(b));
		Map<Point, Integer> wallsLeft = new HashMap<>();
		List<Point> neighbors = new ArrayList<>(4);

		dist.put(start, 0);
		queue.add(start);
		wallsLeft.put(start, w);

		while (!queue.isEmpty()) {
			Point curr = queue.remove();

			if (curr.equals(end)) return dist.get(end);

			neighbors.clear();
			if (curr.x != 0) neighbors.add(new Point(curr.x - 1, curr.y));
			if (curr.x != r - 1) neighbors.add(new Point(curr.x + 1, curr.y));
			if (curr.y != 0) neighbors.add(new Point(curr.x, curr.y - 1));
			if (curr.y != c - 1) neighbors.add(new Point(curr.x, curr.y + 1));

			for (Point next : neighbors) {
				if (walls[next.x][next.y] && wallsLeft.get(curr) == 0) continue;
				int d = dist.get(curr) + (walls[next.x][next.y] ? 3 : 1);

				if (!dist.containsKey(next) || d < dist.get(next)) {
					dist.put(next, d);
					queue.add(next);
					wallsLeft.put(next, wallsLeft.get(curr) - (walls[next.x][next.y] ? 1 : 0));
				}
			}
		}

		return -1;
	}
}