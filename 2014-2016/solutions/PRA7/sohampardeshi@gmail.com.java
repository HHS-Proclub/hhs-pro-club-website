import java.io.*;
import java.util.*;

public class PRA7 {

	public static void main(String[] Args) throws IOException{
		Scanner s = new Scanner(System.in);

		int len = Integer.parseInt(s.nextLine());
		int[][] arr = new int[len][len];

		for(int i = 0; i < len; i++)
			for(int j = 0; j < len; j++)
				arr[i][j] = s.nextInt();

		System.out.println(search(arr));
	}

	public static final int search(int[][] data) {
		int[][] mymap = new int[data.length][];
		for (int i = 0; i < data.length; i++)
			mymap[i] = Arrays.copyOf(data[i], data[i].length);

		return search(mymap, 0, 0);
	}
	public static int search(int[][] a, int i, int j){
		if(!valid(a, i,j) || a[i][j] == 1)	return 0;
		if(i == a.length - 1 && j == a[i].length - 1)	return 1; 

		a[i][j] = 1;
		int count = 0; 
		count += search(a, i + 1,j);
		count += search(a, i - 1,j);
		count += search(a, i,j + 1);
		count += search(a, i,j - 1);
		a[i][j] = 0;
		
		return count;
	}

	public static boolean valid(int[][] a, int i, int j){
		return i >= 0 && j >= 0 && i < a.length && j < a[i].length;
	} 
}