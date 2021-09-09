import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int z = 0; z < cases; z++) {
			int n = sc.nextInt();	// Number of the phones
			double c = sc.nextDouble();	// Charge rate per second
			double[][] phones = new double[n][2];	// Array of all the phones
			
			int[] charge_cnt = new int[n]; // how many times the phone is charged
			int drain_cnt = 0; // how many times phone is drained. same for all phones.
			double[] initial_power = new double[n];	// Array of all the phones
			
			for(int i = 0; i < n; i++) {
				phones[i][0] = sc.nextInt();	// Drain rate per second
				phones[i][1] = sc.nextLong();	// Current power
				initial_power[i] = phones[i][1]; // initial power
				charge_cnt[i] = 0 ; //
			}

			boolean done = false;
			double ratio = 0;	// Current power over drain rate
			for(int p = 0; p < phones.length; p++) {
				if(phones[p][1] == 0) {
					done = true;
				}
			}
			if(n != 0) {
				
				
				double time = 0.0; // total time
				double interval = 0.00001;
				
				while(!done) {
					time += interval;
					drain_cnt++;
					//System.out.println(time);
					// Find the phone with the least power ratio
					ratio = phones[0][1]/phones[0][0];
					long charge = 0;
					double drain = 0;
					for(int x = 1; x < phones.length; x++) {
						//System.out.println(phones[x][1]/phones[x][0]);
						if(phones[x][1]/(phones[x][0]) < ratio) {
							ratio = phones[x][1]/(phones[x][0]);
							drain = phones[x][0];
							charge = x;
						}
						if(phones[x][1]/(phones[x][0]) == ratio) {
							if(phones[x][0] > drain) {
								charge = x;
							}
						}
					}
					// Charge that phone and drain the power of all of the phones
					for(int a = 0; a < phones.length; a++) {
						
						if(a == charge) {
							//phones[a][1] += c*interval;
							charge_cnt[a] ++;
						}
						//phones[a][1] -= phones[a][0]*interval;
						phones[a][1] = initial_power[a] - drain_cnt*phones[a][0]*interval + charge_cnt[a]*c*interval;
						//System.out.print(a + " " + phones[a][1] + " " + charge_cnt[a] + ", ");
					}
					//System.out.println("charge " + charge + " time " + time + " drain_cnt " + drain_cnt);
					//if (time>0.001)  //debug
						//break;
					// Checks if any phone runs out of power
					for(int b = 0; b < phones.length; b++) {
						if(phones[b][1] <= 0) {
							done = true;
							break;
						}
					}
				}
				// Print out the time
				System.out.println((drain_cnt*interval));
			}else {
				System.out.println(0);
			}
		}*/
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int a = 0; a < cases; a++) {
			int n = sc.nextInt();
			double c = sc.nextInt();
			int aTotal = 0;
			int bTotal = 0;
			for(int i = 0; i < n; i++) {
				aTotal += sc.nextInt();
				bTotal += sc.nextInt();
			}	
			boolean done = false;
			double time = 1.0;
			double largePrev = 0.0;
			double smallPrev = 0.0;
			double temp = 0.0;
			while(!done) {
				System.out.println(bTotal+c*time+" "+aTotal*time+" "+time+" "+smallPrev+" "+largePrev);
				//if(bTotal+c*time-aTotal*time <= 0.001 && bTotal+c*time-aTotal*time >= -0.001) {
				if(bTotal+c*time-aTotal*time == 0) {
					done = true;
				}else if(bTotal+c*time-aTotal*time < 0) {
					temp = time;
					time = (time+smallPrev)/2;
					largePrev = temp;
				}else if(bTotal+c*time-aTotal*time > 0){
					if(largePrev == 0) {
						smallPrev = time;
						time = time*2;
					}else {
						temp = time;
						time = (time+largePrev)/2;
						smallPrev = temp;
					}
				}
			}
			System.out.println(time);
		}
	}
}
