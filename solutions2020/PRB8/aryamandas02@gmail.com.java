import java.util.*;

public class PRB8 {

    static final class CubeFace implements Comparable<CubeFace> {
        private final int faceId;
        private final Set<Integer> cubeset;

        public CubeFace(int faceId, Set<Integer> cubeset) {
            this.faceId = faceId;
            this.cubeset = cubeset;
        }

        @Override
        public int compareTo(CubeFace o) {
            return Integer.compare(this.cubeset.size(), o.cubeset.size());
        }
    }

    public static void main2(String[] args) {
        PRB8 driver = new PRB8();
        int numCubes = 3;
        driver.addCube(0, "0 1 2 3 4 5");
        driver.addCube(1, "6 7 8 9 0 1");
        driver.addCube(2, "2 3 4 5 6 7");

        for (int i = 1; i < 100; i++) {
            if (driver.isPossible(i)) {
                System.out.println("possible: " + i);
            } else {
                System.out.println("not possible: " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        final int cases = in.nextInt();
        in.nextLine();

        final List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < cases; i++) {

            String s = in.nextLine().trim();
            int numCubes = Integer.parseInt(s);

            PRB8 driver = new PRB8();
            for (int cubeIndex = 0; cubeIndex < numCubes; cubeIndex++) {
                String faces = in.nextLine().trim();
                driver.addCube(cubeIndex, faces);
            }

            int nextNumber = 1;
            while (true) {
                if (!driver.isPossible(nextNumber)) {
                    outputs.add(nextNumber-1);
                    break;
                }
                nextNumber++;
            }
        }

        for (final int j : outputs) {
            System.out.println(j);
        }

        in.close();
    }

    private void addCube(int cubeIndex, String faceList) {
        String[] faces = faceList.trim().split(" ");
        cubes.put(cubeIndex, new HashSet<>());
        for (String face : faces) {
            cubes.get(cubeIndex).add(Integer.valueOf(face));
        }
    }
    private final Map<Integer, Set<Integer>> cubes = new HashMap<>();

    private boolean isPossible(int val) {

        List<Integer> digits = toDigits(val);
        Map<Integer, Set<Integer>> map = createMap();


        PriorityQueue<CubeFace> queue = createQueue(map);

        while (!queue.isEmpty()) {
            CubeFace cf = queue.remove();
            if (digits.contains(cf.faceId)) {
                digits.remove(new Integer(cf.faceId));
                if (digits.isEmpty()) {
                    return true;
                }

                int cubeIndex = cf.cubeset.iterator().next();

                for (Set<Integer> set : map.values()) {
                    if (set.contains(cubeIndex)) {
                        set.remove(cubeIndex);
                    }
                }

                queue = createQueue(map);
            }
        }

        return false;
    }

    private PriorityQueue<CubeFace> createQueue(final Map<Integer, Set<Integer>> map) {
        PriorityQueue<CubeFace> queue = new PriorityQueue<>();

        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                CubeFace cf = new CubeFace(entry.getKey(), entry.getValue());
                queue.add(cf);
            }
        }
        return queue;
    }

    private Map<Integer, Set<Integer>> createMap() {
        final Map<Integer, Set<Integer>> map = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> entry : cubes.entrySet()) {
            for (int x : entry.getValue()) {
                Set<Integer> set = map.get(x);
                if (set == null) {
                    set = new HashSet<>();
                    map.put(x, set);
                }
                set.add(entry.getKey());
            }
        }
        return map;
    }

    private List<Integer> toDigits(int val) {
        List<Integer> digits = new ArrayList<>();

        while (val > 0) {
            int rem = val % 10;
            digits.add(rem);
            val = val / 10;
        }

        return digits;
    }
}
