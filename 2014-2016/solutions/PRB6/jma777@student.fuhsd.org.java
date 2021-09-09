import java.util.Scanner;



public class MirrorImage {
	@SuppressWarnings("null")
	public static void main(String[] args) {
	int yes = 0;	
		
		Scanner Pokemanz = new Scanner(System.in);
		int[] Mirror;
		Mirror = new int[10];
		Mirror[0] = Pokemanz.nextInt();	
		Mirror[1] = Pokemanz.nextInt();
		Mirror[2] = Pokemanz.nextInt();	
		Mirror[3] = Pokemanz.nextInt();
		Mirror[4] = Pokemanz.nextInt();	
		Mirror[5] = Pokemanz.nextInt();
		Mirror[6] = Pokemanz.nextInt();	
		Mirror[7] = Pokemanz.nextInt();
		Mirror[8] = Pokemanz.nextInt();	
		for (int count = 0; count <= 8; count++)
		{
			if (Mirror[count + 1] == 1 + Mirror[count]){
				yes++;
				
			}
			
		}
		//System.out.println(Mirror[0] +Mirror[1] +Mirror[2] + Mirror[3] + Mirror[4]  + Mirror[5]  + Mirror[6]  + Mirror[7] + Mirror[8]  + Mirror[9]);
		System.out.println(yes);
		
		
		
		
		
	}
}
