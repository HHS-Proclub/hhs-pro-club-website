import java.util.Scanner;


public class B1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		int [] array = new int[times];
		for(int i = 0;i<times;i++)
			array[i] = input.nextInt();
		
		for(int i = 0;i<times;i++){
			int n = array[i];
	        double ans = rec(array[i],0,0);
	        ans = (double)Math.round(ans * Math.pow(10, 15)) / Math.pow(10, 15);
	        String sAns = ans+"";
	        while(sAns.charAt(sAns.length()-1)=='0')
	        	sAns = sAns.substring(0,sAns.length()-1);
	        
	        if(sAns.charAt(sAns.length()-1)=='.')
	        	sAns = sAns.substring(0,sAns.length()-1);
	        System.out.println(sAns);
        
		}
		
	}
	
	public static double rec(int n,int loopNum, double ans){
		
		if(n==0)return ans;
		
		double den = loopNum*2 + 1;
		
		if(loopNum%2==0)
			ans += 1/den;
		else
			ans -= 1/den;
		
		
		return rec(n-1,loopNum+1,ans);
	}
	
	
	//0.760459904732351
	//0.7604599047323508

}
