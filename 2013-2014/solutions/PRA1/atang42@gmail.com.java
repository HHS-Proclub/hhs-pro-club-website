import java.util.Scanner;


public class PRA1 {

	public static int key;
	public static Scanner s;
	
	public static void main(String[] args) {
		
		/*
		 * Incredibly messy one line solution.
		 * Do not program like this for class!
		 */
		System.out.println( ((key = (s = new Scanner(System.in)).nextInt()) + s.nextLine() + (s.nextLine())).replaceFirst("[0-9]*", "").replace('a', (char) (('a' + key - 'a')%26+'A')).replace('b', (char) (('b' + key - 'a')%26+'A')).replace('c', (char) (('c' + key - 'a')%26+'A')).replace('d', (char) (('d' + key - 'a')%26+'A')).replace('e', (char) (('e' + key - 'a')%26+'A')).replace('f', (char) (('f' + key - 'a')%26+'A')).replace('g', (char) (('g' + key - 'a')%26+'A')).replace('h', (char) (('h' + key - 'a')%26+'A')).replace('j', (char) (('j' + key - 'a')%26+'A')).replace('k', (char) (('k' + key - 'a')%26+'A')).replace('l', (char) (('l' + key - 'a')%26+'A')).replace('m', (char) (('m' + key - 'a')%26+'A')).replace('n', (char) (('n' + key - 'a')%26+'A')).replace('o', (char) (('o' + key - 'a')%26+'A')).replace('p', (char) (('p' + key - 'a')%26+'A')).replace('q', (char) (('q' + key - 'a')%26+'A')).replace('r', (char) (('r' + key - 'a')%26+'A')).replace('s', (char) (('s' + key - 'a')%26+'A')).replace('t', (char) (('t' + key - 'a')%26+'A')).replace('u', (char) (('u' + key - 'a')%26+'A')).replace('v', (char) (('v' + key - 'a')%26+'A')).replace('w', (char) (('w' + key - 'a')%26+'A')).replace('x', (char) (('x' + key - 'a')%26+'A')).replace('y', (char) (('y' + key - 'a')%26+'A')).replace('z', (char) (('z' + key - 'a')%26+'A')).replace('i', (char) (('i' + key - 'a')%26+'A')).toLowerCase() );
	}

}
