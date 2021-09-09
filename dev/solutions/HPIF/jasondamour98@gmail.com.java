import java.util.Scanner;


public class HPIF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		int r = in.nextInt();
		
		for(int i=0; i<100; i++){
			int x=(int) (((Math.pow(i,b))/1.000000007)+0.5);
			if(x==r){
				System.out.println(i);
			}
		}
	}

}
