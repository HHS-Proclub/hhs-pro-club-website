import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PRB4 {
	public static int addUp(ArrayList<Integer> arr) {
		int sum = 0;
		int largest = 0;
		//subsize iterator
		for(int i = 1; i <= arr.size(); i++) {
			//start index iterator
			for (int j = arr.size()-1; j >=0; j--) {
				for(int k = 0; k < i; k++) {
					if(arr.get(j+k) > largest) {
						largest = arr.get(j+k);
					}
				}
				sum+=largest;
				largest=0;
			}
		}
		
		
		return sum;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String out = "";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int arrs = Integer.parseInt(b.readLine());
		for(int i = 0; i <arrs; i++) {
			int arrSize = Integer.parseInt(b.readLine());
			for(int j = 0; j<arrSize; j++) {
				arr.add(Integer.parseInt(b.readLine()));
				out += addUp(arr) + "\n";
				arr.clear();
			}
		}
		System.out.print(out);
		b.close();
	}

}
