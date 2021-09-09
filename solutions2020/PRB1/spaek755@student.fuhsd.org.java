import java.util.Scanner;
class PRB1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for (int i = 1; i <= n; i++){
      int x = scan.nextInt();
      int y =  scan.nextInt();
      System.out.println(x+y);
    }
  scan.close();
  }
}