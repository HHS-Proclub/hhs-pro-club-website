import java.util.Scanner;
import javax.script.*;

public class PRA14 {
	
	 public static void main(String args[]) throws Exception {
		 
		 	Scanner input = new Scanner(System.in);
		 	int no = Integer.parseInt(input.nextLine());
		 	String printMe = "T";
		 	
		    ScriptEngine js = new ScriptEngineManager().getEngineByName("javascript");
		    Bindings bindings = js.getBindings(ScriptContext.ENGINE_SCOPE);
		    bindings.put("stdout", System.out);
		    js.put("String", printMe);
		    
		    String[] bools = new String[no];
		 	for (int i = 0; i < no; i++)
		 		bools[i] = input.nextLine();
		    
		 	for (int i = 0; i < no; i++) {
		 		bools[i] = bools[i].replaceAll("T", "true").replaceAll("F", "false").replaceAll("\\^", "!=").replaceAll("\\|", "||").replaceAll("&", "&&");	
			    js.eval("if(" + bools[i] + ") { stdout.println(\"T\"); } else { stdout.println(\"F\"); }");
		 	}
		  }
	

}
