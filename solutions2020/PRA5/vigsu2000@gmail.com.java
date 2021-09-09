
public class PRA5 {
	
	public static int calcHighestAltitude(int N, int A, int B) {
		int currentAlt = 0;
		int i = 1;
		while(currentAlt - B*(N-i) < 0) {
			currentAlt += A;
			while(currentAlt - B*(N-i) > 0) {
				currentAlt -= 1;
			}
			i++;
		}
		return currentAlt;
	}
	
	public static void main(String[] args) {
		System.out.println(calcHighestAltitude(20, 7, 9));
	}

}
