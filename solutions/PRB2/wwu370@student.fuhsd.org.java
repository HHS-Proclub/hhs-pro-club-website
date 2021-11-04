import java.util.Scanner;

public class PRB2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line1, line2, line3;
        int NUM;

        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
        //inputs
            NUM=0;

            line1=sc.nextLine();

            line2=sc.nextLine();;

            line3=sc.nextLine();

            //Checks syllables
            if(numOfSyllables(line1)!=5||numOfSyllables(line2)!=7||numOfSyllables(line3)!=5||line1.isEmpty()||line2.isEmpty()||line3.isEmpty()){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }

    }

    //checks if the phrase has any syllables
    public static int numOfSyllables(String phrase){
        int numOfSyllables=0;
        for(int i=0;i<phrase.length();i++){
            if(phrase.charAt(i)=='a'||phrase.charAt(i)=='e'||phrase.charAt(i)=='i'||phrase.charAt(i)=='o'||phrase.charAt(i)=='u'){
                numOfSyllables+=1;
            }

        }
        return numOfSyllables;
    }
}
