import java.io.*;
import java.util.*;

public class HPI {
	private static int M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numOps = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
	
		M = Integer.parseInt(st.nextToken());
		for(int i = 0; i < numOps; i++){
			st = new StringTokenizer(br.readLine());
			String next = st.nextToken();;
			if(next.equals("ADD")){
				add(Integer.parseInt(st.nextToken()));
				
			}else if(next.equals("DIV")){
				div(Integer.parseInt(st.nextToken()));
				
			}else if(next.equals("SUB")){
				sub(Integer.parseInt(st.nextToken()));
				
			}else if(next.equals("MUL")){
				mul(Integer.parseInt(st.nextToken()));
				
			}else if(next.equals("COB")){
				cob(Integer.parseInt(st.nextToken()));
				
			}
		}
		System.out.print(M);
	}
	public static void add(int i ){
		M += i;
	}
	public static void sub(int i){
		M-= i;
	}public static void mul(int i)
	{
		M *= i;
	}
	public static void div(int i){
		M/= i;
	}
	public static void cob(int base){
		int m2 = M;
		int sum = 0;
		int k = 0;
		while (m2 != 0) {
			sum += (m2 % 10) * Math.pow(base, k);
			m2 /= 10;
			k++;
		}
		M = sum;
	}

}