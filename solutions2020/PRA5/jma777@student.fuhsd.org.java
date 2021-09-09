import java.util.Arrays;
import java.util.Scanner;

public class PRA5 {
	private static final char[] vowel = {'a','e','i','o','u'};
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);  
		   //System.out.println("Enter x, denoting the # of the test cases");  
		   int x= Integer.parseInt(sc.nextLine()); 
		   String[] answers = new String[x];
		   String temp;
		   for(int i = 0; i<x; i++)
		   {
			   temp = sc.nextLine();
			   answers[i]= divide(temp);
		   }
		   sc.close();
		   for(String s:answers)
		   {
			  System.out.println(s);
		   }
	}

	private static String divide(String temp) {
		StringBuffer answer = new StringBuffer(temp.substring(0));
		// TODO Auto-generated method stub
		boolean[] temp1 = new boolean[temp.length()];
		for(int i = 0; i < temp.length() ; i++){
			for(char c: vowel){
				if(c==temp.charAt(i)){
					temp1[i]=true;
				}
			}
		}
		//1System.out.println(Arrays.toString(temp1));
		int temp2 = 0;

		for(int i = 0; i < temp1.length; i++){
			
			if(i-1>-1 && i+1<temp1.length && !temp1[i-1] && !temp1[i] && !temp1[i+1] && !(temp.charAt(i)==temp.charAt(i+1)&&temp.charAt(i)==temp.charAt(i-1))){
				//insert space after
				//System.out.println("ok");
				answer.insert(i+1+temp2, " ");
				temp2++;
				i++;
			}
		
		}
		return answer.toString();
	}
}
