import java.util.Scanner;


public class PRA4 {

	public static int addPRE(int num, boolean afterEquals){
		if(!afterEquals)return num;
		return -num;
	
		
	}
	
	public static int multPRE(int num, boolean afterEquals){
		if(afterEquals)return num;
		return -num;
		
	}
	
	
	public static void main(String[] args) {
		System.out.print(" ");
		Scanner input = new Scanner(System.in);
		
		int mult = 0;
		int add = 0;
		
	    String line = input.next();
	    boolean afterEquals = false;
	    
	    for(int i = 0;i<line.length();i++){
	    	
	    	if(line.charAt(i) == '='){
	    		afterEquals = true;
	    		continue;
	    	}
	    	
	    	int temp = -1; //CHECK
	    	int fac = 1;
	    	if(line.charAt(i)=='+' || (line.charAt(i)=='-' &&(fac=-1)==-1))
	    		temp = fac*Integer.parseInt(line.charAt(i+1)+""); 
	    	else if(line.charAt(i+1)=='+' || (line.charAt(i+1)=='-' &&(fac=-1)==-1))
	    		temp = fac*Integer.parseInt(line.charAt(i)+"");
	    	if(temp != -1){
	    		add +=addPRE(temp,afterEquals);
	    		i+=1;  //-1
	    	}else{ // this is a multiply statement ...ADD MORE IFSTATEMENTS IF THEY TEST i*4 and 4*i, cause now you can only handle the 2nd one
	    		temp = Integer.parseInt(line.charAt(i)+"");
	    		mult += multPRE(temp,afterEquals);
	    		i+=2;  //-1
	    	}
	    	//System.out.println(temp);
	    	
	    }
		
	    System.out.println(add/mult);
		

	}

}
