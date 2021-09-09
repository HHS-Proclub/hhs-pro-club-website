import java.util.Scanner;
public class PRA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tests = Integer.parseInt(in.nextLine());
		for(int i = 0; i < tests; i++){
			String word = in.nextLine();
			String[] split = word.split("(?!^)");
			boolean answer = true;
			for(int k = 0; k < split.length; k++){
				if(split[k].equals("p")){
					k++;
					if(split[k].equals("i")){
					}
					else{
						answer = false;
					}
				}
				else if(split[k].equals("k")){
					k++;
					if(split[k].equals("a")){
						
					}
					else{
						answer = false;
					}
				}
				else if(split[k].equals("c")){
					k++;
					if(split[k].equals("h")){
						k++;
						if(split[k].equals("u")){
							
						}
						else{
							answer = false;
						}
					}
					else{
						answer = false;
					}
					
				}
				else{
					answer = false;
				}
			}
			if(answer == false){
				System.out.println("NO");
				
			}
			else{
				System.out.println("YES");
			}
		}
	}

}
