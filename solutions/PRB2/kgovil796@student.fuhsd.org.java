import java.util.*;
// import java.io.*;
public class PRB2{
    public static void main(String[]args) throws Exception {
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add(new Character());
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String line="";
        String out = "";
        for(int i =0; i < t; i++){
            for(int j =0; j<3; j++){
                line=in.nextLine();
                int vowelCount = 0; 
                int letters = line.length();
                for(int a =0; a < letters; a++){
                    if(vowels.contains(line.charAt(a))){
                        vowelCount++;
                    }
                }
                if(j == 0 || j == 2 && vowelCount == 5 || j == 1 && vowelCount ==7){
                    if(j==2){
                        out = out +"YES" + '\n';
                        break;
                    }
                } else {
                    out = out +"NO"+'\n';
                    break;
                }

            }

        }
        System.out.print(out);
    }
}
