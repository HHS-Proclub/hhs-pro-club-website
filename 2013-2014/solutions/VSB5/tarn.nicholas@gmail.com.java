import java.util.*;

public class VSB5 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in) ;
		int n= keyboard.nextInt ();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
if(i==j||i+j==n+1){
	System.out.print("*");
}

else{
	System.out.print(" ");
}
				}
				System.out.println("");
		}
	}
}