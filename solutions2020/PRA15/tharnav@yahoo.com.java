import java.util.Scanner;

public class PRA15 {
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int num = kboard.nextInt();
		int[] highest = new int[num];
		String godownaline = kboard.nextLine();
		for(int i = 0; i < num; i++) {
			String word = kboard.nextLine();
			for(int index = 0; index < word.length(); index++) {
				int total = 0;
				int index1 = index;
				int index2 = 1;
				int pointer = index;
				while(index2 != -1) {
				index2 = word.indexOf(word.charAt(index), pointer+1);
				//System.out.println(index2);

				if(index2 != -1) {
					total+=2;
					int index4 = index2;
					for(int j = index1+1; j < index2; j++) {
						int index3 = word.indexOf(word.charAt(j), index4+1);
						if(index3 != -1) {
							total+=2;
							index4 = index3;
							//System.out.println(index2+" "+total+" "+j);
						}
					}
					if(total > highest[i]) highest[i] = total;
					total= 0;
				}
				pointer++;
				}
			}
		}
		for(int i = 0; i < num; i++)
			System.out.println(highest[i]);
	}
}
