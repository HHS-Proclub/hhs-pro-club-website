import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


/*
 * Kazu Kogachi
 * Mar 17, 2015
 */

public class PRA13 {

	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int num = Integer.parseInt(in.readLine());
        
        ArrayList<String> names = new ArrayList<String>();
        
        boolean[][] isInfected = new boolean[num][2]; // {top, bottom}
        for(int i = 0 ; i < num - 1; i++) {
    		isInfected[i] = new boolean[] {false, false};
        }
        
        int current = 0;

        for(int i = 0 ; i < num ; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			char c = st.nextToken().charAt(0);
			String name = st.nextToken();

//			System.out.print("Process #" + i + " " + c + " " + name + ": ");
			if(i == 0){
//				System.out.print("first customer, infected ");
				isInfected[current] = new boolean[] {true,true};
				names.add(name);
				current++;
			} else {
				switch(c){
					case 't': {
//						System.out.print("Customer ");
						if(isInfected[current][0] || isInfected[current][1]) {
//							System.out.print("infected ");
							if(!names.contains(name)) {
								names.add(name);
							}
							isInfected[current] = new boolean[] {true, true};
						} else {
//							System.out.print("not infected ");
						}
						current++;
						break;
					}
					case 'r': {
//						System.out.print("Tray Inc ");
						current--;
						if(names.contains(name)) {
//							System.out.print("lower tray infected due to infected person");
							isInfected[current+1][0] = true;
							isInfected[current] = new boolean[] {true, true};
						} else if(isInfected[current+1][0]) {
//							System.out.print("top tray infected due to lower tray");
							isInfected[current][1] = true;
						} else {
//							isInfected[current] = new boolean[] {false, false};
						}
						break;
					}
				}
			}
//			System.out.println();
        }
       
        
    	for(String s : names) {
    		System.out.println(s);
    	}
	}
	
}
