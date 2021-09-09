import java.util.Scanner;

public class PRB3 {

		public int find(){
			
			Scanner s = new Scanner (System.in);
			int size = s.nextInt();
			int max = 0;
			
			for(int i = 0; i < size; i++){
				int nextInt = s.nextInt();
				if(nextInt > max)
					max = nextInt;
			}
			return max;
		}
		
		public static void main(String args[]){
			PRB3 m = new PRB3();
			System.out.println(m.find());
		}
}
