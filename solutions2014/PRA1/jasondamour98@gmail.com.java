import java.util.Scanner;


public class PRA1 {
	
	public static void main(String[] args)
	  {
		Scanner input = new Scanner(System.in);
		String firstHex = input.nextLine(), secondHex = input.nextLine();
		
		int result = (int) (gcd(hexToDec(firstHex),hexToDec(secondHex)));
		System.out.println( result );
		String hexResult = Integer.toHexString(result);
		int x=4-(hexResult.length());
		for(int i =0; i<x; i++)
		{
			hexResult = '0' + hexResult;
		}
		System.out.println(hexResult);

		
	  }
	private static double gcd(int n, int d)
	  {
	    if (n <= 0 || d <= 0){
	      throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
	    }if (n % d == 0)
	      return d;
	    else if (d % n == 0)
	      return n;
	    else
	      return gcd(n % d, d % n); 
	  }
	
	
	private static int hexToDec(String hexadecimal)
    {
        int h=hexadecimal.length()-1, d=0, n=0;
        for(int i=0;i<hexadecimal.length();i++)
        {
            char ch=hexadecimal.charAt(i);boolean flag=false;
            switch(ch)
            {
            	case '0':n=0;break;
                case '1':n=1;break;
                case '2':n=2;break;
                case '3':n=3;break;
                case '4':n=4;break;
                case '5':n=5;break;
                case '6':n=6;break;
                case '7':n=7;break;
                case '8':n=8;break;
                case '9':n=9;break;
                case 'A':n=10;break;
                case 'B':n=11;break;
                case 'C':n=12;break;
                case 'D':n=13;break;
                case 'E':n=14;break;
                case 'F':n=15;break;
                default : flag=true;
            }
            if(flag){System.out.println("Wrong Entry");break;}
            d=(int)(n*(Math.pow(16,h)))+(int)d;
            h--;

        }
        return d;
    }
}
