import java.util.Arrays;
import java.util.Scanner;
public class PRB16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = Integer.parseInt(scan.nextLine());
		String lineBank[] = new String[testcase];
		
		for(int cycle = 0; cycle < testcase; cycle++){
			String newLine = scan.nextLine();
			lineBank[cycle] = newLine;
		}
		
		for(int cycle2 = 0; cycle2 < testcase; cycle2++ ){
				boolean possible = true;
				String[] parts = lineBank[cycle2].split(" ");
				Arrays.sort(parts);
				for(int detector = 0; detector < (parts.length-1); detector++){
					int part1 = Integer.parseInt(parts[detector]);
					int part2 = Integer.parseInt(parts[detector+1]);
					if(part1 == part2){
						possible = false;
					}
				
				}
				if(possible == false){
					System.out.println("impossible");
				}else{
					System.out.println("possible");
				}
		}
		
		
		// TODO Auto-generated method stub

	}

}
