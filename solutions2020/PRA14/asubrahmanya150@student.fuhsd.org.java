//package advanced;

import java.util.Scanner;

public class PRA14 {
	public static int n, k;
	public static int total = 0;
	public static void main(String[] args){
		int[] array;
		Scanner in = new Scanner(System.in);
		int reps =  Integer.parseInt(in.nextLine());
		for(int i = 0; i < reps; i++){
			total = 0;
			String[] raw = in.nextLine().split(" ");
			n = Integer.parseInt(raw[0]);
			k = Integer.parseInt(raw[1]);
			array = new int[n];
			for(int z = 0; z < n; z++){
				array[z] = 0;
			}
			boolean truth = true;
			boolean empty = true;
			while(!done(array)){
				truth = true;
				empty = true;
				array[n-1]++;
				while(empty){
					empty = false;
					for(int q = 1; q < n; q++){
						if(array[q] > k){
							array[q-1]++;
							array[q] = 1;
							empty = true;
						}
					}
				}
				
				for(int w = 0; w < n-1; w++){
						if(array[w]>array[w+1]){
							truth = false;
							//System.out.print("<=");
						}
						try{
							if(array[w]%array[w+1]==0 && !(array[w]==array[w+1])){
								truth = false;
							}
						}
					catch(Exception e){
						//System.out.print("err");
					}
					
				}
				if(truth){
					total++;
				}
				for(int z = 0; z < n; z++){
					//System.out.print(array[z] + " ");
					
				}
				if(truth){
					//System.out.print("T");
				}
				//System.out.print("\n");
			}
			System.out.println(total);
		}
	}
	public static boolean done(int[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i]!= k){
				return false;
			}
		}
		return true;
	}
	
}

