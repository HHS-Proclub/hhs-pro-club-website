import java.util.Scanner;

public class PRB2
{

   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      int score1;
      score1 = userInput.nextInt();
      int score2;
      score2 = userInput.nextInt();
      int score3;
      score3 = userInput.nextInt();
      int score4;
      score4 = userInput.nextInt();
      int score5;
      score5 = userInput.nextInt();
      int total = score1 + score2 + score3 + score4 + score5;
      
      System.out.println("" + total);
           
      
   }

}
