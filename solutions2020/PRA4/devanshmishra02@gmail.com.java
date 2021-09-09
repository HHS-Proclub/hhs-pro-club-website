import java.util.ArrayList;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i = 0; i < x; i++) {
			String word = scan.next();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			int total = 0;
			for(int j = 0; j < word.length(); j++) {
				int q = Integer.parseInt(word.charAt(j)+"");
				arr.add(q);
				arr2.add(q);
				total += arr.get(j);
			}
			int count = 0;
			int count2 = 0;
			int r = total % 3;

			if (total < 3 ) {
				System.out.println("-1");
			} else if(r == 0) {
				System.out.println(0);
			} else if(r == 1) {
				for(int j = arr.size()-1; j >= 0; j--) {
					if(arr.get(j) == 1 || arr.get(j) == 4 || arr.get(j) == 7) {
						
						arr.remove(j);
						count++;
						break;
					}
				}
				for(int j = 0; j < arr.size(); j++) {
					if(arr.get(j) == 0) {
						arr.remove(j);
						count++;
						j--;
					} else {
						break;
					}
				}
				
				for(int j = arr.size()-1; j >= 0; j--) {
					if(count2 < 2 && arr2.get(j) == 2 || arr2.get(j) == 5 || arr2.get(j) == 8) {
						arr2.remove(j);
						count2++;
					}
				}
				
				for(int j = 0; j < arr2.size(); j++) {
					if(arr2.get(j) == 0) {
						arr2.remove(j);
						count2++;
						j--;
					} else {
						break;
					}
				}
			} else if(r == 2) {
				for(int j = arr.size()-1; j >= 0; j--) {
					if(arr.get(j) == 2 || arr.get(j) == 5 || arr.get(j) == 8) {
						arr.remove(j);
						count++;
						break;
					}
				}
				for(int j = 0; j < arr.size(); j++) {
					if(arr.get(j) == 0) {
						arr.remove(j);
						count++;
						j--;
					} else {
						break;
					}
				}
				
				for(int j = arr.size()-1; j >= 0; j--) {
					if(count2 < 2 && arr2.get(j) == 1 || arr2.get(j) == 4 || arr2.get(j) == 7) {
						arr2.remove(j);
						count2++;
					}
				}
				
				for(int j = 0; j < arr2.size(); j++) {
					if(arr2.get(j) == 0) {
						arr2.remove(j);
						count2++;
						j--;
					} else {
						break;
					}
				}				
				
			}

			if (arr.size() == 0 || arr2.size() == 0) {
				System.out.println("-1");
			} else {
				if (count != 0 && count2 !=0 ) {
					if (count > count2) {
						System.out.println(count2);
					} else {
						System.out.println(count);
					}
				} else if (count != 0) {
					System.out.println(count);
				} else if (count2 != 0) { 
					System.out.println(count2);
				} 
			}
		}
	}
}
