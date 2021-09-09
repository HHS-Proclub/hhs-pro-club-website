import java.util.Scanner;
import java.io.*;
public class PRA6 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String n = s.nextLine();
		String[] arr = new String[x];
		String[] findStr = {"pi", "ka", "chu"};
		for(int y = 0; y<x; y++){
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int length = 0;
			String str = s.nextLine();
			str = str.trim();
			length = str.length();
			int space_count = 0;
			for(int i = 0 ; i<3; i++){
				int lastIndex = 0;
				int count = 0;
			
				while(lastIndex != -1){

					lastIndex = str.indexOf(findStr[i],lastIndex);

					if(lastIndex != -1){
						count ++;
						lastIndex += findStr[i].length();
					}
				}
				if(count != 0){
					if(i == 0){
						count1 = 2*count;
					}
					if(i == 1){
						count2 = 2*count;
					} 
					else if (i == 2) {
						count3 = 3*count;
					}
				}
			}
		{
			int lastIndex = 0;
			while(lastIndex != -1){
				lastIndex = str.indexOf(" ", lastIndex);
				if(lastIndex != -1){
					space_count ++;
					lastIndex += 1;
				}
			}
		}
		if(length == 0){
			arr[y] = "NO";
		}
		else if((length - (count1 + count2 + count3 + space_count)) == 0){
			arr[y] = "YES";
			

		} else {
			arr[y] = "NO";

		}
		}
		for(int i = 0; i< arr.length; i++ ){
			System.out.println(arr[i]);
		}
	}
}