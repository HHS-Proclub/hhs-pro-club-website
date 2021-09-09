import java.util.Scanner;

public class PRA6 {

	static char[][] grid;

	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);
		int xbound = kboard.nextInt();
		int ybound = kboard.nextInt();
		kboard.nextLine();
		grid = new char[ybound][xbound];
		for (int y = 0; y < ybound; y++) {
			grid[y] = kboard.nextLine().toCharArray();
		}

		int roomCount = 0;
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[0].length; x++) {
				if (grid[y][x] == '.') {
					floodfill(y, x);
					roomCount++;
				}
			}
		}
		System.out.println(roomCount - 1);

	}

	public static void floodfill(int y, int x) {
		if (x < 0 || y < 0 || x >= grid[0].length || y >= grid.length)
			return;
		if (grid[y][x] == '#')
			return;
		grid[y][x] = '#';
		floodfill(y + 1, x);
		floodfill(y - 1, x);
		floodfill(y, x + 1);
		floodfill(y, x - 1);
	}
}
