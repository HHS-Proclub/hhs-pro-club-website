import java.util.Scanner;


public class PRA6 {
	public static String num(int l){
		if(l==1)
			return "1";
		String number=num(l-1);
		int dig;
		String result="";
		int temp=0;
		
		for(int index=number.length()-1;index>-1;){
			dig=Integer.parseInt(number.charAt(index)+"");
			while(index>-1&&dig==Integer.parseInt(number.charAt(index)+"")){
				temp++;
				index--;
			}
			result+=temp+""+dig;
			temp=0;
		}
		/*char tC;
		for(int i=0;i<result.length()/2;i++){
			tC=result.charAt(result.length()-1);
			result=tC+result.substring(1,result.length()-1)+result.charAt(0);
		}*/
		
		return result;
	}
	public static String reverse(String s){
		/*char tC;
		for(int i=0;i<result.length()/2;i++){
			tC=result.charAt(result.length()-1);
			result=tC+result.substring(1,result.length()-i-1)+result.charAt(0);
		}
		return result;*/
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			result+=s.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.print(reverse("123"));*/
		Scanner kt=new Scanner(System.in);
		System.out.print(reverse(num(kt.nextInt())));
	}

}
