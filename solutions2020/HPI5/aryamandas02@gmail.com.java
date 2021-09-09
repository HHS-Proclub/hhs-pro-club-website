import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HPI5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> moneyVals = new LinkedHashMap<>();
        String numMembers = in.nextLine();

        for (int i = 0; i < Integer.parseInt(numMembers); i++) {
            String name = in.nextLine();
            moneyVals.put(name, 0);
        }
        for (int j = 0; j < Integer.parseInt(numMembers); j++) {
            String str = in.nextLine();
            String[] strArray = str.split(" ");
            int money = moneyVals.get(strArray[0]);
            money -= Integer.parseInt(strArray[1]);
            moneyVals.put(strArray[0], money);
            if (Integer.parseInt(strArray[2]) != 0) {
                if (Integer.parseInt(strArray[1]) % Integer.parseInt(strArray[2]) != 0) {
                    int m = moneyVals.get(strArray[0]);
                    m += Integer.parseInt(strArray[1]) % Integer.parseInt(strArray[2]);
                    moneyVals.put(strArray[0], m);
                }
                for (int k = 0; k < Integer.parseInt(strArray[2]); k++) {
                    String member = in.nextLine();
                    int amount = moneyVals.get(member);
                    amount += (Integer.parseInt(strArray[1]) / Integer.parseInt(strArray[2]));
                    moneyVals.put(member, amount);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : moneyVals.entrySet()) {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        in.close();
    }
}
