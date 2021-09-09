import java.util.Scanner;
public class PRB1 {

  public static void main(String[] args) {
    Scanner kboard = new Scanner(System.in);
    System.out.print("Enter an order number: ");
    int order_num = kboard.nextInt();
    order_num = order_num * 3;
    System.out.println(order_num);


  }

}
