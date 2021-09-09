import java.util.Scanner;
public class PRI1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner dv = new Scanner(System.in);

        int problems = dv.nextInt();
        String [] inputs = new String[problems];

        for (int i = 0; i < problems; i++){
            inputs[i] = sc.nextLine();
        }

        for (int i = 0; i < problems; i++){
            int firstSpace = inputs[i].indexOf(' ');
            int secondSpace = inputs[i].indexOf(' ', firstSpace + 1);
            String segB = inputs[i].substring(0, firstSpace);
            String sebS = inputs[i].substring(firstSpace + 1, secondSpace);
            String sebH = inputs[i].substring(secondSpace + 1);
            int b = Integer.parseInt(segB);
            int s = Integer.parseInt(sebS);
            int h = Integer.parseInt(sebH);

            int x = b - s;
            int y = b - h;

            if (s == h){
                if (s == b)
                    System.out.println(1);
                else if (s < b)
                    System.out.println(s + 1);
            }

            if (s + h > b) {
                if (x > y)
                    System.out.println(x + 1);
                else if (y > x)
                    System.out.println(y + 1);
            }

            if (s + h == b){
                if (s > h)
                    System.out.println(s + 1);
                if (h > s)
                    System.out.println(h + 1);
            }
        }

    }
}
