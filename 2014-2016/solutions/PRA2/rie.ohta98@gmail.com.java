import java.util.Scanner;


public class PRA2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in = s.next();
		String out = s.next();
		int num = 0;
		int prevIndex = 0;
		
		for (int i = 0; i < out.length(); i++) {
			char c = out.charAt(i);
			int index = in.indexOf(c, prevIndex+1);
//			System.out.println(index);
			if (index != -1) {
				if (prevIndex == 0)
					num += index;
				else if (prevIndex != index-1)
					num += index-prevIndex-1;
				prevIndex = index;
			}
		}
		if (in.length() > out.length()) {
			if (prevIndex < in.length()-1)
				num += in.length()-1-prevIndex;
		} else {
			if (prevIndex < out.length()-1)
				num += out.length()-1-prevIndex;
		}
		
		System.out.println(num);
	}

}
