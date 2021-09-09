import java.util.*;
public class PRA4 {

	public static void main(String[] args){
		Scanner im = new Scanner(System.in);
		int going = im.nextInt();
		int all = im.nextInt();
		int up = im.nextInt();
		int on = 0,the = 0,rooftops = 0; 
		//GROMMET THIS. GROMMET THAT. THE FUCK DOES GROMMET MEAN
		if(going >= all && going >= up){
			rooftops = going;
			if(all > up){
				the = all;
				on = up;
			}else{
				on = all;
				the = up;
			}
		}
		if(all >= going && all >= up){
			rooftops = all;
			if(going > up){
				the = going;
				on = up;
			}else{
				on = going;
				the = up;
			}
		}
		if(up >= all && up >= going){
			rooftops = up;
			if(all > going){
				the = all;
				on = going;
			}else{
				on = all;
				the = going;
			}
		}
		if(rooftops >= the+on){
			rooftops -= (rooftops-(the+on) + 1);
		}
		System.out.println(on + the + rooftops);
	}
}
