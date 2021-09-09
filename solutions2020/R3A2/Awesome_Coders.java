import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R3A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R3A2 r = new R3A2();
        String t = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String dim = in.nextLine();
            String[] dimArray = dim.split(" ");
            List<String> arr1 = new ArrayList<>();

            for (int j = 0; j < Integer.parseInt(dimArray[0]); j++) {
                String elem = in.nextLine();
                arr1.add(elem);
            }
            String dim2 = in.nextLine();
            String[] dim2Array = dim2.split(" ");

            List<String> arr2 = new ArrayList<>();
            for (int k = 0; k < Integer.parseInt(dim2Array[0]); k++) {
                String elem = in.nextLine();
                arr2.add(elem);
            }
            outputs.add(r.arrContainedInArr(arr1, arr2));
        }
        for (String s : outputs) {
            System.out.println(s);
        }
        in.close();
    }
    public String arrContainedInArr(List<String> arr1, List<String> arr2) {
        int count = 0;
        String s = arr2.get(0);

        for (int i = 0; i < arr1.size(); i++) {
            String str = arr1.get(i);
            for (int j = 0; j < (str.length() - s.length()); j++) {
                if (arr2.contains(str.substring(j, (j + s.length())))) {
                    count++;
                }
            }
            if (count == arr2.size()) {
                return "YES";
            }
        }
        return "NO";
    }
}
