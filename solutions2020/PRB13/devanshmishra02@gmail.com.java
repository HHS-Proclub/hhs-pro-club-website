import java.util.Scanner;
public class PRB13 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int k1 = s.nextInt();
		int k2 = s.nextInt();
		int k3 = s.nextInt();
		int k4 = s.nextInt();
		int total = 0;
		while(k1>0 && k2>0 && k4 >0){
			total+=142;
			k4--;
			k2--;
			k1--;
		}
		while(k1>0 && k2>0){
			total+=12;
			k1--;
			k2--;
			
		}
		System.out.println(total);
	}
}
