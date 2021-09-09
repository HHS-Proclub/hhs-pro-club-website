import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);  
		 //System.out.println("Enter x, denoting the # of the test cases");  
		 int x= Integer.parseInt(sc.nextLine()); 
		 String[] answers = new String[x];
		 String temp;
		 int a,b,c,m;
		 int[] p;
		 boolean[] comp;
		 for(int i = 0; i<x; i++)
		 {
			 temp = sc.nextLine();
			 a = Integer.parseInt(temp.substring(0,temp.indexOf(' ')));
			 b = Integer.parseInt(temp.substring(temp.indexOf(' ')+1,temp.indexOf(' ',temp.indexOf(' ')+1)));
			 c = Integer.parseInt(temp.substring(temp.indexOf(' ',temp.indexOf(' ')+1)+1));
			 //System.out.println(a + " " + b + " " + c);
			 temp = sc.nextLine();
			 m = Integer.parseInt(temp);
			
			 ArrayList<Integer> q1 = new ArrayList<Integer>();
			 ArrayList<Integer> q2 = new ArrayList<Integer>();
			 
			 for(int y = 0; y < m; y++){
				 temp = sc.nextLine();
				 if(Integer.parseInt(temp.substring(temp.indexOf(' ')+1))==1){
					 q1.add(Integer.parseInt(temp.substring(0,temp.indexOf(' '))));
				 }else{
					 q2.add(Integer.parseInt(temp.substring(0,temp.indexOf(' '))));
				 }
			 }
			 //System.out.println(q1 + "\n" + q2);
			 answers[i]=maxCompAndPrice(a,b,c,m,q1,q2);
		 }
		 sc.close();
		 for(String s:answers)
		 {
			System.out.println(s);
		 }
	}

	private static String maxCompAndPrice(int a, int b, int c, int m, ArrayList<Integer> q1, ArrayList<Integer> q2) {
		int maxNum=0, price=0;
		int[] portAPrice = new int[q2.size()];
		int[] portBPrice = new int[q1.size()];
		for(int i = 0; i<portAPrice.length;i++){
			portAPrice[i]=q2.get(i);
		}
		for(int i = 0; i<portBPrice.length;i++){
			portBPrice[i]=q1.get(i);
		}
		Arrays.sort(portAPrice);
		Arrays.sort(portBPrice);
		//System.out.println(Arrays.toString(portAPrice) + "\n" +Arrays.toString(portBPrice));
		int d=0, e=0;
		if(a<portAPrice.length){
			d=Math.min(portAPrice.length-a,c);
			c-=d;
		}
		if(b<portBPrice.length&&c>0){
			e=Math.min(portBPrice.length-b,c);
			c-=e;
		}
		//System.out.println(c);
		for(int i = 0; i<Math.min(portAPrice.length,a+d);i++){
			price+=portAPrice[i];
			maxNum++;
		}
		for(int i = 0; i<Math.min(portBPrice.length,b+e);i++){
			price+=portBPrice[i];
			maxNum++;
		}
		
		
		
		return maxNum + " " + price;
	}
	
}
