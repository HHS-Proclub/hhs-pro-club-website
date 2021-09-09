import java.util.*;

public class PRA7 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        final int cases = in.nextInt();
        in.nextLine();

        final List<Integer> outputs = new ArrayList<>();

        for (int i = 0; i < cases; i++) {

            String s = in.nextLine();
            s.trim();

            String[] arr = s.split(" ");
            int c = Integer.parseInt(arr[0]);
            int n = Integer.parseInt(arr[1]);

            s = in.nextLine().trim();
            arr = s.split(" ");

            int[] kidBribes = new int[c];
            int idx = 0;
            for (String str : arr) {
                kidBribes[idx++] = Integer.parseInt(str);
            }

            PRA7 pra = new PRA7();
            pra.kidBribe = kidBribes;

            for (int k = 1; k <= kidBribes.length; k++) {
                pra.kidsWithNoRelation.add(k);
            }

            for (int index = 0; index < n; index++) {
                String rel = in.nextLine().trim();
                String[] relarr = rel.split(" ");
                int kid1 = Integer.parseInt(relarr[0]);
                int kid2 = Integer.parseInt(relarr[1]);

                pra.processRelationShip(kid1, kid2);
            }

            int totalBribe = pra.computeBribe();
            outputs.add(totalBribe);
        }

        for (final int j : outputs) {
            System.out.println(j);
        }

        in.close();
    }

    private static final class Bucket {
        private int minBribe = Integer.MAX_VALUE;
        private final Set<Integer> kids = new HashSet<>();

        public void addKid(int kidIndex, int bribe) {
            kids.add(kidIndex);
            if (bribe < minBribe) {
                minBribe = bribe;
            }
        }

        public boolean isKidPresent(int kidIndex) {
            return kids.contains(kidIndex);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            Bucket bucket = (Bucket) o;

            if (minBribe != bucket.minBribe)
                return false;
            return kids != null ? kids.equals(bucket.kids) : bucket.kids == null;
        }

        @Override
        public int hashCode() {
            int result = minBribe;
            result = 31 * result + (kids != null ? kids.hashCode() : 0);
            return result;
        }
    }

    private final Set<Bucket> buckets = new HashSet<>();

    private void mergeBuckets(Bucket b1, Bucket b2) {
        b1.minBribe = Math.min(b1.minBribe, b2.minBribe);
        b1.kids.addAll(b2.kids);
        buckets.remove(b2);
    }

    private int[] kidBribe;
    private final Set<Integer> kidsWithNoRelation = new HashSet<>();

    private void processRelationShip(int kid1, int kid2) {

        kidsWithNoRelation.remove(kid1);
        kidsWithNoRelation.remove(kid2);
        int kid1Bribe = kidBribe[kid1-1];
        int kid2Bribe = kidBribe[kid2-1];

        Bucket b1 = null;
        Bucket b2 = null;

        for (Bucket b : buckets) {
            if (b.isKidPresent(kid1)) {
                b1 = b;
            }

            if (b.isKidPresent(kid2)) {
                b2 = b;
            }

            if (b1 != null & b2 != null) {
                break;
            }
        }

        if (b1 == null && b2 == null) {
            Bucket b = new Bucket();
            b.addKid(kid1, kid1Bribe);
            b.addKid(kid2, kid2Bribe);
            buckets.add(b);
            return;
        }

        if (b1 != null && b2 == null) {
            b1.addKid(kid2, kid2Bribe);
        } else if (b2 != null && b1 == null) {
            b2.addKid(kid1, kid1Bribe);
        } else if (b1 == b2) {
            // do nothing
        } else {
            mergeBuckets(b1, b2);
        }
    }

    private int computeBribe() {
        int totalBribe = 0;

        for (Bucket b : buckets) {
            totalBribe += b.minBribe;
        }

        for (int kid : kidsWithNoRelation) {
            totalBribe += kidBribe[kid-1];
        }

        return totalBribe;
    }
}
