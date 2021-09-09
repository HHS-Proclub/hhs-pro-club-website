import java.io.*;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		Queue<Integer> prev = new LinkedList<Integer>();
		prev.add(1);
		prev.add(1);
		for (int i = 0; i < n; i++)
			prev.add(prev.poll() + prev.peek());
		System.out.println(n);
	}
}
