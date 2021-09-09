import java.util.*;

public class PRA7 {
	public static void main(String[]Args){
		Scanner inputReader = new Scanner(System.in);
		int n = inputReader.nextInt();

		String[] firstArray = new String[10000];
		String a = "";
		int z = 0;
		
		//Writes all fractions
		for(int denom = 1; denom <= n; denom++){
			for(int num = 0; num <= n; num++){
				if((double)num / denom <= 1){
					a = simplify(num, denom);
					firstArray[z] = a;
					z++;
				}	
			}
		}
		
		//Replaces duplicates with nulls
		for(int s = 0; s < firstArray.length - 1; s++){
			for(int m = s + 1; m < firstArray.length - 1; m++){
				if(firstArray[s] != null && firstArray[s].equals(firstArray[m])){
					firstArray[m] = null; 
				}
			} 
		}

		
		//Removes nulls and creates final array
		ArrayList<String> noNull = new ArrayList<String>();
		for(int r = 0; r <= firstArray.length - 1; r++){
			if(firstArray[r] != null){
				noNull.add(firstArray[r]);
			}
		}
		String[] array = new String[noNull.size() + 1];
		
		
		
		//Populates final array 
		// ISSUE!! String containing 4/5 is not being populated
		for(int r = 0; r < array.length - 1; r++){
			array[r] = noNull.get(r);
		}
		
		//Sorts array values
		BubbleSort(array);
		array[array.length -2] = (n-1) + "/" + n;
		array[array.length -2] = "1/1";
		printArray(array);
		
	}
	public static void BubbleSort(String[]array){
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     String temp;   //holding variable

	     while (flag){
	            flag= false; 
	            for(j = 0; j < array.length - 2; j++){
	            	
	            	 int firstNumer = Integer.parseInt(array[j].substring(0, array[j].indexOf("/")));
			    	 int firstDenom = Integer.parseInt(array[j].substring(array[j].indexOf("/") + 1));
			    	  
			    	 int secondNumer = Integer.parseInt(array[j+1].substring(0, array[j+1].indexOf("/")));
			    	 int secondDenom = Integer.parseInt(array[j+1].substring(array[j+1].indexOf("/") + 1));
			    	 
	                 if ((double)firstNumer/firstDenom > (double)secondNumer/secondDenom){ 
	                	   
	                           temp = array[ j ];               
	                           array[j] = array[j+1];
	                           array[j+1] = temp;
	                          flag = true; 
	                  } 
	            } 
	      } 
	} 
	public static String simplify(int a, int b){
		long gcd = gcd(a, b);
		return (a / gcd) + "/" + (b / gcd);

	}
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	public static void printArray(ArrayList<String> array){
		for(int i = 0; i < array.size() -1; i++){
			System.out.println(array.get(i));
		}
	}
	public static void printArray(String[] array){
		for(int i = 0; i < array.length -1; i++){
			System.out.println(array[i]);
		}
	}
}
