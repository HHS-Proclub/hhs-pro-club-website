import java.util.Scanner;

public class PRB1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numInputs = sc.nextInt();

        long[] answers = new long[numInputs];

        for (int i = 0; i < numInputs; i++) {

            long num1 = sc.nextInt();
            long num2 = sc.nextInt();

            answers[i] = calculatePeople(num1, num2);
        }

        for (int i = 0; i < answers.length; i++){
            System.out.println(answers[i]);
        }
    }

    public static long calculatePeople(long num1, long num2){

        return num1 * num2;
    }


}
