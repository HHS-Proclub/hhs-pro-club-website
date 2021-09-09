
import java.lang.Math; // headers MUST be above the first class
import java.io.Console;

// one class needs to have a main() method
public class PRB1
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	int NumPeopleToDistribute = DistributeCandies(11); 
    System.out.print(NumPeopleToDistribute);
  }
  
  
  

  public static int CountCandies(int NumPeople)
  {
    int NumCandies=0;
    
    for (int i=1; i <= NumPeople; i++)
    {
    	NumCandies = NumCandies + i;
    }
    
    return NumCandies;
  }
  
  public static int DistributeCandies(int NumCandiesInHand)
  {
    int NumPeopleToDistribute=0;
    
    int NumPeople = 1;
    int NumCandies = CountCandies(NumPeople);
  
  	while (NumCandies <= NumCandiesInHand)
    {
	   NumPeople++;
       NumCandies = CountCandies(NumPeople);
    }

    NumPeopleToDistribute = NumPeople - 1;
    return NumPeopleToDistribute;
  }
  
  
}


