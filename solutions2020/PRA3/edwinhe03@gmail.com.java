import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int x = 0; x < cases; x++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int p = sc.nextInt();
			
			boolean done = false;
			if(n == k) {
				System.out.println(1);
				done = true;
			}
			long counter = k;
			long largePrev = k;
			long smallPrev = 0;
			long temp = 0;
			
			while(!done) {
			//for(int j = 0; j < 3; j++) {
				long given = 0;
				long sub1 = counter-p;
				long sub2 = (counter-1)-(n-p);
				long add1 = 0;
				long add2 = 0;
				//Counts given
				if(counter-p < 0){
					add1 = p-counter;
					sub1 = 0;
				}
				if((counter-1)-(n-p) < 0) {
					add2 = (n-p)-(counter-1);
					sub2 = 0;
				}
				given = (long) (Math.pow(counter, 2)-(Math.pow(sub1, 2)+sub1)/2-(Math.pow(sub2, 2)+sub2)/2)+add1+add2;
				//System.out.println(counter+" "+given);
				//System.out.println(Math.pow(counter, 2)+" "+(Math.pow(sub1, 2)+sub1)/2+" "+(Math.pow(sub2, 2)+sub2)/2+" "+add1+" "+add2);
				
				if(given == k) {
					System.out.println(counter);
					done = true;
				}else if(given < k) {
					//If it works
					if(largePrev-counter == 1) {
						if(largePrev == k) {
							counter++;
							System.out.println(counter);
							done = true;
						}else {
							System.out.println(counter);
							done = true;
						}
					}else {
						temp = counter;
						counter = (counter+largePrev)/2;
						smallPrev = temp;
					}	
				}else {
					//If it doesn't work
					if(counter-smallPrev == 1 && smallPrev != 0) {
						System.out.println(smallPrev);
						done = true;
					}else {
						temp = counter;
						counter = (counter+smallPrev)/2;
						largePrev = temp;
					}
				}				
			}
		}
	}
}
