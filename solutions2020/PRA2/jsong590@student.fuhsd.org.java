import java.util.Scanner;
public class PRA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int step1; 
double step2;
double distance;
step1 = scanner.nextInt();
step2 = step1/2;
distance = scanner.nextInt();
int steps = 0;
while (distance>step1+step2){
	distance = distance - step1 - step2;
	steps = steps+2;
}
if (distance > step1)
	steps = steps+2;
else
	steps++;

System.out.println(steps);
	}

}






