import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int scoreone=sc.nextInt();
		int scoretwo=sc.nextInt();
		int scorethree=sc.nextInt();
		int scorefour=sc.nextInt();
		int scorefive=sc.nextInt();
		sc.close();
		int finalscore=scoreone+scoretwo+scorethree+scorefour+scorefive;
		System.out.println(finalscore);
	}
}
