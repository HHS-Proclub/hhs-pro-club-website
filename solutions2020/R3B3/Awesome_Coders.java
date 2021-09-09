import java.util.Scanner;

public class R3B3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {
            String str = sentenceArray[i];
            if (str.length() % 2 == 0) {
                str = str.replace('e', 'c');
                char[] strArray = str.toCharArray();
                int j = 0;
                int k = strArray.length - 1;

                while (j < k) {
                    char temp = strArray[j];
                    strArray[j] = strArray[k];
                    strArray[k] = temp;
                    j++;
                    k--;
                }
                System.out.print(new String(strArray) + " ");
            } else {

                char[] strArray = str.toCharArray();
                char temp =  strArray[0];
                strArray[0] =  strArray[strArray.length - 2];
                strArray[strArray.length - 2] = temp;
                System.out.print(new String(strArray) + " ");
            }
        }
        System.out.println();
        in.close();
    }
    public static void main0(String[] args) {
        String originalString = "abcde";

        char[] c = originalString.toCharArray();

        // Replace with a "swap" function, if desired:
        char temp = c[0];
        c[0] = c[1];
        c[1] = temp;

        String swappedString = new String(c);

        System.out.println(originalString);
        System.out.println(swappedString);
    }
}
