import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class B4 {

	static String [] key;
	static String [] val;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String toReplace = input.nextLine();
		
		
		int numEle = input.nextInt();
		input.nextLine();
		key = new String[numEle];
		val = new String[numEle];
		
		
		for(int i = 0;i<numEle;i++){
			String line = input.nextLine();
			int ind = line.indexOf("|");
			key[i] = line.substring(0,ind);
			val[i] = line.substring(ind+1);
		}
	
		for(int i = 0;i<key.length;i++){
			for(int j = i;j<key.length;j++){
				if(key[j].length()>key[i].length()){
					String t = key[i]; String h = val[i];
					key[i] = key[j];   val[i] = val[j];
					key[j] = t;        val[j] = h;
				}
				
			}
		}
		
		for(int i = 0;i<val.length;i++){
			toReplace = toReplace.replace(key[i], val[i]);
		}
		
		System.out.println(toReplace);
		
		
		
		
		// 2 4 9 2 9 5 2
		

	}
/*
 * 
 * 
Amit
hello
dsf
qwww
 */
	

}
