import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB19 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.nextLine());
		String[] str = new String[num];
		for(int i = 0; i < num; i++) {
			str[i] = kb.nextLine();
		}
		
		for(int i = 0; i < num; i++) {
			int[] temp = new int[(str[i].length()-1)/2];
			String[] temp2 = str[i].split("\\s+");
			for(int j = 0; j < temp2.length; j++) {
				temp[j] = Integer.parseInt(temp2[j]);
			}
			
			int total = 0;
			for(int candy = temp.length-2; candy >= 0; candy--){
				if(temp[candy] >= temp[candy + 1]) {
					int diff = temp[candy] - temp[candy + 1] + 1;
					total += diff;
					temp[candy] -= diff;
				}
			}
			
			for(int candy : temp) {
				if(candy <= 0) total = -1;
			}
			System.out.println(total);
		}
	}
	
	public boolean isSquareFree(String str) {
		
		return false;
	}
}
