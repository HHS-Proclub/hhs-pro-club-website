import java.util.*;
public class PRB6 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[][]arr = new String[n][n];
		for(int x=0;x<n;x++){
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			for(int y=0;y<n;y++){
				arr[x][y] = st.nextToken();
			}
		}
		for(int x=0;x<n/2;x++){
			rotate(arr, x, n-x-1);
		}
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				if(y<n-1){
					System.out.print(arr[x][y]+" ");
				}
				else{
					System.out.println(arr[x][y]);
				}
			}
		}
	}
	public static void rotate(String[][]arr, int start, int end){
		int n = arr.length;
		String[][]temp = new String[n][n];
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				temp[x][y] = arr[x][y];
			}
		}
		for(int x=start;x<=end;x++){
			arr[start][x] = temp[end-x+start][start];
		}
		for(int x=start;x<=end;x++){
			arr[x][end] = temp[start][x];
		}
		for(int x=end;x>=start;x--){
			arr[end][x] = temp[end-x+start][end];
		}
		for(int x=end;x>=start;x--){
			arr[x][start] = temp[end][x];
		}
	}
}
