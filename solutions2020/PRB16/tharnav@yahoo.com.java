import java.util.HashMap;
import java.util.Scanner;

public class PRB16 {

	public static int getPopularElement(int[] a)
	{
	  int count = 0, tempCount;
	  int popular = a[0];
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = a[i];
	    tempCount = 0;
	    for (int j = i; j < a.length; j++)
	    {
	      if (temp == a[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  return count;
	}
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int tests = kboard.nextInt();
		String[] outputs = new String[tests];
		String barb = kboard.nextLine();
		for(int i = 0; i < tests; i++) {
			String line = kboard.nextLine();
			String[] stuff = line.split(" ");
			int[] nums = new int[stuff.length];
			for(int j = 0; j < stuff.length; j++) {
				nums[j] = Integer.parseInt(stuff[j]);
			}
			if(getPopularElement(nums)<=nums.length-getPopularElement(nums)) {
				outputs[i] = "possible";
			} else {
				outputs[i] = "impossible";
			}
		}
		for(int i = 0; i < tests; i++) {
			System.out.println(outputs[i]);
		}
	}
}
