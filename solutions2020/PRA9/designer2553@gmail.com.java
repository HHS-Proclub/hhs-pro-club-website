import java.util.Scanner;

public class PRA9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		in.nextLine();
		int[] results = new int[times];
		
		for (int i = 0; i < results.length; i++) {
			String hitNotes = in.nextLine();
			String[] hitNotesArr = hitNotes.split(" ");
			int[] notes = new int[hitNotesArr.length];
			
			for (int j = 0; j < hitNotesArr.length; j++) {
				String note = hitNotesArr[j];
				notes[j] = Integer.parseInt(note);
			}
			
			int[] notesCount = new int[7];
			
			for (int note : notes) {
				
				while (note > 7) note -= 7;
				while (note < 1) note += 7;
				
				for (int j = 1; j <= 7; j++) {
					if (note == j) {
						notesCount[j-1]++;
						break;
					}
				}
			}
			
			for (int noteCount : notesCount) {
				if (noteCount != 0) {
					results[i]++;
				}
			}
		}
		
		for (int s : results)
			System.out.println(s);
	}

}
