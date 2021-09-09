import java.util.Scanner;

public class PRA3 {
	
 private static boolean output;
public static void main(String[]Args){
	Scanner inputReader = new Scanner(System.in);
	int a = inputReader.nextInt();
	int b = a;
	System.out.println(isPossible(a, b));
 }
 public static String isPossible(int l, int w){
	 if (l % 2 == 1){ output = false; }
	 else if (l == 1){ output = false; }
	 else if (l == 2){ output = false; }
	 else if (l == 4){ output = false; }
	 else if (l == 3){ if(w==4){output = false; } else {output = true;}}
	 else if (l == 3){ if(w==6){output = false; } else {output = true;} }
	 else if (l == 3){ if(w==8){output = false; } else {output = true;} }
	 else{output = true;}
	 String answer = null;
	 if(output == true){answer = "YES";}
	 if(output == false){answer = "NO";}
	 return answer;
 }
}
