import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String[] num = new String[cases];	
		for(int h = 0; h < cases; h++) {
			num[h] = sc.next();
		}
		for(int a = 0; a < cases; a++) {
			int[] mod = new int[num[a].length()];
			boolean fail = false;
			long sum = 0;
			long delete = 0;
			int index = 0;
			for(int i = 0; i < num[a].length(); i++){
				mod[i] = Character.getNumericValue(num[a].charAt(i)) % 3;
				//System.out.println(num[a].charAt(i)+" "+mod[i]);
			}
			sum = 0;
			for(int y = 0; y < num[a].length(); y++) {
				sum += Character.getNumericValue(num[a].charAt(y));
			}
			//System.out.println(x+" "+sum);
			long delNum = sum % 3;
			if(sum == 0) {
				fail = true;
			}
			if(sum % 3 != 0) {
				int counter = 0;
				for(int x = 1; x <= num[a].length(); x++) {
					if(mod[mod.length-x] == delNum) {
						delete++;
						counter++;
						index = mod.length-x;
						num[a] = num[a].substring(0, index)+num[a].substring(index+1);
						break;
					}
				}
				delNum = 3-delNum;
				//System.out.println(num[a].length());
				if(counter != 1) {
					for(int y = 1; y <= num[a].length()+delete; y++) {
						if(mod[mod.length-y] == delNum) {
							delete++;
							counter++;
							index = mod.length-y;
							num[a] = num[a].substring(0, index)+num[a].substring(index+1);
							//System.out.println(num[a]);
						}
						if(counter == 2) {
							break;
						}
					}
					if(counter != 2) {
						fail = true;
					}
				}
			}
			
			//System.out.println(num[a]);
			for(int i = 0; i < num[a].length(); i++) {
				//System.out.println(splitNum[a].charAt(0));
				if(num[a].charAt(i) == '0') {	
					delete += 1;
				}else {
					break;
				}
			}
			//System.out.println(num[a]);
			if(num[a].length() == 0 || fail) {
				System.out.println(-1);
			}else {
				System.out.println(delete);
			}
		}
	}
}
