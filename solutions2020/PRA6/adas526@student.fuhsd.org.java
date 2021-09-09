import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class PRA6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < x; i++) {
            int n = in.nextInt();
            int jump = in.nextInt();
            int[] arr = new int[n-1];
            
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
            }
            output.add(frog(arr, jump));
        }
        for (int o : output) {
            System.out.println(o);
        }
        in.close();
    }
    public static int frog(int[] arr, int j) {
        int count = 0;
        int index = -1;
        int zeroCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        while (true) {
            for (int i = j; i >= 0; i--) {
                if (index+i <= arr.length-1 && index+i >= 0 && arr[index+i] > 0) {
                    arr[index+i]--;
                    index += i;
                    if (arr[index] == 0) {
                    	   zeroCount++;
                    }
                    break;
                } else if (index+i > arr.length-1) {
                    index += i;
                    break;
                }
                if (i == 0) {
                    return count;
                }
            }
            if (index > arr.length-1) {
            		if (zeroCount == arr.length) {
            			count++;
            			return count;
            		} else {
            			count++;
                    index = -1;
            		}
               
                //break;
            }
            
        }
        //return 0;
    }
}
