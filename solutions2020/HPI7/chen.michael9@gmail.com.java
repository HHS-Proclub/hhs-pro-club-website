import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HPI7 {
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		int xStart = Integer.parseInt(token.nextToken()), yStart = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(kboard.nextLine());
		int xEnd = Integer.parseInt(token.nextToken()), yEnd = Integer.parseInt(token.nextToken());
		System.out.println(findShortest(n, new Point(xStart, yStart, n), new Point(xEnd, yEnd, n)));
	}
	
	public static int findShortest(int n, Point start, Point end) {
		
		PriorityQueue<Point> queue = new PriorityQueue<Point>(new Comparator<Point>() {

			@Override
			public int compare(Point arg0, Point arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.length, arg1.length);
			}
			
		});
		
		queue.add(start);
		
		while (!queue.isEmpty()) {
			Point top = queue.poll();
			if (top.x == end.x && top.y == end.y) {
				return top.length;
			}
			boolean[][] visited = top.visited;
			if (top.x + 2 <= n && top.y + 1 <= n && visited[top.x + 2 - 1][top.y + 1 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x + 2 - 1][top.y + 1 - 1] = true;
				queue.add(new Point(top.x + 2, top.y + 1, top.length + 1, temp));
			}
			if (top.x + 2 <= n && top.y - 1 >= 1 && visited[top.x + 2 - 1][top.y - 1 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x + 2 - 1][top.y - 1 - 1] = false;
				queue.add(new Point(top.x + 2, top.y - 1, top.length + 1, temp));
			}
			if (top.x + 1 <= n && top.y + 2 <= n && visited[top.x + 1 - 1][top.y + 2 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x + 1 - 1][top.y + 2 - 1] = true;
				queue.add(new Point(top.x + 1, top.y + 2, top.length + 1 , temp));
			}
			if (top.x + 1 <= n && top.y - 2 >= 1 && visited[top.x + 1 - 1][top.y - 2 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x + 1 - 1][top.y - 2 - 1] = true;
				queue.add(new Point(top.x + 1, top.y - 2, top.length + 1, temp));
			}
			if (top.x - 2 >= 1 && top.y + 1 <= n && visited[top.x - 2 - 1][top.y + 1 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x - 2 - 1][top.y + 1 - 1] = true;
				queue.add(new Point(top.x - 2, top.y + 1, top.length + 1, temp));
			}
			if (top.x - 2 >= 1 && top.y - 1 >= 1 && visited[top.x - 2 - 1][top.y - 1 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x - 2 - 1][top.y - 1 - 1] = true;
				queue.add(new Point(top.x - 2, top.y - 1, top.length + 1, temp));
			}
			if (top.x - 1 >= 1 && top.y + 2 <= n && visited[top.x - 1 - 1][top.y + 2 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x - 1 - 1][top.y + 2 - 1] = true;
				queue.add(new Point(top.x - 1, top.y + 2, top.length + 1, temp));
			}
			if (top.x - 1 >= 1 && top.y - 2 >= 1 && visited[top.x - 1 - 1][top.y - 2 - 1] == false) {
				boolean[][] temp = new boolean[visited.length][visited.length];
				for (int i = 0; i < visited.length; i++) {
					for (int j = 0; j < visited[0].length; j++) {
						temp[i][j] = visited[i][j];
					}
				}
				temp[top.x - 1 - 1][top.y - 2 - 1] = true;
				queue.add(new Point(top.x - 1, top.y - 2, top.length + 1, temp));
			}
		}
		return 0;
	}
	
	static class Point {
		int x, y;
		int length;
		boolean[][] visited;
		public Point(int x, int y, int n) {
			this.x = x;
			this.y = y;
			this.length = 0;
			visited = new boolean[n][n];
		}
		public Point(int x, int y, int n, int value) {
			this.x = x;
			this.y = y;
			this.length = value;
			visited = new boolean[n][n];
		}
		public Point(int x, int y, int value, boolean[][] visited) {
			this.x = x;
			this.y = y;
			this.length = value;
			this.visited = visited;
		}
	}
}
