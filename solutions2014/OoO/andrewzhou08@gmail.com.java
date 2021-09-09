
public class OoO {
	public static void main(String[] Args){
		int x = 65;
		int y = 25;
		int z = 35;
		
		
		int p1 = (x - y) * (y - x); //400
		int p2 = (y - z) * (z - y); //-100
		int p3 = (z - x) * (x - z); //-900
		
		int result = p1/(p2 % p3 + p1);
		System.out.println(result);
	}
}
