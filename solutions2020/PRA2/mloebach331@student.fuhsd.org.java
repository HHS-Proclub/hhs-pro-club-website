import java.util.Scanner;
public class PRA2 {

	public static void main(String[] args) {
		Scanner Bscan = new Scanner(System.in);
		
		int left = Bscan.nextInt();
		int right = left/2;
		int distance = Bscan.nextInt();
		boolean dest = false;
		int walked = 0;
		int steps = 0;
		
		while(dest == false){
			walked = walked + left;
			steps++;
				if(walked >= distance){
					dest = true;
				}else{
			walked = walked + right;
			steps++;
				if(walked >= distance){
					dest = true;
				}
			}
			//step one
			
		}
		System.out.println(steps);
		
		// TODO Auto-generated method stub

	}

}
