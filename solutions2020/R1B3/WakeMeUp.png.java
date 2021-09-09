import java.util.*;
public class R1B3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = 0;
		if(y==1){
			y = -5;
		}
		if(y==2){
			y = -3;
		}
		if(y==3){
			y = -3;
		}
		for(int i = 4; i <= x; i++){
			if(i%2== 0){
				
			}
			else if(i%3 == 0){
				
			}
			else {
				y= y+i;
						
			}
		}
		System.out.println(y+5);
	}
}
