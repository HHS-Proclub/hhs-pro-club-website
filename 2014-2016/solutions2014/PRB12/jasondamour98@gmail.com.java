import java.util.Scanner;


public class PRB12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numCards = input.nextInt();
		String x=input.nextLine(), cards = input.nextLine();
		boolean multiple = false;
		int result=0;
		
		for(int h=0; h<cards.length(); h++){
			String test ="" + cards.charAt(0);
			if(test.equals(""+cards.charAt(h))){
				multiple=false;
			}else{
				multiple=true;
				break;
			}
		}
		for(int k=0; k<cards.length(); k++){//breaks the num into similar digits
			int startCount=cards.lastIndexOf(' ')+1, endCount=cards.lastIndexOf(' ')+1;
			while(endCount<cards.length() && multiple==true){
				String focus = ""+cards.charAt(startCount), focus2 = ""+cards.charAt(endCount);
				
				if(focus.equals(focus2)){
					endCount++;
				}else{
					cards = ((new StringBuffer(cards)).insert(endCount, ' ')).toString();
					break;
				}
			}
		}
		//count the spaces
		int counter = 1;
		for(int l=0; l<cards.length(); l++){
			if((""+cards.charAt(l)).equals(" ")){
				counter++;
			}
		}
		//modify each number
		StringBuffer cards2 = new StringBuffer(cards);
		String[] seg = new String[counter];
		for(int f=0; f<counter; f++){
			if((cards2.charAt(0)+"").equals(" ")){
				cards2.delete(0, 1);
			}int index= 0, index2 = cards2.indexOf(" ");
			if(index2<0){
				index2=cards2.length();
			}seg[f]= cards2.substring(index, index2);	
			cards2.delete(index, index2);
		}
		for(int f=0; f<counter; f++){
			int focus = seg[f].length();
			if(focus>result){
				result=focus;
			}
		}
		System.out.println(result);
	}

}
