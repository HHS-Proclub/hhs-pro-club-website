import java.util.ArrayList;
import java.util.Scanner;

public class PRB9 {

	public static boolean act(int start, ArrayList<Integer> arr, int target) {
		if(arr.contains(6) && arr.indexOf(6) >= start) {
			boolean result = false;
			int i = arr.indexOf(6);
			int num = arr.get(i);
			for(int j = start; j < arr.size(); j++) {
				if(num == target) {
					return true;
				}
				if(j == i && j < arr.size()-1) {
					j++;
				}
				else if(j == i && j >= arr.size()-1) {
					result = false;
				}
				num += arr.get(j);
			}
			if(!result) {
				int b = arr.indexOf(6);
				for(int j = start; j < arr.size(); j++) {
					int number = arr.get(i);
					if(number == target) {
						return true;
					}
					if(j == b && j < arr.size()-1) {
						j++;
					}
					else if(j == b && j >= arr.size()-1) {
						return result;
					}
					number += arr.get(j);
					if(number == target) {
						return true;
					}
				}
			}
		}


		boolean result = false;
		for(int i = start; i < arr.size(); i++) {
			int num = arr.get(i);
			for(int j = start; j < arr.size(); j++) {
				if(num == target) {
					return true;
				}
				if(j == i && j < arr.size()-1) {
					j++;
				}
				else if(j == i && j >= arr.size()-1) {
					result = false;
				}
				num += arr.get(j);
			}
		}
		if(!result) {
			for(int i = start; i < arr.size(); i++) {
				for(int j = start; j < arr.size(); j++) {
					int num = arr.get(i);
					if(num == target) {
						return true;
					}
					if(j == i && j < arr.size()-1) {
						j++;
					}
					else if(j == i && j >= arr.size()-1) {
						return result;
					}
					num += arr.get(j);
					if(num == target) {
						return true;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = Integer.parseInt(s.nextLine());
		String str = s.nextLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				arr.add(Integer.parseInt(str.charAt(i)+""));
			}
		}
		int target = Integer.parseInt(s.nextLine());
		System.out.println(act(start, arr, target));
	}

}
