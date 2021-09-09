import java.util.Scanner;

public class PRB3 {
	static Scanner k = new Scanner(System.in);
	
	public static void main (String[] args){
		int nn = k.nextInt();
		int holder = nn;
			for (int n=0;n<nn;n++){
				int tn = k.nextInt();
				if (tn>holder){
					holder = tn;
				}
			}
			System.out.println(holder);
		}
	}
