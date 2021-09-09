import java.util.Scanner;

public class PRB3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sequence = sc.nextInt();

		String output = "";
		
		for (int i=0;i<sequence;i++) {
			int num = sc.nextInt();
			int[] seq = new int[num];
			
			for (int j=0;j<num;j++) {
				seq[j] = sc.nextInt();
			}
			
			int maxcount = 0;
			
			for (int j=0;j<allSubsets(seq).length;j++) {
				int[] newset = new int[allSubsets(seq)[j].length];
				
				for (int k=0;k<allSubsets(seq)[j].length;k++) {
					newset[k] = Integer.parseInt(allSubsets(seq)[j][k]);
				}
				
				if (isGood(newset) && maxcount < newset.length) {
					maxcount = newset.length;
				}
			}
			
			output += num-maxcount+"\n";
		}
		
		System.out.println(output);
		sc.close();
	}
	
	static boolean isTwo(int num) {
		if (num > 0 && ((num & (num - 1)) == 0)) {
			return true;
		}
		return false;
	}
	
	static boolean isGood(int[] list) {
		int times = 0;
		
		for (int i=0;i<list.length;i++) {
			for (int j=0;j<list.length;j++) {
				if (isTwo(list[i]+list[j]) && i!=j) {
					times += 1;
					break;
				}
			}
		}
		
		if (times == list.length) {
			return true;
		} else {
			return false;
		}
	}
	
	static String[][] allSubsets(int[] arr) {
	    int size = arr.length;
	    int binaryLimit = (1 << size) - 1;
	    String[][] set = new String[binaryLimit][];
	    
	    for (int i = 1; i <= binaryLimit; i++) {
	        int index = size - 1;
	        int num = i;
	        String sub = "";
	        while (num > 0) {
	            if ((num & 1) == 1) {
	                sub += arr[index]+" ";
	            }
	            index--;
	            num >>= 1;
	        }
	        set[i-1] = sub.split(" ");
	    }
	    
	    return set;
	}
}
