import java.util.Scanner;

public class PROCO3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++){
			int count = 0;
			int val = 0;
			int x = s.nextInt();
			while(count!=x){
				val+=5;
				if(check(val))
					count++;
				
				
			}
			System.out.println(val);
		}
	}
	
	public static boolean check(int val){
		while(true){
			if(val %5==0){
				val/=5;
			} else if(val%5 == 1){
				val = (val-1)/5;
			} else {
				return false;
			}
			if(val == 1)
				return true;
		}
	}

}
