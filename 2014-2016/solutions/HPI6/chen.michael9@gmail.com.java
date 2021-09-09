import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class HPI6 {
	public static Tree[] trees;
	private static int n, s, r;
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(read.readLine());
		n = Integer.parseInt(token.nextToken());
		s = Integer.parseInt(token.nextToken());
		r = Integer.parseInt(token.nextToken());
		trees = new Tree[n];
		for (int i = 0; i < n; i++) {
			token = new StringTokenizer(read.readLine());
			int d = Integer.parseInt(token.nextToken()), p = Integer.parseInt(token.nextToken());
			trees[i] = new Tree(p, d);
		}
		System.out.println(find(0, 0, 0));
	}
	public static int find(int total, int totalTime, int currentIndex) {
		if (currentIndex >= n || totalTime >= s) {
			return total;
		}
		int first = find(total + trees[currentIndex].point, totalTime + trees[currentIndex].distance + r, currentIndex + 1);
		int second = find(total, totalTime, currentIndex + 1);
		return Math.max(first, second);
	}
	static class Tree {
		int point, distance;
		public Tree(int point, int distance) {
			this.point = point;
			this.distance = distance;
		}
	}
}
