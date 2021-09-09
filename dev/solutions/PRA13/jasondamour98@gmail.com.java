import java.util.ArrayList;
import java.util.Scanner;


public class PRA13 {
	private static int topOfTray = 11;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numActions = Integer.parseInt(in.nextLine());
		ArrayList<String> actType = new ArrayList<String>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> isInfected = new ArrayList<String>();
		ArrayList<String> trayStack = new ArrayList<String>();

		for(int i=0; i<10; i++){
			trayStack.add("0 0");
		}
		for(int i=0; i<numActions; i++){
			String x = in.nextLine();
			actType.add(x.substring(0,1));
			name.add(x.substring(2));
			if(i==0 || name.get(name.size()-1).equals(name.get(0)))
				isInfected.add("true");
			else
				isInfected.add("false");
		}
		
		
		for(int i=0; i<numActions;i++){
			if(actType.get(i).equals("r")){//if they return the tray
				if(isInfected.get(i).equals("true")){ 
					trayStack.add(topOfTray, "1 1");
					topOfTray++;
				}
				if(isInfected.get(i).equals("false")){
					trayStack.add(topOfTray, "0 0");
					topOfTray++;
				}
				
				if(((trayStack.get(topOfTray-1)).substring(0,1).equals("1")) || ((trayStack.get(topOfTray-2)).substring(2).equals("1"))){
					trayStack.set(topOfTray-1,""+(new StringBuffer(trayStack.get(topOfTray-1))).replace(0, 1, "1"));
					trayStack.set(topOfTray-2,""+(new StringBuffer(trayStack.get(topOfTray-2))).replace(2, 3, "1"));
				}
			}if(actType.get(i).equals("t")){
				if(trayStack.get(topOfTray-2).contains("1")){
					isInfected.set(i, "true");
					topOfTray--;
				}else{
					topOfTray--;
				}
			}
		}
		String out="";
		for(int i=0; i<numActions; i++){
			if(isInfected.get(i).equals("true") && !out.contains(name.get(i))){
				out += name.get(i) + "\n";
			}
		}
		System.out.println(out);
		
	}
}
