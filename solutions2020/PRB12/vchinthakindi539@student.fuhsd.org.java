import java.util.Scanner;

public class PRB12 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
	int	testCase=kboard.nextInt();
	String [] words = new String[testCase+1];
	
	
	for(int i=0;i<words.length;i++){
		
		words[i]=kboard.nextLine();	
	}
for(int i=0;i<words.length;i++){
		
		System.out.println(words[i].substring(0,(words[i].length()/2)));
	}
	
	
	}

}
