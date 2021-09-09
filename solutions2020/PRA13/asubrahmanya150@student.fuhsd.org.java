import java.util.Scanner;

public class PRA13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long W = Long.parseLong(in.nextLine());
		long H = Long.parseLong(in.nextLine());
		long M = Long.parseLong(in.nextLine());
		long countW = 0;
		long countH = 0;
		while(countW * countH <= M){
			if((countW+1)*countH <= M){
				countW++;
			}
			if(M>=H*W){
				countH = H;
				countW = W;
				break;
			}
			else{
				if(countW * (countH + 1) <= M){
					countH++;
				}
				else{
					break;
				}
			}
			if(countW * (countH + 1) <= M){
				countH++;
			}
		}
		System.out.println(countW*countH);
	}

}
