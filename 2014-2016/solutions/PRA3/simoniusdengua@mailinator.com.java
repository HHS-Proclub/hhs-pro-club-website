import java.util.Scanner;

public class PRA3 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] b = new int[a];
		for(int i = 0; i < a; i++)
			b[i] = s.nextInt();
		
		System.out.println(search(b));
	}                                                                         
	public static int search(int[] a) {  
		if(a.length == 1) return a[0];
			
		int start, sLeft, sRight, end = a.length - 1;
		start = sLeft = sRight = 0;
		while(start + 2 != end)
			if(sLeft > sRight)	sRight += a[end--];
			else				sLeft  += a[start++];
			
		return start + 1;
	}
}
