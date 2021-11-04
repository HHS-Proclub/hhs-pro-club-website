import java.util.Scanner;
// import java.io.*;
public class PRI1{
    public static void main(String[]args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String out = "";
        for(int i =0; i < t; i++){
            out = out + (in.nextInt()+in.nextInt()) + '\n';
        }
        System.out.print(out);
    }
}
