import java.awt.Point;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class PRA5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int k = in.nextInt();
		for (int i = 0; i < k; i++) {
			boolean escaped = false;
			final Point jerry = new Point(in.nextInt(), in.nextInt());
			final Point tom = new Point(in.nextInt(), in.nextInt());
			final Point mom = new Point(in.nextInt(), in.nextInt());
			ToIntFunction<Point> jerryHeuristic =
					(Point j) -> manhattanDistance(j, tom) + manhattanDistance(j, mom);
			ToIntFunction<Point> catHeuristic =
					(Point c) -> -manhattanDistance(c, jerry);
			while (!tom.equals(jerry) && !mom.equals(jerry)) {
				move(jerry, jerryHeuristic);
				move(tom, catHeuristic);
				move(mom, catHeuristic);
				if (jerry.x == -1 || jerry.x == N || jerry.y == -1 || jerry.y == M) {
					escaped = true;
					break;
				}
			}
			System.out.println(escaped ? 1 : 0);
		}
	}

	private static int manhattanDistance(Point p1, Point p2) {
		return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
	}

	private static void move(Point chrcter, ToIntFunction<Point> heuristic) {
		int bestHeuristic = Integer.MIN_VALUE;
		Point bestMove = chrcter;
		Point move = new Point(chrcter.x - 1, chrcter.y);
		int h = heuristic.applyAsInt(move);
		if (h > bestHeuristic) {
			bestHeuristic = h;
			bestMove = move;
		}
		move = new Point(chrcter.x + 1, chrcter.y);
		h = heuristic.applyAsInt(move);
		if (h > bestHeuristic) {
			bestHeuristic = h;
			bestMove = move;
		}
		move = new Point(chrcter.x, chrcter.y - 1);
		h = heuristic.applyAsInt(move);
		if (h > bestHeuristic) {
			bestHeuristic = h;
			bestMove = move;
		}
		move = new Point(chrcter.x, chrcter.y + 1);
		h = heuristic.applyAsInt(move);
		if (h > bestHeuristic) {
			bestHeuristic = h;
			bestMove = move;
		}
		chrcter.setLocation(bestMove);
	}
}
