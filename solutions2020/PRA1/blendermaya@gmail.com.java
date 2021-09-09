import java.util.Scanner;
public class PRA1 {
	public static void bricker(String rowz){
		String[] parts = rowz.split(" ");
		int[] row1 = new int[3];
		for(int i = 0; i < 3; i = i+1){
			row1[i] = Integer.parseInt(parts[i]);
		}
		int temp5 = 0;
		int temp = 0;
		//repeat for other rows - make row2, row3, etc
		for(int i = 0; i < row1[1] + 1; i = i+1){
			if(5*i<row1[2]){
				temp5 = 5*i;
			}
		}
		for(int i = 0; i < row1[0] + 1; i = i + 1){
			if(i+temp5<row1[2]+1){
				temp = i + temp5;
			}
		}
		if(temp == row1[2]){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	}
	public static void main(String[] args){
		Scanner inputz = new Scanner(System.in);
		String row;
		for(int q = 0; q < 5; q = q + 1){
			row = inputz.nextLine();
			PRA1.bricker(row);	
		}
	}
}
