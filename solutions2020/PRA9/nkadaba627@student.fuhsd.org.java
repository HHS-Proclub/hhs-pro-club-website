import java.util.Scanner;

public class PRA9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] line = new String[n];
		for(int i = 0;i<n;i++){
			line[i]=scan.nextLine();
		}
		for(int i = 0;i<n;i++){
			System.out.println(split(line[i]));
		}
		
	}
	public static int split(String line){
		String[] inValues = line.split(" ");
		int[] values = new int[inValues.length];
		for (int i = 0; i < inValues.length; i++) {
			values[i] = Integer.parseInt(inValues[i]);
		}
		int note1=0, note2=0, note3=0, note4=0, note5=0, note6=0, note7=0;
		for (int i = 0;i<values.length;i++){
			if(values[i]%7==1){
				if(note1==0)
				note1++;
			}
			else if(values[i]%7==2){
				if(note2==0)
				note2++;
			}
			else if(values[i]%7==3){
				if(note3==0)
				note3++;
			}
			else if(values[i]%7==4){
				if(note4==0)
				note4++;
			}
			else if(values[i]%7==5){
				if(note5==0)
				note5++;
			}
			else if(values[i]%7==6){
				if(note6==0)
				note6++;
			}
			else if(values[i]%7==0){
				if(note7==0)
				note7++;
			}
			
		}
		return note1+note2+note3+note4+note5+note6+note7;	
	}

}
