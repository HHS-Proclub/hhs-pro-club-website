import java.util.*;
public class PRA1 {
	public static int HYPETRAINCHOOCHOO(String KOR){
		int ROTATIONS = 0;
		for(int i = 3; i>=0; i--){
			ROTATIONS=(int) (Math.pow(16,i) * (Character.getNumericValue(KOR.charAt(Math.abs(i-3)))) + ROTATIONS);
		}
		return ROTATIONS;
	}
	public static String ROTATINGFROMKORTORELEGATIONS(int RIPS4WORLDSCLG){
		int crs4ththedream = 0;
		int ripthirdplace=0;
		int cloud9 = 0;
		int TEE_ESS_EMM = 0;
		while(RIPS4WORLDSCLG-Math.pow(16,3)>0){
			  RIPS4WORLDSCLG-=(int) Math.pow(16,3);
			  crs4ththedream ++;
		}
		while(RIPS4WORLDSCLG-Math.pow(16,2)>0){
			  RIPS4WORLDSCLG-=(int) Math.pow(16,3);
			  ripthirdplace ++;
		}
		while(RIPS4WORLDSCLG-16>0){
			  RIPS4WORLDSCLG-= 16;
			  cloud9 ++;
		}
		while(RIPS4WORLDSCLG-1>0){
			  RIPS4WORLDSCLG-= 1;
			  TEE_ESS_EMM ++;
		}
		String RIPSKTT1K = (crs4ththedream +""+ripthirdplace+""+cloud9+""+TEE_ESS_EMM);
		return RIPSKTT1K;
	}

	public static int GCD(int a, int b) {
		   if (b==0) return a;
		   return GCD(b,a%b);
		   //Thanks guy on stackoverflow!
	}
	

	public static void main(String args[]){
		Scanner SEE_EL_GEE = new Scanner(System.in);
		String RushHour = SEE_EL_GEE.nextLine();
		String Seraph = SEE_EL_GEE.nextLine();
		int HOTSHOTGG = GCD(HYPETRAINCHOOCHOO(RushHour),HYPETRAINCHOOCHOO(Seraph));
		System.out.println(HOTSHOTGG);
		System.out.println(ROTATINGFROMKORTORELEGATIONS(HOTSHOTGG));
	}
}
// 047B
// 0965