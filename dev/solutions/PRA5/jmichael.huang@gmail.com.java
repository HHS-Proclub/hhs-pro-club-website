import java.util.Scanner;

public class PRA5 {
	private int iterations;

	public PRA5() {
		iterations = 0;
	}

	public void printHanoiSolution(int numberOfDisks) {
		solveHanoi(numberOfDisks, 1, 2, 3);
		System.out.println(iterations);
	}

	private void solveHanoi(int disks, int start, int hold, int finish) {
		iterations++;
		if (disks == 1)
		{
			
		}
		else {
			disks--;
			solveHanoi(disks, start, finish, hold);
			solveHanoi(disks, hold, start, finish);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int x = Integer.parseInt(input);
		
		PRA5 h = new PRA5();
    	h.printHanoiSolution(x);
	}
}
