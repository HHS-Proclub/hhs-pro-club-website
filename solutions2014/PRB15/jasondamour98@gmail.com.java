import java.util.Scanner;


public class PRB15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String a[] = new String[num];
		for(int x=0; x<num; x++){
			a[x] = in.nextLine();
		}
		for(int x=0; x<num; x++){
			if((a[x].charAt(0)+"").equals("_") && Character.isDigit(a[x].charAt(1))){
				System.out.println("VALID");
			}else{
				System.out.println("INVALID");
			}
		}
				
	}

}
