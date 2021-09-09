
public class OoO {
	public static void main(String[] Args){
		int x = 65;
		int y = 25;
		int z = 35;

		int p1 = (x - y) * (y - x);
		int p2 = (y - z) * (z - y);
		int p3 = (z - x) * (x - z);

		int result = p1/ (p2 % p3 + p1);
		System.out.println(result);
	}
}
