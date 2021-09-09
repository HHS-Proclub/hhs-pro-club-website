import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class PRA4 {

	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String eq = kboard.nextLine();
		
		ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptEngine engine = manager.getEngineByName("js");        
	    try {
			
			
			int equals = eq.indexOf('=');
			char varName = 'x';
			for (int i = 0; i < eq.length(); i++) {
				char thisOne = eq.charAt(i);
				if (Character.isLetter(thisOne)) {
					varName = thisOne;
					break;
				}
			}
			
			double left = Double.parseDouble(""+engine.eval("var "+varName+" = 0; "+eq.substring(0,equals)+";"));
			double right = Double.parseDouble(""+engine.eval("var "+varName+" = 0; "+eq.substring(equals+1)+";"));
			
			double leftVar = Double.parseDouble(""+engine.eval("var "+varName+" = 1; "+eq.substring(0,equals)+";"));
			leftVar -= left;
			double rightVar = Double.parseDouble(""+engine.eval("var "+varName+" = 1; "+eq.substring(equals+1)+";"));
			rightVar -= right;
			
			leftVar -= rightVar;
			right -= left;
			
			System.out.println(Math.round(right/leftVar));
	    
	    } catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
