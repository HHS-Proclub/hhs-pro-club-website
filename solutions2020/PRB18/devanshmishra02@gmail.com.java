import java.util.Scanner;
public class PRB18 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++){
			String x1 = s.next();
			String x = x1.toLowerCase();
			boolean sf = true;
			for(int start = 0; start < x.length(); start++){
				for(int end = start+1; end < x.length(); end++){
					String x2 = x.substring(start, end); 
					if(x2.length()%2 == 0){
						String y = x2.substring(0, x2.length()/2 );
						String y1 = x2.substring(x2.length()/2, x2.length());
						if(y.equals(y1)){
							sf = false;
						}
					}
						
					
				}
			}
			if(sf){
				System.out.println("square-free");
			} else{
				System.out.println("not square-free");
			}
		}
	}
}
