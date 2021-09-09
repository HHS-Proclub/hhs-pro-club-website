import java.util.Scanner;
public class PRB10 {

	public static void main(String[] args) {
		Scanner Ascan = new Scanner(System.in);
		String xy = Ascan.nextLine();
		String[] sides = xy.split("/");
		
		int topside = Integer.parseInt(sides[0]);
		int bottomside = Integer.parseInt(sides[1]);
		int pull1 = topside;
		int pull2 = bottomside;
		
		while(topside != bottomside){
			if(topside > bottomside){
				topside = topside - bottomside;
			}else{
				bottomside = bottomside - topside;
			}
		}
		int pull3 = pull1/topside;
		int pull4 = pull2/bottomside;
		
		
		/*while(topside != 1 | bottomside != 1){
			for(int cycle =1; cycle > topside; cycle++){
				while(topside % cycle == 0 && bottomside % cycle == 0){
					topside = topside/cycle;
					bottomside = bottomside/cycle;
				}
				}
			}*/
		
		System.out.println(pull3+"/"+pull4);
		}
		// TODO Auto-generated method stub

}


