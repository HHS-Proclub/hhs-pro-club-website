
import java.util.Scanner;
public class PRB1{
  public static void main(String[] args) {
    
    Scanner kboard = new Scanner(System.in);
    int numOfTestCases = kboard.nextInt();

    int[] firstnum = new int[numOfTestCases];
    int[] secondnum = new int[numOfTestCases];
    for(int i = 0; i<numOfTestCases; i++){
      int newfirst = kboard.nextInt();
      int newsecond = kboard.nextInt();
      firstnum[i] = newfirst;
      secondnum[i] = newsecond;
    }

    for(int i = 0; i<numOfTestCases; i++){
      System.out.println(firstnum[i] + secondnum[i]);

    }
    



  }
}