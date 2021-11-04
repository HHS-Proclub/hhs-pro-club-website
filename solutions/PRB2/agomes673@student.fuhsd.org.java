import java.util.Scanner;

public class PRB2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numtimes=sc.nextInt();
        String x=sc.nextLine();
        for(int i=0;i<numtimes;i++)
        {
            boolean isHaiku=true;
            String[] haiku=new String[3];
           
            haiku[0]=sc.nextLine();
            
            haiku[1]=sc.nextLine();
            haiku[2]=sc.nextLine();
            for(int j=0;j<haiku.length;j++)
            {
                int sylableCount=0;
                int expectedSylable=5;
                if(j==1)
                {
                    expectedSylable=7;
                }
                for(int h=0;h<haiku[j].length();h++)
                {
                    if(haiku[j].charAt(h)=='a')
                    {
                        sylableCount++;

                    }else if(haiku[j].charAt(h)=='e')
                    {
                        sylableCount++;
                    }else if(haiku[j].charAt(h)=='i')
                    {
                        sylableCount++;
                    }else if(haiku[j].charAt(h)=='o')
                    {
                        sylableCount++;
                    }else if(haiku[j].charAt(h)=='u')
                    {
                        sylableCount++;
                    }
                    if(sylableCount>expectedSylable)
                    {
                        break;
                    }
                }
                
                if(sylableCount!=expectedSylable)
                {
                    isHaiku=false;
                    break;
                }


            }
            if(isHaiku)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }

        }





    }
}