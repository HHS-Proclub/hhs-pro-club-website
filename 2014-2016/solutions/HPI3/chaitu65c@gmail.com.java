import java.util.Scanner;

public class HPI3 {
	public static void main(String[] args){
		Scanner t = new Scanner(System.in);
		String line = t.nextLine();
		int count =0;
		char before = ' ';
		char after = ' ';
		for(int i =0; i< line.length();i++){
			if(count <2)
				count =1;
			after = line.charAt(i);
			if(i == 0){
				before = line.charAt(i);
				continue;
			}
			if(before == after){
				count++;
			}
			else{
				System.out.printf(before+""+count);
				count = 0;
			}
			before = after;
			if(i == line.length()-1){
				count = 1;
				System.out.printf(""+ before + count);
			}
		}
	}
}
