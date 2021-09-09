import java.util.Scanner;
public class PRB7 {

	public static void main(String[] args) {
		Scanner Ascan = new Scanner(System.in);
		int counter = 0;
		int a = Integer.parseInt(Ascan.nextLine());
		int pool[] = new int[a];
		
		
		String b = Ascan.nextLine();
		String[] parts = b.split(" ");
		
		for(int x = 0; x < a; x++){
			pool[x] = Integer.parseInt(parts[x]);
		}
		int keynumber = Integer.parseInt(Ascan.nextLine());
		
		for(int y = 0; y < a; y++){
			if(pool[y] == keynumber){
				counter++;
			}
		}
		int answer = (counter*100)/a;
		System.out.println(answer);
	}

}
