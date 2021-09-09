import java.util.ArrayList;
import java.util.Scanner;

public class PRB8 {
	
	static ArrayList<String> strings;

	public static void main(String[] args) {
		strings = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		int repeats = input.nextInt();
		for(int x = 0; x < repeats; x++) {
			int numCubes = input.nextInt();
			int[][] cubes = new int[numCubes][6];
			for(int i = 0; i < numCubes; i++) {
				for(int j = 0; j < 6; j++) {
					cubes[i][j] = input.nextInt();
				}
			}
			int count = 0;
			boolean shouldContinue = true;
			while(shouldContinue) {
				count++;
				String stringyStuff = count+"";
				while(stringyStuff.length() < cubes.length) {
					stringyStuff += "?";
				}
				printPermutations(stringyStuff);
				boolean contains = false;
				for(String s : strings) {
					if((count + "").length() > cubes.length) {
						shouldContinue = false;
						break;
					}
					boolean b = true; 
					for(int i = 0; i < s.length(); i++) {
						if(contains(cubes[i],s.charAt(i)-'0') || s.charAt(i) == '?'){
							
						} else {
							b = false;
						}
					}
					if(b)
						contains = true;
					
				}
				shouldContinue = contains;
				
			}
			System.out.println(count-1);
		}
		input.close();
		
	}
	
	public static boolean contains(int[] cube, int num) {
		for(int i = 0; i < cube.length; i++) {
			if(cube[i] == num)
				return true;
		}
		return false;
	}
	
	public static void printPermutations(String in) {
		strings = new ArrayList<String>();
		printPermutations(in,0);
	}
	
	private static void printPermutations(String in, int locked) {
		if(locked > in.length()-1) {
			
			strings.add(in);
		} else {
			
			recursiveForLoop(locked,in.length(),in,locked);
		}
	}
	
	private static void recursiveForLoop(int i, int n, String in, int locked) {
		if(i < n) {
			printPermutations(swap(in,locked,i),locked+1);
			recursiveForLoop(i + 1, n, in, locked);
		}
	}
	
	private static String swap(String s, int c1, int c2) {
		char[] chars = s.toCharArray();
		char temp = chars[c1];
		chars[c1] = chars[c2];
		chars[c2] = temp;
		return new String(chars);
	}
}
