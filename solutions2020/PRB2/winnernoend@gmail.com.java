import java.util.Scanner;

public class PRB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int reps = Integer.parseInt(in.nextLine());
        for (int sofar = 0; sofar < reps; sofar++) {
            String raw = in.nextLine();
            String[] rawSplit = raw.split(" ");
            int r = Integer.parseInt(rawSplit[0]);
            int c = Integer.parseInt(rawSplit[1]);
            int n = Integer.parseInt(rawSplit[2]);
            int k = Integer.parseInt(rawSplit[3]);

            int[] x = new int[n];
            int[] y = new int[n];

            for (int i2 = 0; i2 < n; i2++) {
                raw = in.nextLine();
                rawSplit = raw.split(" ");
                x[i2] = Integer.parseInt(rawSplit[0]);
                y[i2] = Integer.parseInt(rawSplit[1]);
            }

            //We have our data

            /*
                Our plan is to increase the size of a "picture rectangle", in both dimensions, and check if it is has
                the right number of students inside.
             */

            int successes = 0;

            for (int width = 1; width <= r; width++) {
                for (int height = 1; height <= c; height++) {
                    //Rectangle created
                    for (int shiftx = 0; shiftx <= r - width; shiftx++) {
                        for (int shifty = 0; shifty <= c - height; shifty++) {
                            //Rectangle shifted
                            int students = 0;
                            for (int i = shiftx + 1; i <= width + shiftx; i++) {
                                for (int j = shifty + 1; j <= height + shifty; j++) {
                                    for (int a = 0; a < n; a++) {
                                        if (x[a] == i && y[a] == j) {
                                            students++;
                                        }
                                    }
                                }
                            }
                            if (students == k) {
                                successes++;
                                //System.out.println("SIZE: " + width + " " + height + " " + "SHIFT: " + shiftx + ", " + shifty);
                            }
                        }
                    }

                }
            }
            System.out.println(successes);
        }
    }
}
