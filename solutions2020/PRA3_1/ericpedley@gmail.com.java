import java.util.*;

public class PRA3_1{

    static void sort(int[] dataSet)
	{
		int L = dataSet.length;
		for(int c=0;c<L;c++)
		{
			if(c!=L-1)
			{
				if(dataSet[c]<dataSet[c+1])
				{
					int storage =dataSet[c];
					dataSet[c]=dataSet[c+1];
					dataSet[c+1]=storage;
					c--;
				}
			}
			if(c>0)
			{
				if(dataSet[c]>dataSet[c-1])
				{
					int storage =dataSet[c];
					dataSet[c]=dataSet[c-1];
					dataSet[c-1]=storage;
					c-=2;
				}
			}
		}
	}

    static int minEnergy(int length, int[] pieces){
        sort(pieces);
        int solution2=-1;
        if(pieces.length>3) {
        	int[] piece1 = new int[pieces.length/2];
        	int[] piece2 = new int[(int)(Math.round(pieces.length/2d))];
        	int l1=0;
        	int l2=0;
        	for(int c = 0; c< pieces.length;c++) {
        		if(c<pieces.length/2) {
        			piece1[c]=pieces[c];
        			l1+=pieces[c];
        		} else {
        			piece2[c-pieces.length/2]=pieces[c];
        			l2+=pieces[c];
        		}
        	}
        	solution2 = length+minEnergy(l1,piece1)+minEnergy(l2,piece2);
        	
        }
        int numPieces=pieces.length;
        if(numPieces==1)
            return 0;
        int totalEnergy=0;
        for(int c: pieces){
            if(numPieces==1)
                break;
            totalEnergy+=length;
            length-=c;
            numPieces--;
        }
        return Math.min(solution2, totalEnergy);
    }
    static int nInt(Scanner s) {
		return Integer.parseInt(s.next().trim());
	}
	
	static int[] castInt(String[] s) {
		int[] result = new int[s.length];
		for(int c=0;c<s.length;c++) {
			result[c]=Integer.parseInt(s[c]);
		}
		return result;
	}
     public static void main(String []args){
    	 int[] testCase = {2,3,3,2};
        Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");
		int[][] input = new int[nInt(in)][];
		int[] numR = new int[input.length];
		for(int x=0;x<input.length;x++) {
		    int len = Integer.parseInt(in.next().trim().split(" ")[0]);
		    input[x]=castInt(in.next().trim().split(" "));
			numR[x]=minEnergy(len,input[x]);
		}
		for(int x: numR) {
			System.out.println(x);
		}
     }
}
