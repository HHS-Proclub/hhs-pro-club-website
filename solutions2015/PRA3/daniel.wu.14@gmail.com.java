import java.util.*;
public class PRA3 {
	public static void main(String[] args){
		int index = 0;
		Scanner io = new Scanner(System.in);
		int numPot = io.nextInt();
		int[] potionList = new int[numPot];
		for(int i = 0; i < numPot; i++){
			potionList[i] = io.nextInt();
		}
		for(int i = 0; i < numPot; i++){
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0; j < i; j++){
				leftSum += potionList[j];
				
			}
			for(int k = numPot-1; k > i; k--){
				rightSum += potionList[k];
			}
			if(leftSum == rightSum && leftSum != 0){ 
				index = i;
				break;
			}
			leftSum = 0;
			rightSum = 0;
		}
		System.out.println(index);
	}
}
