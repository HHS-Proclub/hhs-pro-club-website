import java.math.BigInteger;
import java.util.Scanner;

public class PRA1 {

	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>1){
			int[] past=new int[num];
			past[0]=2;
			int size=1;
			boolean isPrime;
			for(int i=3;i<num;i+=2){
				isPrime=true;
				for(int j=0;j<size&&past[j]<=(int)(Math.sqrt(i)+1);j++){
					if(i%past[j]==0){
						isPrime=false;
						break;
					}	
				}
				if(isPrime){
					past[size]=i;
					size++;
				}
			}
			
			long product=1;
			for(int i=0;i<size;i++){
				product*=past[i];
			}
			
			int c=0;
			long p=product;
			long eight=1;
			while(p>0){
				p/=8;
				c++;
				eight*=8;
			}
			c-=1;
			eight/=8;
			int curr=0;
			for(int i=c;i>-1;i--){
				curr=(int)(product/eight);
				System.out.print(curr);
				product-=curr*eight;
				eight/=8;
			}
		}
		
		else{
			System.out.println(num);
		}
		
	}
}
