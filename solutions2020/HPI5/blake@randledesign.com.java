import java.util.Scanner;
public class HPI5 {

	public static void main(String[] args) {
		int arrayLength;
		Scanner input = new Scanner(System.in);
		arrayLength = input.nextInt();
		String[] names = new String[arrayLength];
		int[] munnies = new int[arrayLength];
		input.nextLine();
		for(int i = 0; i < arrayLength; i++){
			names[i] = input.nextLine();
			munnies[i] = 0;
		}
		for(int i = 0; i < arrayLength; i++){
			String in = input.nextLine();
			int peepsNum = 0;
			String[] a = in.split(" ");
			String thisName = a[0];
			for(int j = 0; j < arrayLength; j++){
				if(names[j].equalsIgnoreCase(thisName)){
					peepsNum = j;
					break;
				}
			}
			int giveMoney = Integer.parseInt(a[1]);
			int numOfPeeps = Integer.parseInt(a[2]);
			if(numOfPeeps != 0)
				giveMoney -= (giveMoney % numOfPeeps);
			munnies[peepsNum] -= giveMoney;
			for(int j = 0; j < numOfPeeps; j++){
				String tempName = input.nextLine();
				int tempI = 0;
				for(int k = 0; k < arrayLength; k++){
					if(names[k].equalsIgnoreCase(tempName)){
						tempI = k;
						break;
					}
				}
				if(numOfPeeps != 0)
					munnies[tempI] += giveMoney/numOfPeeps;
			}
		}
		for(int i = 0; i < arrayLength; i++){
			System.out.println(names[i] + " " + munnies[i]);
		}
		
		input.close();
	}

}
