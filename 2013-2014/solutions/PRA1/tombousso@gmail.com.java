import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class PRA1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int offset = scanner.nextInt();
		scanner.nextLine();
		String input = scanner.nextLine();
		int z = 122;
		int alphabet = 26;
		for(int i=0;i<input.length();i++){
			int keycode = input.charAt(i);
			if(keycode >= z - alphabet && keycode <= z){
				keycode += offset;
				if(keycode > z){
					keycode -= alphabet;
				}
			}
			System.out.print((char)keycode);
		}
	}
}