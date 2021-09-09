import java.io.*;
import java.util.*;

public class PRA1 {
	public static void main(String args[]){
		Integer[][] arr = new Integer[5][3], cnt = new Integer[][]{{0}};
		new BufferedReader(new InputStreamReader(System.in)).lines().limit(5).forEachOrdered(i -> arr[cnt[0][0]++] = Arrays.stream(i.split(" ")).map(Integer::parseInt).toArray(Integer[]::new));
		Arrays.stream(arr).sequential().map(i -> { while(i[2] > 5 && i[1] > 0){ i[2] -= 5; i[1]--; }	return i[2] <= i[0]; }).forEach(System.out::println);
	}
}