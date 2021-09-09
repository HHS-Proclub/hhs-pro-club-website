import java.io.*;
import java.util.*;

public class HPI3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		StringBuffer bs = new StringBuffer();
		int count = 1;
		for(int i = 1; i < sb.length(); i++){
			if(sb.charAt(i) == sb.charAt( i -1)){
				count++;
			}else{
				bs.append(sb.charAt(i-count));
				bs.append(count);
				count = 1;
			}
		}
		bs.append(sb.charAt(sb.length()-count));
		bs.append(count);
		count = 1;
		System.out.print(bs.toString());
	}

}