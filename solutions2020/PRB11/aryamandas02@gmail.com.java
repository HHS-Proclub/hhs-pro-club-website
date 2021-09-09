import java.util.Scanner;

public class PRB11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputArray = input.split(" ");

        int hyp = Integer.parseInt(inputArray[0]);
        int angle = Integer.parseInt(inputArray[1]);
        double rad = angle * (Math.PI / 180);

        int area = (int) (0.5 * (hyp * Math.sin(rad)) * (hyp * Math.cos(rad)));

        System.out.println(area);

        in.close();

    }
}
