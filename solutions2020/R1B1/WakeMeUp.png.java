import java.util.Scanner;
public class R1B1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		for(int i = 0; i<words.length; i++){
			if(i == 0){
			}else{
				if(words[i].equalsIgnoreCase(words[i-1])){
					words[i] = "";
				}
			}
		}
		for(int i = 0; i<words.length;i++){
			if(words[i] == ""){
			}else{
				System.out.print(words[i]);
				if(i==words.length-1){
				}else{
					System.out.print(" ");
				}
			}
		}
		input.close();
	}
}
