import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        
        for(int i = 0; i < x; i++) {
        	int a = input.nextInt();
        	int b = input.nextInt();
        	int c = input.nextInt();
        	int m = input.nextInt();
        	ArrayList<Integer> arr0 = new ArrayList<Integer>();
        	ArrayList<Integer> arr1 = new ArrayList<Integer>();
        	for(int j = 0; j < m; j++) {
        		int p = input.nextInt();
            	int t = input.nextInt();
            	if(t == 0) {
            		arr0.add(p);
            	} else {
            		arr1.add(p);
            	}
        	}
        	Collections.sort(arr0);
        	Collections.sort(arr1);
        	int price = 0;
        	int count = 0;
        	while(c > 0) {
        		if(arr0.isEmpty()) {
        			if(arr1.isEmpty()) {
        				c = 0;
        			} else {
        				count++;
            			price += arr1.get(0);
            			arr1.remove(0);
        			}
        		} else {
        			if(arr0.get(0) < arr1.get(0)) {
            			price += arr0.get(0);
            			count++;
            			arr0.remove(0);
            			
            		} else {
            			count++;
            			price += arr1.get(0);
            			arr1.remove(0);
            		}
        		}
        		
        		c--;
        	}
        	
        	while(a > 0) {
        		if(!arr0.isEmpty()) {
        			price += arr0.get(0);
        			count++;
        			arr0.remove(0);
        		} else {
        			a = 0;
        		}
        		a--;
        	}
        	while(b > 0) {
        		if(!arr1.isEmpty()) {
        			price += arr1.get(0);
        			count++;
        			arr1.remove(0);
        		} else {
        			b = 0;
        		}
        		b--;
        	}
        	System.out.println(count + " " + price);
        }
        input.close();
	}
}
