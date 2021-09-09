import java.util.Scanner;
 
/*
Anantajit S.
 */
public class PRB3 {
	public static boolean divisor(int x, int y){
		if(y%x == 0){
			return true;
		}
		else{
			return false;
		}
	}
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int posnum = in.nextInt();
        int number;
        int[] cases = new int[posnum];
        for(int k = 0; k < posnum; k++){
        	cases[k] = in.nextInt();
        }
	int test = 1;
        // Process    
	for(int q = 0; q < posnum; q++){
		number = cases[q];
		test = 1;
        while(test<number+1){
		if(divisor(test,number) == true){
			System.out.println(test);
		}
		test = test+1;
	}
    }
    }
    
}
 