import java.util.Scanner;

public class PRA3 {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] num=new int[size];
		int[] sum=new int[size];
		int u=0;
		for(int i=0;i<size;i++){
			int x=s.nextInt();
			num[i]=x;
			sum[i]=u;
			u+=x;
		}
		
		for(int i=0;i<size;i++){
			if(sum[i]*2+num[i]==u){
				System.out.println(i);
				break;
			}
		}
	}
}
