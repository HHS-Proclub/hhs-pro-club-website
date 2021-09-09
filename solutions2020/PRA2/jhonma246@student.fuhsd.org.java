import java.util.Scanner;

public class PRA2 {
public static void main(String[] args){
Scanner in=new Scanner(System.in);
		double Normal = (in.nextInt()*2);
		double Hospital = (in.nextInt()*2);
		double Speed = (Normal*1.5);
		double distance = (Hospital/Speed*2);
		System.out.println(distance);
		
}

}
		
		
		
		
		
		
		/*int Hurt = (Normal*4);
		int avg = ((Normal + Hurt)/4);		
		int distance = (Hospital/avg);
		System.out.println(distance);
		}
	}*/
	