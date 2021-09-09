import java.util.*;
import java.lang.*;
import java.io.*;

class DeMorgan
{
	public static void main (String[] args)
	{
		boolean s = true;
		for(int i=0;i<1000;i++){
			boolean a = new Random().nextBoolean();
			boolean b = new Random().nextBoolean();
			boolean c = (!a && !b);
			boolean d = a || b; //Only edit this line :)
			d = !d;
			if(c != d)
				s = false;
		}
		if(s)
			System.out.println("Success");
	}
}