import java.util.Scanner;


public class PRB6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[][] result=new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				result[j][size-1-i]=input.nextInt();
			}
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1;j++){
				System.out.print(result[i][j]+" ");
				
			}
			if(size !=1)	
				System.out.print(result[i][size-1]);
			System.out.print("\n");
		}
		
		
	}

}
