import java.util.Scanner;

public class HPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		int m=Integer.parseInt(s.nextLine());
		int change=Integer.parseInt(s.nextLine());
		for(int i=0;i<m;i++){
			String next=s.nextLine();
			char c=next.charAt(0);
			int num=Integer.parseInt(next.substring(4));
			if(c=='A'){
				change+=num;
			}else if(c=='S'){
				change-=num;
			}else if(c=='M'){
				change*=num;
			}else if(c=='D'){
				change/=num;
			}else{
				String curr=change+"";
				change=0;
				for(int j=0;j<curr.length();j++){
					change+=Character.getNumericValue(curr.charAt(j))*Math.pow(4, curr.length()-1-j);
				}
			}
		}
		System.out.println(change);
	}

}
