import java.util.*;
import java.io.*;

public class perimeter {
    static int perimeter = 0;
    static char[][] array = new char[102][102];
    public static void main(String args[]) throws IOException{
   	 BufferedReader read = new BufferedReader(new FileReader("perimeter.in"));
   	 BufferedWriter write = new BufferedWriter(new FileWriter("perimeter.out"));
   	 StringTokenizer token = new StringTokenizer(read.readLine());
   	 int elements = Integer.parseInt(token.nextToken());
   	 for(int i  = 0; i < array.length; i ++) {
   		 for(int j = 0; j < array[0].length; j++) {
   			 array[i][j] = '0';
   		 }
   	 }
   	for(int count = 0; count < elements; count++) {
  		 token = new StringTokenizer(read.readLine());
  		 int i = Integer.parseInt(token.nextToken());
  		 int j = Integer.parseInt(token.nextToken());
  		 array[i][j] = '1';
  	 }
  	 search(0, 0);
  	 search(0, 101);
  	 search(101, 0);
  	 search(101, 101);
  	 
  	 write.write(String.valueOf(perimeter));
  	 write.close();
   }
    static void search(int i, int j) {
      	 if(array[i][j] != '0') return;
      	 array[i][j] = '2';
      	 
      	 //check to see if the neighbors are X's
      	 //Call the recursive methods
    }
 }