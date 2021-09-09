
public class NestedIf {
	public static void main(String[] Args){
		int x = 10 * 4 - 30 / 6;
		if(x > 20){
			if(x % 2 == 1) x *= 2;	
		}
			
		
		else
			x *= 3;
		
		System.out.println(x);
	
	}
}
