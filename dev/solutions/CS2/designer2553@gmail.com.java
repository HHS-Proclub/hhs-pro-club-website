import java.util.*;

public class CS2 {
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		int iteration = kboard.nextInt();
		
		int[] list = new int[iteration];
		
		for (int i = 0; i < iteration; i++) {
			list[i] = kboard.nextInt();
		}
		
		int pivot = list[0];
		LinkedList<Integer> collection = new LinkedList<Integer>();
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] <= pivot)
				collection.addFirst(list[i]);
			else
				collection.addLast(list[i]);
		}
		
		String s = collection.toString().replace("[", "").replace("]", "").replace(",", "");
		System.out.println(s);
	}
}
