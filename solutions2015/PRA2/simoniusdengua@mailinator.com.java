import java.util.Scanner;


public class PRA2 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		String pr = s.next();
		String se = s.next();

		System.out.println(getDist(pr, se));
	}


	private static int minimum(int a, int b, int c) {                            
		return Math.min(Math.min(a, b), c);                                      
	}                                                                            

	//Fuck yeah, Floyd-Warshall + Levenshtein implementation!
	public static int getDist(String a, String b) {      
		int[][] distance = new int[a.length() + 1][b.length() + 1];        

		for (int i = 0; i <= a.length(); i++)                                 
			distance[i][0] = i;                                                  
		for (int j = 1; j <= b.length(); j++)                                 
			distance[0][j] = j;                                                  

		for (int i = 1; i <= a.length(); i++)                                 
			for (int j = 1; j <= b.length(); j++)                             
				distance[i][j] = minimum(distance[i - 1][j] + 1, distance[i][j - 1] + 1, distance[i - 1][j - 1] + ((a.charAt(i - 1) == b.charAt(j - 1)) ? 0 : 1));

		return distance[a.length()][b.length()];                           
	}
}
