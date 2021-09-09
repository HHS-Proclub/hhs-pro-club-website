import java.util.Scanner;
public class PRB11 {

	public static int grade(int n, String key, String ans){
		int grade = 0;
		for (int i = 0; i<n; i++)
		{
			String k = key.charAt(i)+"";
			String a = ans.charAt(i)+"";
			
			if (k.equals(a))
			{
				grade += 4;
			}
			else
			{
				grade -= 1;
			}
		}
		return grade;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine(); //<- thx heidi
		String key = scan.nextLine();
		key = key.replace(" ", "");
		String ans = scan.nextLine();
		ans = ans.replace(" ", "");
		System.out.print(grade(n, key, ans));
		scan.close();
		
	}

}
//Tiffany Wu
//java scanner #struggles