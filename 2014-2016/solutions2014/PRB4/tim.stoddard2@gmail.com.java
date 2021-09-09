public class PRB4 {
	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String str[] = new String[n];
		for(int i = 0; i < n; i++)
			str[i] = s.nextLine();
		
		for(int i=0;i<n;i++){
			if(str[i].charAt(0)=='a'||str[i].charAt(0)=='e'||str[i].charAt(0)=='i'||str[i].charAt(0)=='o'||str[i].charAt(0)=='u')
				System.out.println(str[i]+"way");
			else
				System.out.println(str[i].substring(1, str[i].length())+str[i].charAt(0)+"ay");
		}
	}
}