import java.util.*; 
import java.lang.*; 
  
public class PRB9
{ 
    public static int findNth(int n) 
    { 
        int count = 0; 
  
        for (int ok = 19; ; ok += 9) 
        { 
            int sum = 0; 

            for (int x = ok; x > 0; x = x / 10) 
                sum = sum + x % 10; 

            if (sum == 10) 
                count++; 
  
            if (count == n) 
                return ok; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
      Scanner in = new Scanner(System.in);
      int meme = in.nextInt();
      for (int i = 0; i < meme; i++) {
        int othermeme = in.nextInt();
        System.out.println(findNth(othermeme));
      }
    } 
} 