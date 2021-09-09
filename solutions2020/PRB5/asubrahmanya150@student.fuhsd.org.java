import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		// Parsing
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		String[] temp = a.split(" ");
		int[] one = new int[temp.length];
		for(int i = 0; i < temp.length; i++){
			one[i] = Integer.parseInt(temp[i]);
		}
		String[] temp2 = b.split(" ");
		int[] two = new int[temp.length];
		for(int i = 0; i < temp2.length; i++){
			two[i] = Integer.parseInt(temp2[i]);
		}
		//End of parsing
		//Get greatest multiple of 10
		int t = 0;
		for(int i = 0; i < one.length; i++){
			if(one[i]%10 == 0){
				if(one[i]>t){
					t = one[i];
				}
			}
		}
		int g = 0;
		for(int i = 0; i < two.length; i++){
			if(two[i]%10 == 0){
				if(two[i]>g){
					g = two[i];
				}
			}
		}
		System.out.println(g+t);
	}

}
