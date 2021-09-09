import java.util.Scanner;
public class PRA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
String[] numbers = new String[5];
numbers[0] = scanner.nextLine();
numbers[1] = scanner.nextLine();
numbers[2] = scanner.nextLine();
numbers[3] = scanner.nextLine();
numbers[4] = scanner.nextLine();
boolean[] output = new boolean[5];
int x, y, z;
for (int n = 0; n <5; n++)
{
	x = Integer.parseInt(numbers[n].substring(0, numbers[n].indexOf(" ")));
	numbers[n] = numbers[n].substring(numbers[n].indexOf(" ")+1);
	y = Integer.parseInt(numbers[n].substring(0, numbers[n].indexOf(" ")));
	numbers[n] = numbers[n].substring(numbers[n].indexOf(" ")+1);
	if (numbers[n].indexOf(" ") > 0)
		z = Integer.parseInt(numbers[n].substring(0, numbers[n].indexOf(" ")));
	else
		z = Integer.parseInt(numbers[n]);
	
	if (z < 5){
		if (z > x)
			output[n] = false;
		else
			output[n] = true;
	}
	else {
		if (z < x)
			output[n] = true;
		else{
			while (z > 5 && y > 0){
				z = z-5;
				y--;
			}
			if (z <= x || (z == 5 && y > 0))
				output[n] = true;
			else
				output[n] = false;
		}
		
	}
		
	System.out.println(output[n]);
}

	}

}
