import java.util.*;


public class PRB25 {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if(a == 0 && b == 0 && c == 0&& d==0){
            System.out.println(4);
        }
        else if(a == b && b == c && c == d){
            System.out.println(0);
        }
        else{
            int[] nums = {a,b,c,d};
            Arrays.sort(nums);

            int result = nums[3];
            for(int i = nums.length-2; i >= 0; i--){
                result -= nums[i];
            }
            System.out.println(Math.abs(result));
        }

    }
}
