import java.util.*;

public class PRA2{

	public static void main(String[] args){
		Scanner ech = new Scanner(System.in);
		int swooooord = ech.nextInt();
		int butwhythough = ech.nextInt();
		int steps = 0;
		if(butwhythough%(swooooord*1.5 + .5) > 0)
			steps++;
			
		steps += butwhythough/((swooooord*1.5 + .5)) * 2;
		System.out.println(steps);
	}
}