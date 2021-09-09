import java.util.Scanner;


public class PRB10 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int test = input.nextInt();
			//for(test=0;test<=100;test++){
			boolean byThree = false, byFive = false;
			
			 if(test%3==0){
				byThree=true;
			}if(test%5==0){
				byFive=true;
			}if(byThree==false && byFive==false){
				System.out.println(test+"");
			}if(byThree==true && byFive==true){
				System.out.println("fizzbuzz");
				byThree=false; byFive=false;
			}if(byThree==true){
				System.out.println("fizz");
			}if(byFive==true){
				System.out.println("buzz");
			}
			//}

		}

}
