import java.util.Scanner;
public class PRB9 {

	public static void main(String[] args) {
		Scanner Bscan = new Scanner(System.in);
		
		int cases = Integer.parseInt(Bscan.nextLine());
		String wordBank[] = new String[cases];
		String translated[] = new String[cases];
		
		int xa = 0;
		
		while(xa < (cases)){
			wordBank[xa] = Bscan.nextLine();
			xa++;
		}
	
	for(int cycle = 0; cycle < cases; cycle++){
			///System.out.println(wordBank[cycle].substring(0,  1));
			///System.out.println(wordBank[cycle].substring(1, 2));
			///StringBuilder sb = new StringBuilder(wordBank[cycle]);
			if(wordBank[cycle].substring(0,1).equals("a")||wordBank[cycle].substring(0,1).equals("A")){
				if(wordBank[cycle].substring(1,2).equals("b")||wordBank[cycle].substring(0,1).equals("B")){
					translated[cycle] = wordBank[cycle];
					System.out.println(translated[cycle]);
				}else{
					translated[cycle] = wordBank[cycle].substring(0,1) + wordBank[cycle].substring(2);
					
					System.out.println(translated[cycle]);
					
				}
			}else{
				if(wordBank[cycle].substring(1,2).equals("b")||wordBank[cycle].substring(0,1).equals("B")){
					/// ?B?? = B??
					translated[cycle] = wordBank[cycle].substring(1);
					System.out.println(translated[cycle]);
					
				}else{
					translated[cycle] = wordBank[cycle].substring(2);
					
					System.out.println(translated[cycle]);
				}
			}
			
			
		} 
	/*for(int printer = 0; printer < cases; printer++){
			System.out.println(translated[printer]);
	}*/
		
		
		// TODO Auto-generated method stub

	}

}
