import java.util.Scanner;

public class PRA12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for(int i = 0; i < n; i++){
			String string = s.nextLine();
			String[] arr = new String[string.length()];
			String next;
			String curr;
			int num = string.length();
			
			for(int j = 0; j < string.length(); j++){
				String letter = Character.toString(string.charAt(j));
				arr[j] = letter;
			}
			boolean removed;
			do{
				removed = false;
				for(int k = 0; k < num; k++){
					
					if(k+1 < num && arr[k].equals(arr[k+1])){
						arr[k] = "";
						arr[k+1] = "";
						k+=1;
						removed = true;
					} 
					int count = 0;
					for(int y = 0; y < num; y++){
						if(!arr[y].equals("")){
							arr[count] = arr[y];
							count++;
						} 
					}
					num = count;
				}
			}while(removed);
			
			if(num == 0){
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
			
			
		}
		
	}
	
}
