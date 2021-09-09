public class PRB8{
	public static void main(String[] Args){
		int one = Scanner.nextInt();
		int two = Scanner.nextInt();

		System.out.println(    (a*b) / gcf(a,b)  );
	}
	public static int gcf(int a, int b){
		if(b == 0)
			return a;
		return(a, a%b);
	}
}