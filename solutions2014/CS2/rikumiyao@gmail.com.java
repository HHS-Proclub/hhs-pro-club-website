import java.util.*;
public class CS2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]list = new int[n];
		for(int x=0;x<n;x++){
			list[x] = sc.nextInt();
		}
		int first = list[0];
		ArrayList<Integer>before = new ArrayList<Integer>();
		ArrayList<Integer>after = new ArrayList<Integer>();
		int middle = 0;
		for(int x=0;x<n;x++){
			int a = list[x];
			if(a==first){
				middle++;
			}
			else if(a<first){
				before.add(a);
			}
			else{
				after.add(a);
			}
		}
		int[]result = new int[n];
		int index = 0;
		for(int i:before){
			result[index] = i;
			index++;
		}
		for(int x=0;x<middle;x++){
			result[index] = first;
			index++;
		}
		for(int i:after){
			result[index] = i;
			index++;
		}
		for(int x=0;x<n-1;x++){
			System.out.print(result[x]+" ");
		}
		System.out.println(result[result.length-1]);
	}
}
