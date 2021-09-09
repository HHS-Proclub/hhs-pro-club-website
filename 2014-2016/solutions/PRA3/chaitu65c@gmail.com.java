import java.util.*;
public class PRA3 {
	public static void main(String[] arhs){
		Scanner h = new Scanner(System.in);
		int n = h.nextInt();
		int[] num = new int[n];
		for(int i =0 ;i <n;i++){
			num[i] = h.nextInt();
		}
		System.out.println(Index(num));
		}
	public static int Index(int[] num){
		int index =0;
		int sum1 =0,sum2 = 0;
		for(int i = 1; i < num.length; i++){
			for(int h = 0; h < i; h++){
				sum1 += num[h];
			}
			for(int j = i+1; j<num.length;j++){
				sum2 += num[j];
			}
			if(sum1 == sum2){
				index = i;
				break;
			}
			sum1 =0;
			sum2 = 0;
		}
		return index;
	}
}
