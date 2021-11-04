import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class PRA3 {
    public static void main(String[] args) throws Exception {
        InputReader2 ir = new InputReader2();
        PrintWriter pw = new PrintWriter(System.out);

        int T = ir.nextInt();
        while (T-- > 0) {
            int n = ir.nextInt();
            int k = ir.nextInt();

            long[][] songs = new long[n][2];
            for (int i = 0; i < n; i++) {
                songs[i][1] = ir.nextLong();
                songs[i][0] = ir.nextLong();
            }

            if (k == 1) {
                long maxLen = 0;
                for (int i = 0; i < n; i++) {
                    maxLen = Math.max(maxLen, songs[i][0] * songs[i][1]);
                }
                pw.println(maxLen);
            } else {
                Arrays.sort(songs, Comparator.comparingLong(o -> o[0]));

                long ans = songs[n - 1][0] * songs[n - 1][1];
                long[] maxLen = new long[k];
                int K = k - 1;
                int end = n - k - 1;
                for (int i = n - 1; i > end; i--) {
                    ans = Math.max(ans, songs[i][0] * (maxLen[K] + songs[i][1]));
                    for (int j = K; j > 1; --j) {
                        if (maxLen[j - 1] == -1) {
                            continue;
                        }
                        maxLen[j] = Math.max(maxLen[j], maxLen[j - 1] + songs[i][1]);
                    }
                    maxLen[1] = Math.max(maxLen[1], songs[i][1]);
                }
                for (int i = end; i >= 0; --i) {
                    ans = Math.max(ans, songs[i][0] * (maxLen[K] + songs[i][1]));
                    for (int j = K; j > 1; --j) {
                        maxLen[j] = Math.max(maxLen[j], maxLen[j - 1] + songs[i][1]);
                    }
                    maxLen[1] = Math.max(maxLen[1], songs[i][1]);
                }

                pw.println(ans);
            }
        }

        pw.close();
    }

    private static class InputReader2 {
        private final int BUFFER_SIZE = 1 << 12;
        private final DataInputStream dis;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;

        public InputReader2() {
            dis = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        private int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        private long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = dis.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
    }
}
