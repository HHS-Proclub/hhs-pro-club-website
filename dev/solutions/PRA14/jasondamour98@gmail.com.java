import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class PRA14 {
	  public static void main(String[] args){
		  Scanner in = new Scanner(System.in);
		  
		  int numIns = Integer.parseInt(in.nextLine());
		  String input = "";
		  String oper="^|&!)(";
		  ArrayList<String> answers = new ArrayList<String>();
		  
		  
		  for(int a=0; a<numIns; a++){
			  
			  ArrayList<String> equation = new ArrayList<String>();
			  ArrayList<String> parenLevels = new ArrayList<String>();
			  ArrayList<String> solutions = new ArrayList<String>();

			  
			  int level=0, max=0;
			  boolean solve=false;
			  			  
			  
			  input=in.nextLine();
			  //parsing a String to an ArrayList
			  //assigning paren levels
			  for(int b=0; b<input.length(); b++){
				  if((""+input.charAt(b)).equals("(")){
					  level++;
					  input= ""+(new StringBuffer(input).deleteCharAt(b)); b--;
				  }else if((""+input.charAt(b)).equals(")")){
					  level--;
					  input= ""+(new StringBuffer(input).deleteCharAt(b)); b--;
				  }else{
						equation.add(input.charAt(b)+"");
						parenLevels.add(""+level);
				  }  
			  }
			  
			  //decide the highest paren level to start at
			  if(level==0){
				  ArrayList<String> maxLevels = new ArrayList<String>(parenLevels);
				  Collections.sort(maxLevels);
				  max = (Integer.parseInt(maxLevels.get(maxLevels.size()-1)));
			  }else{
				  System.out.println("parentheses error"); break;
			  }
			  
			  for(int b=max; b>=0; b--){
				  for(int c=0; c<equation.size(); c++){
					  if(parenLevels.get(c).equals(b+"")){
						  solutions.add(equation.get(c));
						  equation.remove(c);
						  parenLevels.remove(c);
						  c--;
					  }else if(solutions.size()>0 && !parenLevels.get(c).equals(b+"")){
						  solve=true;
					  }if(  ((c==equation.size()-1 && solutions.size()>0)) ){
						  solve=true;
					  }
						
					  if(solve==true){
						  solve=false;
						  for(int j =0; j<solutions.size(); j++){
								if((solutions.get(j)).equals("!"))
								{
									if(solutions.get(j+1).equalsIgnoreCase("t")){
										solutions.set(j+1, "F");
									}else if(solutions.get(j+1).equalsIgnoreCase("f")){
										solutions.set(j+1, "T");
									}
									solutions.remove(j);
									j=0;
								}	
							}	
							for(int j =0; j<solutions.size(); j++){
								if((solutions.get(j)).equals("&"))
								{
									if(solutions.get(j+1).equalsIgnoreCase("t") && solutions.get(j-1).equalsIgnoreCase("t")){
										solutions.set(j, "T");
									}if(solutions.get(j+1).equalsIgnoreCase("f") && solutions.get(j-1).equalsIgnoreCase("t")){
										solutions.set(j, "F");
									}if(solutions.get(j+1).equalsIgnoreCase("t") && solutions.get(j-1).equalsIgnoreCase("f")){
										solutions.set(j, "F");
									}if(solutions.get(j+1).equalsIgnoreCase("f") && solutions.get(j-1).equalsIgnoreCase("f")){
										solutions.set(j, "F");
									}
									solutions.remove(j+1);
									solutions.remove(j-1);
									j=0;
								}	
							} 
							for(int j =0; j<solutions.size(); j++){
								if((solutions.get(j)).equals("|"))
								{
									if(solutions.get(j+1).equalsIgnoreCase("t") && solutions.get(j-1).equalsIgnoreCase("t")){
										solutions.set(j, "T");
									}if(solutions.get(j+1).equalsIgnoreCase("f") && solutions.get(j-1).equalsIgnoreCase("t")){
										solutions.set(j, "T");
									}if(solutions.get(j+1).equalsIgnoreCase("t") && solutions.get(j-1).equalsIgnoreCase("f")){
										solutions.set(j, "T");
									}if(solutions.get(j+1).equalsIgnoreCase("f") && solutions.get(j-1).equalsIgnoreCase("f")){
										solutions.set(j, "F");
									}
									solutions.remove(j+1);
									solutions.remove(j-1);
									j=0;
								}	
							}
							
							for(int j =0; j<solutions.size(); j++){
								if((solutions.get(j)).equals("^"))
								{
									if(solutions.get(j+1).equalsIgnoreCase("t") && solutions.get(j-1).equalsIgnoreCase("t")){
										solutions.set(j, "F");
									}if(solutions.get(j+1).equalsIgnoreCase("f") && solutions.get(j-1).equalsIgnoreCase("t")){
										solutions.set(j, "T");
									}if(solutions.get(j+1).equalsIgnoreCase("t") && solutions.get(j-1).equalsIgnoreCase("f")){
										solutions.set(j, "T");
									}if(solutions.get(j+1).equalsIgnoreCase("f") && solutions.get(j-1).equalsIgnoreCase("f")){
										solutions.set(j, "F");
									}
									solutions.remove(j+1);
									solutions.remove(j-1);
									j=0;
								}	
							}
							c++;
							equation.add(c, solutions.get(0));
							parenLevels.add(c, (b-1)+"");
							solutions.clear();
							c--;
					  }
				  } 
			  }  
			  answers.add(equation.get(0));
		  }
		  for(int a=0; a<numIns; a++){
			  System.out.println(answers.get(a));
		  }
	  }
}
			  
