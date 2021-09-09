import java.util.Scanner;


public class PRA2 {

	
	public static void main (String[] args){
		Scanner s=new Scanner(System.in);
		String i=s.nextLine();
		String o=s.nextLine();
		char[] input,output;
		if(i.length()>=o.length()){
			input=i.toCharArray();
			output=o.toCharArray();
		}
		else{
			input=o.toCharArray();
			output=i.toCharArray();
		}
		int li=input.length;
		int lo=output.length;
		int[][] check=new int[lo][li];
		int[] numsMatch=new int[lo];
		for(int x=0;x<lo;x++){
			int num=0;
			for(int y=0;y<li;y++){
				if(input[y]==output[x]){
					check[x][num]=y;
					num++;
				}
					
			}
			numsMatch[x]=num;
		}
		/*
		for(int x=0;x<lo;x++){
			for(int y=0;y<li;y++){
				System.out.print(check[x][y]);
			}
			System.out.print(numsMatch[x]+"\n");
		}
		*/
		int lastSeq=-1;
		int matches=0;
		for(int x=0;x<lo;x++){
			for(int j=0;j<numsMatch[x];j++){
				if(check[x][j]>lastSeq&&li-check[x][j]-1>=lo-1-x){
					matches++;
					lastSeq=check[x][j];
					break;
				}
			}
		}
		
		System.out.println(li-matches);
	}
}
