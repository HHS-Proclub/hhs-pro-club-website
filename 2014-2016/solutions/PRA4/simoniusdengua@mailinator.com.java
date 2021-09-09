import static java.util.Collections.*;
import static java.lang.String.*;
import java.util.Scanner;
import java.util.Stack;

public class PRA4 {
	
	//I see you peeking :P
	
	private static Stack<String> __ = new Stack<String>();
	private static void __(char[] ______, byte ___, byte ____, byte _______ ) {
		if (___ == ____) 	__.add(valueOf(______));
		else for (int __ = ___; __ <= ____; ++__) {
				if (______[__] != ______[___])
					______[__] = (char) (______[__] ^ ______[___] ^ (______[___] = ______[__]));
				__(______, (byte) (___ + (____ / ____)), ____, (byte)(_______ | (___ << ____)));
				if (______[__] != ______[___])
					______[__] = (char) (______[__] ^ ______[___] ^ (______[___] = ______[__]));
			}
	}
	public static void main(String[] ____________){
		int _______ =  new Scanner(System.in).nextInt();
		__("abcdefghijklmnopqrstuvyxyz".substring(_______ - _______, _______).toCharArray(), (byte) (_______ - _______), (byte)(_______ - (_______ / _______)), (byte) (_______ - _______));
		sort(__);
		for(String _ : __)	System.out.println(_);
	}
}
