import java.util.*;
public class PRB6 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String search = in.nextLine();
		String searched = in.nextLine();
		int count=0;
		for(int i = 0; i<searched.length(); i++){
			if(search.charAt(0) == searched.charAt(i)) count ++;
		}
		System.out.println(count);
	}

}
