import java.util.Scanner;
public class PRA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int x = Integer.parseInt(scanner.nextLine());
String[][] inputs = new String[x][2];
//int n;
for (int z = 0; z < x; z++){
//n=0;
//if (n == 0){
inputs[z][0] = scanner.nextLine();	
//n = 1;
inputs[z][1] = scanner.nextLine();	
}
int[] outputs = new int[x];
for(int o = 0; o < x; o++){
	int days = Integer.parseInt(inputs[o][0].substring(0, inputs[o][0].indexOf(" ")));
	inputs[o][0] = inputs[o][0].substring(inputs[o][0].indexOf(" ")+1);
	int assignments = Integer.parseInt(inputs[o][0].substring(0, inputs[o][0].indexOf(" ")));
	inputs[o][0] = inputs[o][0].substring(inputs[o][0].indexOf(" ")+1);
	int total = Integer.parseInt(inputs[o][0]);
	int importance = Integer.parseInt(inputs[o][1].substring(0, inputs[o][1].indexOf(" ")));
	inputs[o][1] = inputs[o][1].substring(inputs[o][1].indexOf(" ")+1);
	int daysEach = Integer.parseInt(inputs[o][1]);
	
	if (assignments*importance < total)
		outputs[o] = -1;
	else{
	double numAss = (double)total/(double)importance;
	if (numAss > (int)numAss)
		numAss = (int)(numAss+1);
	outputs[o] = days - (int)(daysEach*numAss);
	}
}
for (int n = 0; n < x; n++)
{
	System.out.println(outputs[n]);
}
}
}

//days assigmennts total difficulty
//importance days 