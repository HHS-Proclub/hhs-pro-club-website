import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.text.DecimalFormat;

public class B1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
		int[] m;
		double result=0;
		double neg;
	     m=new int[n];
	     for(int i=0;i<n;i++){
	    	 m[i]=Integer.parseInt(br.readLine());
	     }
		for(int i:m){
			for(int j=0;j<i; j++){
				if(j%2>0)
					neg=-1;
				else
					neg=1;
				result+=neg/(j*2+1);
			}
			//result.setText(new DecimalFormat("##.##").format(result));
			result=(double)Math.round(result * 1000000000000000L) / 1000000000000000L;
			System.out.println(result);
			result=0;
		}
			

		}	
	
}
