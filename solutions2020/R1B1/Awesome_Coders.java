import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class R1B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R1B1 r = new R1B1();
        String sentence = in.nextLine();
        r.modifyString(sentence);
        in.close();
    }
    public void modifyString(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return;
        }
        String[] sentenceArray = sentence.split(" ");
        List<String> sentenceList = new ArrayList<>();
        Map<String, Integer> sentenceMap = new HashMap<>();

        for (String s : sentenceArray) {
            sentenceList.add(s);
        }
        for (int i = 0; i < sentenceList.size(); i++) {
            if (!sentenceMap.containsKey(sentenceList.get(i))) {
                sentenceMap.put(sentenceList.get(i), 1);

            } else {
                int repeatCount = sentenceMap.get(sentenceList.get(i));
                repeatCount++;
                sentenceMap.put(sentenceList.get(i), repeatCount);
                sentenceList.remove(i);
            }
        }
        for (String s : sentenceList) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
