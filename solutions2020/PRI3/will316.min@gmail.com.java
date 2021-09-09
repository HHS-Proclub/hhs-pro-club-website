import java.util.Scanner;
import java.util.Arrays;

public class PRI3 
{
	public static void main(String[] args)
	{
		/*
		FileReader in_file = new FileReader("data/archery.in");
        BufferedReader buff_in = new BufferedReader(in_file);
        FileWriter out_file = new FileWriter("data/archery.out");
        BufferedWriter buff_out = new BufferedWriter(out_file);
        PrintWriter output = new PrintWriter(buff_out);
        
        int setNum = Integer.parseInt(buff_in.readLine());
        
        for (int i = 0; i < setNum; i++)
        {
        	int[] arrows = new int[Integer.parseInt(buff_in.readLine())];
        	StringTokenizer st = new StringTokenizer(buff_in.readLine());
        	for (int j = 0; j < arrows.length; j++)
        		arrows[j] = Integer.parseInt(st.nextToken());
        	PRI3 arch = new PRI3();
        	System.out.println(arch.calculateNumArrows(arrows));
        }
        
        buff_in.close();
        output.close();
        */
		Scanner reader = new Scanner(System.in);
		
		//System.out.print("Number of Sets of Cans:");
		int archSet = reader.nextInt();
		int[] results = new int[archSet];
		for (int i = 0; i < archSet; i++)
		{
			//System.out.print("Number of Cans:");
			int canNum = reader.nextInt();
			int[] arrows = new int[canNum];
			for (int j = 0; j < canNum; j++)
			{
				//System.out.print("Can Durability:");
				arrows[j] = reader.nextInt();
			}
			PRI3 arch = new PRI3();
        	results[i] = arch.calculateNumArrows(arrows);
		}
		
		for (int i = 0; i < results.length; i++)
			System.out.println(results[i]);
	}
	
	public int calculateNumArrows(int[] arrows)
	{
		Arrays.sort(arrows);
		flipArray(arrows);
		int totalArrows = 0;
		for (int i = 0; i < arrows.length; i++)
			totalArrows += arrows[i] * i + 1;
		return totalArrows;
	}
	
	public void flipArray(int[] array)
	{
		for (int i = 0; i < array.length/2; i++)
		{
			int temp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = temp;
		}
	}
}
