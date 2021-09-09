import java.util.*;

public class PRB6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int[] arr = new int[l];
		for(int i = 0; i < l; i++)
			arr[i] = s.nextInt();
		System.out.println(findMirrorString(arr));
	}

	public static int findMirrorString(int[] arr){
		int m = arr.length;
		int n = m; 
		int[][] temp = new int[m + 1][n + 1];
		int answer = 0;  
		
		for (int i = 0; i <= m; i++){
			for (int j = 0; j <= n; j++){
				if (i == 0 || j == 0)	temp[i][j] = 0;
				else if (arr[i - 1] == arr[n - j]){
					temp[i][j] = temp[i - 1][j - 1] + 1;
					answer = Math.max(answer, temp[i][j]);
				}
				else temp[i][j] = 0;
			}
		}
		return answer;
	}
}