import java.util.Scanner;


public class PRA6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String num = "1" ;//add spaces before and after num
		boolean multiple = false;
		
		for(int i=0; i<n-1; i++){//how many look-say numbers do you need
			for(int h=0; h<num.length(); h++){
				String test ="" + num.charAt(0);
				if(test.equals(""+num.charAt(h))){
					multiple=false;
				}else{
					multiple=true;
					break;
				}
			}
			for(int k=0; k<num.length(); k++){//breaks the num into similar digits
				int startCount=num.lastIndexOf(' ')+1, endCount=num.lastIndexOf(' ')+1;
				while(endCount<num.length() && multiple==true){
					String focus = ""+num.charAt(startCount), focus2 = ""+num.charAt(endCount);
					
					if(focus.equals(focus2)){
						endCount++;
					}else{
						num = ((new StringBuffer(num)).insert(endCount, ' ')).toString();
						break;
					}
				}
			}
			//count the spaces
			int counter = 1;
			for(int l=0; l<num.length(); l++){
				if((""+num.charAt(l)).equals(" ")){
					counter++;
				}
			}
			//modify each number
			StringBuffer num2 = new StringBuffer(num);
			String[] seg = new String[counter];
			for(int f=0; f<counter; f++){
				if((num2.charAt(0)+"").equals(" ")){
					num2.delete(0, 1);
				}int index= 0, index2 = num2.indexOf(" ");
				if(index2<0){
					index2=num2.length();
				}seg[f]= num2.substring(index, index2);	
				num2.delete(index, index2);
			}
			
			//rename each seg
			String num3="";
			for(int g=0; g<counter; g++){
				num3 += seg[g].length()+""+seg[g].charAt(0);
			}
			
			num = ((new StringBuffer(num3)).reverse()).toString();
		}System.out.println(num);
	}

}
