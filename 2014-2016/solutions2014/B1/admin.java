import java.util.Scanner;


public class B1 {
	public static void main(String[] Args){
//		Scanner x = new Scanner(System.in);
//		int p = x.nextInt(); x.nextLine();
//		int[] arr = new int[p];
//		for(int i = 0; i < p; i++)
//			arr[i] = x.nextInt();

		int[] arr = {15, 20};
		//int 10
		boolean bool = true;
		for(int j = 0; j < arr.length; j++){
			double dec = 0;
			int quad = 1;
			inner: for(int i = 0; i < arr[j]; i++){
				if(arr[j] == 1){
					bool = false;
					System.out.println(1);
					break inner;
				}
				if(i % 2 == 0)
					dec += 1. / quad;
				else
					dec -= 1. / quad;
				quad += 2;
			}
			if(!bool){ bool = true; continue;}
			char[] str = (dec + "").toCharArray();
			
			if(str.length <= 17)
				System.out.println(dec);
			else{
				if(str[17] > '4');
					str[16]++;
				for(int a = 0; a < 17; a++)
					System.out.print(str[a]);
			}
		}
		

	}
}
