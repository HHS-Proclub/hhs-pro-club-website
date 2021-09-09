import java.util.Scanner;
public class PRB10 {
	public static void main(String[] args){
		Scanner s  = new Scanner(System.in);
		
		String x = s.next();
		String[] str_array = x.split("/");
		String stringa = str_array[0]; 
		String stringb = str_array[1];
		int a = Integer.parseInt(stringa);
		int b = Integer.parseInt(stringb);
		
		int resultb = b;
		int resulta = a;
		while (a != 0 && b != 0)
		{
			if (a >= b)
			{
				a = a - b;
			}
			else{
				b = b - a;
			}
		}
		if (a == 0){ 
    			System.out.println(resulta/b + "/" + resultb/b );
		}
		else{
    			System.out.println(resulta/a + "/" + resultb/a);
		}
	}
}