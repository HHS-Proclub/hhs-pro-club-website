import java.util.Scanner;
public class PRB10 {
public static void main(String[] args){
	Scanner k = new Scanner(System.in);
	System.out.println();
	int x = k.nextInt();
	boolean p1 =false;
	boolean p2 = false;
	String f;
	if(x % 3 == 0){
		if(x % 5 == 0){
			p1 = true;
			p2 = true;
		}
		else{
			p1 = true;
		}
	}
	if(x % 5 == 0){
		p2 = true;
	}
	if(p1 == true && p2 == true){
		System.out.println("fizzbuzz");
	}
	else if(p1 = true && p2 == false){
		System.out.println("fizz");
	}
	else if(p1 == false && p2 == true){
		System.out.println("buzz");
	}
	else{
		System.out.println(x);
	}
}
}
