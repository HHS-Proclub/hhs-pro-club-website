import java.util.*;
public class PRB1 {
	public static void main(String[] args) {
		boolean alwaysTrue = true;
		while(alwaysTrue == true) //keeps running "forever"
		{
			Scanner scanner = new Scanner(System.in); 
			String line = scanner.nextLine(); 
			
			//.split() splits the integers into the array
			//.trim() removes white space
			String[] strings = line.trim().split("\\s+");
			int numberOfInts = strings.length; //numbers of integers in line
		
			int intArr[] = new int[numberOfInts]; //initializes the number array and values in it
			int a = 0; //first number
			int b = 0; //second number
			Boolean d = false;
			for(int i = 0; i < numberOfInts; i++)
			{
				intArr[i] = Integer.parseInt(strings[i]); //.parseInt() converts string to integer
				if(i == 0)
				{
					a = intArr[i]; 
				}
				else
				{
					b = intArr[i];
					d = true; //makes sure their are two values
				}
			}
			int c = a + b;
			if(d == true)
			{
				System.out.println(c);
			}
			
		}
	}
}
