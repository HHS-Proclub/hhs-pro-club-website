import java.util.Scanner;

public class PRA4 {
	
	private static void permutation(String prefix, String str){

        int n = str.length();
        if (n == 0) 
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
	
	 public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			
			char data[] = new char[a];
			
			for (int i = 0; i < a; i++){
				data[i] = (char) (97+i);
			}
			
		    String str = new String(data);
	        permutation("", str);
	 }

}
