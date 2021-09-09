import java.util.*;

public class PRB4{
	public static void main(String[]args){
		String vowels = "aeiou";
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int x=0;x<n;x++){
			String s = sc.nextLine();
			if(vowels.contains(s.substring(0,1))){
				System.out.println(s + "way");
			}
			else{
				System.out.println(s.substring(1) + s.charAt(0) + "ay");
			}
		} 
	}

}