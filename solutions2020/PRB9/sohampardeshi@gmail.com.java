import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		
		for(int i = 0; i < n; i++){
			char[] arr = s.nextLine().toCharArray();
			if(arr[0] != 'a') arr[0] = ' ';
			if(arr[1] != 'b') arr[1] = ' ';
			System.out.println(new String(arr).replaceAll(" ", ""));
		}
	}
}