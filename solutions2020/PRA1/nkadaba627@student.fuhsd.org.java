import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int j = s.nextInt();
		int[] w = new int[j];
 		for(int i = 0;i<j;i++) {
			w[i] = s.nextInt();
		}
 		for(int i = 0;i<j;i++) {
 			System.out.println(dos(w[i]+1));
 		}
	}
	
	public static int dos(int num) {
		while(!uniqueCharacters(num+"")) {
			num++;
		}
		return num;
	}
	
    static boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i=0; i<str.length(); i++)
            for (int j=i+1; j<str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
        // If no duplicate characters encountered,
        // return true
        return true;
    }

}
