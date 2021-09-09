import java.util.Scanner;
import java.util.ArrayList;
public class PRB3 {
	public static ArrayList<Integer> sortList(ArrayList<Integer> a){
		int temp;
		for(int i = 0; i < a.size()-1 ; i++) {
			for(int j = i+1; j < a.size(); j++) {
				if(a.get(j) >= a.get(i)) {
					temp = a.get(j);
					a.set(j, a.get(i));
					a.set(i,temp);
				}
			}
		}
		/*
		for(int d = 0; d < a.size(); d++) {
			System.out.print(a.get(d) + " ");
		}
		*/
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int wood = sc.nextInt();
		String str = "";
		int sum = 0;
		ArrayList<Integer> plengths = new ArrayList<Integer>();
		for(int i = 0; i < wood; i++) {
			int length = sc.nextInt();
			int pieces = sc.nextInt();
			for(int j = 0; j < pieces; j++) {
				plengths.add(sc.nextInt());
			}
			plengths = sortList(plengths);
			for(int j = 0; j < pieces-1; j++) {
				sum += length;
				length -= plengths.get(j);
			}
			str += sum + "\n";
			sum = 0;
			plengths.clear();
		}
		System.out.print(str);
		sc.close();
	}

	
}
