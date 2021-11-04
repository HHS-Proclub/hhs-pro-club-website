import java.util.*;

public class PRA2 {
	public static void main(String[] args) {
		Scanner kboard=new Scanner(System.in);
		int num;num=kboard.nextInt();
		for(int i=0;i<num;i++) {
			int a,b;a=kboard.nextInt();b=kboard.nextInt();
			int n=binary_search(a,b);
			System.out.println(n);
		}
	}
	public static int binary_search(int a,int b) {
		int res=1000000000;
		int low=0;
		int high=1000000000;
		while(low<=high) {
			int mid=(low+high+1)/2;
			if(check(mid,b)>=a) {
				high=mid-1;
				res=mid;
			}else {
				low=mid+1;
			}
		}
		return res;
	}
	public static int check(int v,int reduct) {
		int count=0;
		while(v>0) {
			count+=v;
			v/=reduct;
		}
		return count;
	}
}
