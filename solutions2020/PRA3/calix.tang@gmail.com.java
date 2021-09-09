import java.util.Scanner;
public class PRA3 {
	private static boolean isGood(int i,int j) {
		int k = i + j;
		while(k >= 2) {
			if(k%2!=0)
				return false;
			if(k==1)
				return true;
			k/=2;
		}
		return true;
	}
	
	public static int badsInSeq(int[] arr) {
		if(arr.length == 1) {
			return 1;
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr.length; j++) {
				if(i==j) {
					if(i == arr.length-1 && !isGood(arr[i],arr[j-1])) {
						sum+=1;
						break;
					}
					continue;
				}else if(isGood(arr[i],arr[j])) {
					break;
				}else if(j == arr.length-1 && !isGood(arr[i],arr[j])) {
					//System.out.println(arr[i]);
					sum+=1;
					break;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sequences = sc.nextInt();
		String str = "";
		for(int i = 0; i < sequences; i++) {
			int elements = sc.nextInt();
			int[] ints = new int[elements];
			for(int j = 0; j < elements; j++) {
				ints[j] = sc.nextInt();
			}
			str += badsInSeq(ints) + "\n";
		}
		System.out.print(str);
		sc.close();
	}

}
