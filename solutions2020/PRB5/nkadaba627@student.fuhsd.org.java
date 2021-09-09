import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] inValues = line.split(" ");
		int[] values = new int[inValues.length];
		for(int i = 0; i < inValues.length; i++){
		    values[i] = Integer.parseInt(inValues[i]);
		}
		String line2 = scan.nextLine();
		String[] inValues2 = line2.split(" ");
		int[] values2 = new int[inValues2.length];
		for(int s = 0; s < inValues2.length; s++){
		    values2[s] = Integer.parseInt(inValues2[s]);
		}
		System.out.println(ans(values)+ans(values2));
		
}
	public static int ans(int[] a){
		int l = 0;
		for(int k = 0;k < a.length;k++){
			if(a[k]>l && a[k]%10==0) l=a[k];
		}
		return l;
	}
}


