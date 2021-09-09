import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PRB4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(x); i++) {
            String str = in.nextLine();
            int n = Integer.parseInt(in.nextLine());
            List<String> mouses = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String mouse = in.nextLine();
                mouses.add(mouse);
            }
            outputs.add(mouses(str, mouses));
        }
        for (String o : outputs) {
            System.out.println(o);
        }
        in.close();
    }

    static enum MouseType {
        A, B
    }

    static class Mouse implements Comparable<Mouse> {
        @Override
        public String toString() {
            return "Mouse [cost=" + cost + ", type=" + type + "]";
        }

        public Mouse(int cost, MouseType type) {
            super();
            this.cost = cost;
            this.type = type;
        }

        public long cost;
        public MouseType type;

        @Override
        public int compareTo(Mouse o) {
            return Long.compare(this.cost, o.cost);
        }
    }

    public static String mouses(String str, List<String> mouses) {
        String[] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int ab = Integer.parseInt(arr[2]);

        int totalComputers = a + b + ab;

        PriorityQueue<Mouse> port = new PriorityQueue<>();

        for (String mouse : mouses) {
            String[] mouseArr = mouse.split(" ");
            int portNum = Integer.parseInt(mouseArr[1]);
            int mouseVal = Integer.parseInt(mouseArr[0]);
            port.add(new Mouse(mouseVal, (portNum == 0) ? MouseType.A : MouseType.B));
        }
        long price = 0;

        int computersAServed = 0;
        int computersBServed = 0;
        int computersABServed = 0;

        while (port.size() > 0 && (computersAServed + computersBServed + computersABServed < totalComputers)) {
            Mouse m = port.remove();
            if (m.type == MouseType.A) {
                if (computersAServed < a) {
                    computersAServed++;
                } else if (computersABServed < ab) {
                    computersABServed++;
                } else {
                    continue;
                }
            } else {
                if (computersBServed < b) {
                    computersBServed++;
                } else if (computersABServed < ab) {
                    computersABServed++;
                } else {
                    continue;
                }
            }
            price += m.cost;
        }

        int size = computersAServed + computersBServed + computersABServed;

        return String.format("%d %s", size, String.valueOf(price));
    }
}
