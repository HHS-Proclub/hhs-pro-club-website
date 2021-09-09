import java.util.Scanner;


public class HPIB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numStrs = Integer.parseInt(in.nextLine());
		String strs[] = new String[numStrs];
		boolean result=true;
		for(int i=0; i<numStrs; i++){
			strs[i]=in.nextLine();
		}				
		for(int i=1; i<numStrs; i++){
			if(((strs[i-1].charAt(strs[i-1].length()-1))+"").equals((strs[i].charAt(0)+""))){
				result=true;
			}else{
				result=false;
				//System.out.println("NO");break;
			}
		}
		//if(result)
			//System.out.println("YES"); 
		System.out.println("YES");
	}
}
