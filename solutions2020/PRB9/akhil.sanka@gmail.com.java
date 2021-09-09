import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0; i<num; i++){
			String strings = in.nextLine();
			boolean atrue = false;
			boolean btrue = false;
			if(strings.charAt(0) == 'a'){
				atrue = true;
			}
			if(strings.charAt(1) == 'b'){
				btrue = true;
			}
			
			if(atrue == false){
				strings = strings.substring(1);
			}
			if(btrue == false){
				if(atrue){
					strings = strings.substring(0,1) + strings.substring(2) ;
				}
				else{
					strings = strings.substring(1);
				}
				
			}
			System.out.println(strings);
		}
		
		
		
		
		
	}

	
}
