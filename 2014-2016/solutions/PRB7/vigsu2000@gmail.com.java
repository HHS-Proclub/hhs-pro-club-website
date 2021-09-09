import java.util.Scanner;

public class PRB7 {
	
	public static int numOfClumps(int[] nums) {
	    final int len=nums.length;
	    int  count=0;

	    for(int i=0;i<len;i++)
	    {
	        int j=i+1;
	        if(nums[i]==nums[j])
	        {
	            count++;
	            while((nums[i]==nums[j]))
	            {
	                if(j==len-1)
	                    break;
	                j++;
	            }  
	        } 
	        i=j-1;
	        if(i==len-2)
	            break;
	    }

	    return count;   
	}

	  
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.replaceAll("\\s+","");
		String[] list = str.split(",");

		int[] arr = new int[list.length];
		for(int i = 0; i < list.length; i++) {
			arr[i] = Integer.parseInt(list[i]);
		}
		System.out.println(numOfClumps(arr));
	}
}
