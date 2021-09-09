public class PRA4 {
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		String str=s.next();
		
		//first coefficent
		int ind1=str.indexOf('*');
		String coef1="";
		for(int i=ind1-1;i>=0;i--){
			if(!Character.isDigit(str.charAt(i)) && !(str.charAt(i)=='-')){
				break;
			}else{
				coef1=str.charAt(i)+coef1;
				if(str.charAt(i)=='-') break;
			}
		}
		
		// second coefficent
		int ind2=str.lastIndexOf('*');
		String coef2="";
		for(int i=ind2-1;i>=0;i--){
			if(!Character.isDigit(str.charAt(i)) && !(str.charAt(i)=='-')){
				break;
			}else{
				coef2=str.charAt(i)+coef2;
				if(str.charAt(i)=='-') break;
			}
		}
		
		//first b
		String var1="";
		if(ind1==coef1.length()){
			int startInd=str.charAt(ind1+2)=='-'?ind1+2:ind1+3;
			for(int i=startInd;Character.isDigit(str.charAt(i)) || (str.charAt(i)=='-');i++){
				var1+=str.charAt(i);
			}
		}else{
			for(int i=0;i<ind1-1-coef1.length();i++){
				var1+=str.charAt(i);
			}
		}
		
		//second b
		String var2="";
		if(ind2==str.indexOf('=')+1+coef2.length()){
			int startInd=str.charAt(ind2+2)=='-'?ind2+2:ind2+3;
			for(int i=startInd;i<str.length();i++){
				var2+=str.charAt(i);
			}
		}else{
			for(int i=str.indexOf('=')+1;i<ind2-1-coef2.length();i++){
				var2+=str.charAt(i);
			}
		}
		
//		System.out.println(coef1+"  "+coef2+"  "+var1+"  "+var2);
		
		double answer=(Double.parseDouble(var2)-Double.parseDouble(var1)) / (Double.parseDouble(coef1)-Double.parseDouble(coef2));
		// what to do if this is infinity/NaN?
		
		System.out.println((int)answer);
	}
}