/*
		  for(int i=0;i<numIns;i++){
			  ins[i]=in.nextLine();
		  }
		  for(int i=0;i<numIns;i++){
			  ArrayList<String> equation = new ArrayList<String>();
			  ArrayList<String> parenLevels = new ArrayList<String>();
			  int level=0;
			  for(int j = 0; j<ins[i].length(); j++){
				  if((""+ins[i].charAt(j)).equals("(")){
					  level++;
					  ins[i]= ""+(new StringBuffer(ins[i]).deleteCharAt(j));
				  }else if((""+ins[i].charAt(j)).equals(")")){
					  level--;
					  ins[i]= ""+(new StringBuffer(ins[i]).deleteCharAt(j));
				  }else{
						equation.add(ins[i].charAt(j)+"");
						parenLevels.add(""+level);
				  }
				  
				  
				  
				  	
			  }
				  ArrayList<String> maxLevels = new ArrayList<String>(parenLevels);
				  Collections.sort(maxLevels);
				  int max = (Integer.parseInt(maxLevels.get(maxLevels.size()-1)));
				  
				  for(int l=max; l>0; l--){
					  ArrayList<String> paren = new ArrayList<String>();
					  for(int j=0; j<equation.size(); j++){
							if(parenLevels.get(j).equals(l+"")){
								paren.add(equation.get(j));
								equation.remove(j);
								parenLevels.remove(j);
								j--;
							}else if((paren.size()>0 && !parenLevels.get(j).equals(l+""))){
									equation.add(j, ""+this.solveEquation(parenSolution));
									parenLevels.add(j, ""+(l-1));
									paren.clear();
							}if((j==equation.size()-1) && paren.size()>0){
								equation.add(""+this.solveEquation(parenSolution));
								parenLevels.add(""+(l-1));
								paren.clear();
							}
						}			
				  }
				  
				  for(int k=0; k<numIns; k++){
					  for(int j =0; j<equation.size(); j++){
							if((equation.get(j)).equals("!"))
							{
								if(equation.get(j+1).equalsIgnoreCase("t")){
									equation.set(j+1, "F");
								}if(equation.get(j+1).equalsIgnoreCase("f")){
									equation.set(j+1, "T");
								}
								equation.remove(j);
								j=0;
							}	
						}	
					  
					  
					  
					  
						for(int j =0; j<equation.size(); j++){
							if((equation.get(j)).equals("&"))
							{
								if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("t")){
									equation.set(j, "T");
								}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("t")){
									equation.set(j, "F");
								}if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("f")){
									equation.set(j, "F");
								}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("f")){
									equation.set(j, "F");
								}
								equation.remove(j+1);
								equation.remove(j-1);
								j=0;
							}	
						} 
						for(int j =0; j<equation.size(); j++){
							if((equation.get(j)).equals("|"))
							{
								if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("t")){
									equation.set(j, "T");
								}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("t")){
									equation.set(j, "T");
								}if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("f")){
									equation.set(j, "T");
								}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("f")){
									equation.set(j, "F");
								}
								equation.remove(j+1);
								equation.remove(j-1);
								j=0;
							}	
						}
						
						for(int j =0; j<equation.size(); j++){
							if((equation.get(j)).equals("^"))
							{
								if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("t")){
									equation.set(j, "F");
								}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("t")){
									equation.set(j, "T");
								}if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("f")){
									equation.set(j, "T");
								}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("f")){
									equation.set(j, "F");
								}
								equation.remove(j+1);
								equation.remove(j-1);
								j=0;
							}	
						}
					
			  }
		  }
	  }
}
		  

	/*private static void solve() {
		for(int k=0; k<numIns; k++){
			  for(int j =0; j<equation.size(); j++){
					if((equation.get(j)).equals("!"))
					{
						if(equation.get(j+1).equalsIgnoreCase("t")){
							equation.set(j+1, "F");
						}if(equation.get(j+1).equalsIgnoreCase("f")){
							equation.set(j+1, "T");
						}
						equation.remove(j);
						j=0;
					}	
				}	
				for(int j =0; j<equation.size(); j++){
					if((equation.get(j)).equals("&"))
					{
						if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("t")){
							equation.set(j, "T");
						}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("t")){
							equation.set(j, "F");
						}if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("f")){
							equation.set(j, "F");
						}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("f")){
							equation.set(j, "F");
						}
						equation.remove(j+1);
						equation.remove(j-1);
						j=0;
					}	
				} 
				for(int j =0; j<equation.size(); j++){
					if((equation.get(j)).equals("|"))
					{
						if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("t")){
							equation.set(j, "T");
						}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("t")){
							equation.set(j, "T");
						}if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("f")){
							equation.set(j, "T");
						}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("f")){
							equation.set(j, "F");
						}
						equation.remove(j+1);
						equation.remove(j-1);
						j=0;
					}	
				}
				
				for(int j =0; j<equation.size(); j++){
					if((equation.get(j)).equals("^"))
					{
						if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("t")){
							equation.set(j, "F");
						}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("t")){
							equation.set(j, "T");
						}if(equation.get(j+1).equalsIgnoreCase("t") && equation.get(j-1).equalsIgnoreCase("f")){
							equation.set(j, "T");
						}if(equation.get(j+1).equalsIgnoreCase("f") && equation.get(j-1).equalsIgnoreCase("f")){
							equation.set(j, "F");
						}
						equation.remove(j+1);
						equation.remove(j-1);
						j=0;
					}	
				}
		}
	}
}
	
	
	
	
	
 	import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

// Represents a fraction with an int numerator and int denominator
// and provides methods for adding and multiplying fractions.
/*
public class PRA14
{
	private String solution;
	private ArrayList<String> equationer = new ArrayList<String>();
	private ArrayList<String> parenLevels = new ArrayList<String>();	
	private boolean hasVariable=false, hasEquals = false;

	
	
		String x ="", oper = "()*+-/^";
		for(int i=0; i<str.length(); i++){
			if(Character.isDigit(str.charAt(i))){
				while(Character.isDigit(str.charAt(i)))
				{
					x+=""+str.charAt(i);
					if(i==str.length()-1){
						equationer.add(x); x=""; break;
					}if(!Character.isDigit(str.charAt(i+1))){
						equationer.add(x); x=""; break;
					}
					i++;
				}
			}else{
				if(Character.isLetter(str.charAt(i))){
					equationer.add(""+str.charAt(i)); hasVariable=true;
				}if(oper.contains(str.charAt(i)+"")){
					equationer.add(str.charAt(i)+"");
				}if((str.charAt(i)+"").equals("=")){
					equationer.add("="); hasEquals=true;
				}
			}
		}
		//test case: ((3*(9+9)^2)/(2))
		
		if(hasVariable){
			solution = ""+this.solveEquationWithEquals(this.replaceVariable(equationer));
		}else{
			solution = ""+this.solveParen(equationer);
		}
		System.out.println(solution);
	
	public double solveEquation(ArrayList<String> str)
	{	
		for(int i =0; i<str.size(); i++)
		{
			for(int j =0; j<str.size(); j++)
			{
				if((str.get(j)).equals("^"))
				{
					str.set(j, (""+(Math.pow((Double.parseDouble(str.get(j-1))), (Double.parseDouble(str.get(j+1)))))));
					str.remove(j+1);
					str.remove(j-1);
					j=0;
				}
				
			}
			for(int j =0; j<str.size(); j++)
			{
				if((str.get(j)).equals("*"))
				{
					str.set(j, ""+ (Double.parseDouble(str.get(j-1)) * Double.parseDouble(str.get(j+1))));
					str.remove(j+1);
					str.remove(j-1);
					j=0;
				}
				if((str.get(j)).equals("/"))
				{
					str.set(j, ""+ (Double.parseDouble(str.get(j-1)) / Double.parseDouble(str.get(j+1))));
					str.remove(j+1);
					str.remove(j-1);
					j=0;
				}
			}
			for(int j =0; j<str.size(); j++)
			{
				if((str.get(j)).equals("+"))
				{
					str.set(j, ""+ (Double.parseDouble(str.get(j-1)) + Double.parseDouble(str.get(j+1))));
					str.remove(j+1);
					str.remove(j-1);
					j=0;
				}
				if((str.get(j)).equals("-"))
				{
					str.set(j, ""+ (Double.parseDouble(str.get(j-1)) - Double.parseDouble(str.get(j+1))));
					str.remove(j+1);
					str.remove(j-1);
					j=0;
				}
			}
		}
		return Double.parseDouble(str.get(0));
	}
	private boolean solveEquationWithEquals(ArrayList<String> str)
	{	
		ArrayList<String> firstHalf = new ArrayList<String>();
		ArrayList<String> secondHalf = new ArrayList<String>();
		
		int indexOfEquals=0;
		for(int i=0; i<str.size(); i++)
		{
			if(str.get(i).equals("=")){
				indexOfEquals = i;
			}
		}
		firstHalf = new ArrayList<String>(str.subList(0, indexOfEquals));
		secondHalf = new ArrayList<String>(str.subList(indexOfEquals+1, str.size()));
		
		double firstSolution = this.solveEquation(firstHalf);
		double secondSolution = this.solveEquation(secondHalf);
		
		if((""+firstSolution).equals(""+secondSolution)){
			return true;
		}else{
			return false;
		}
	}
	private ArrayList<String> replaceVariable(ArrayList<String> str)
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("enter your test value");
		int var = in.nextInt();
		int indexOfVariable = 0;
		
		for(int i=0; i<str.size(); i++){
			if(Character.isLetter((str.get(i)).charAt(0))){
				indexOfVariable = i; break;
			}
		}
		str.remove(indexOfVariable);
		str.add(indexOfVariable, ""+var);
		return str;
	}
	private double solveParen(ArrayList<String> str)
	{
		int numLevels=0, maxLevel=0;
		for(int i = 0; i<str.size(); i++){
			if((str.get(i)).equals("(")){
				numLevels++;
				str.remove(i);
				if(numLevels>maxLevel)
					maxLevel=numLevels;
				i--;
			}else if((str.get(i)).equals(")")){
				numLevels--;
				str.remove(i);
				i--;
			}else{
				parenLevels.add(""+numLevels);
			}
		}
		
		if(numLevels!=0)
			throw new IllegalArgumentException("Imbalance of parentheses");
		
		for(int i=maxLevel; i>=0; i--){
			ArrayList<String> parenSolution = new ArrayList<String>();
			//find indexes of everything at this level
			for(int j=0; j<str.size(); j++){
				if(parenLevels.get(j).equals(i+"")){
					parenSolution.add(str.get(j));
					str.remove(j);
					parenLevels.remove(j);
					j--;
				}else if((parenSolution.size()>0 && !parenLevels.get(j).equals(i+""))){
						str.add(j, ""+this.solveEquation(parenSolution));
						parenLevels.add(j, ""+(i-1));
						parenSolution.clear();
				}if((j==str.size()-1) && parenSolution.size()>0){
					str.add(""+this.solveEquation(parenSolution));
					parenLevels.add(""+(i-1));
					parenSolution.clear();
				}
			}			
		}
		return Double.parseDouble(str.get(0));
	}
}
*/

