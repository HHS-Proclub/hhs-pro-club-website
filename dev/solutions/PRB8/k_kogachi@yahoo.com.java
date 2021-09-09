import java.util.Scanner;

public class PRB8 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		String b = in.nextLine();

		StringBuilder a_o = new StringBuilder("");
		StringBuilder b_o = new StringBuilder("");
		
		for(int j = 0; j < b.length(); j++) {
			boolean has = false;
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == b.charAt(j)) {
					has = true;
				}
			}
			if(!has){
				a_o.append(b.charAt(j));
			}
		}
		for(int i = 0; i < a.length(); i++) {
			boolean has = false;
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)) {
					has = true;
				}
			}
			if(!has){
				b_o.append(a.charAt(i));
			}
		}

		if(a_o.toString().equals("")) {
			System.out.println("none");
		} else {
			System.out.println(a_o);
		}
		if(b_o.toString().equals("")) {
			System.out.println("none");
		} else {
			System.out.println(b_o);
		}
	}
	
}
