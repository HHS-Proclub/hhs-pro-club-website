import java.util.*;

public class PRB4
{
    public static void main(String[] args)
    {

        int T;
        String input;
        Scanner sc;

        sc=new Scanner(System.in);

        T= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++)
        {
            input=sc.nextLine();
            System.out.println(solve(input));
        }

    }

    public static String solve(String input)
    {
        int lowerCount=0, upperCount=0;
        String result=input;

        for(int count=0;count<result.length();count++)
        {
            if(Character.isUpperCase(result.charAt(count)))
            {
                upperCount++;
            }else{
                lowerCount++;
            }
        }

        if(upperCount>lowerCount)
        {
            result=result.toUpperCase();
        }else{
            result=result.toLowerCase();
        }

        return result;
    }

}
