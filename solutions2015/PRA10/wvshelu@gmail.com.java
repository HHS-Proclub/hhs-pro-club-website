import java.util.Scanner;

public class PRA10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		
		int total = x*x;
		int count=0;
		for(int i=1;i<x+1;i++){
			for(int j=i;j<x+1;j+=i){
				count++;
			}
		}
		
		for(int k=count;k>1;k--){
			if(count/(double)k==(double)(count/k)&&total/(double)k==(double)(total/k)){
				count/=k;
				total/=k;
				k=count;
			}
				
		}
		
		System.out.println(count+"/"+total);
		
		
	}

}
