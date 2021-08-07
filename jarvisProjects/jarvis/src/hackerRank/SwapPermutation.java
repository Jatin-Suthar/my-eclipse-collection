package hackerRank;

import java.io.*;
import java.util.Arrays;

public class SwapPermutation {

    final static long mod = 1000000007;

    public static void solve(Input in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        if (n == 1) {
            if (k < 1) {
                throw new AssertionError();
            }
            out.println("0 1");
            return;
        }
        long[] d = new long[k + 1];
        d[0] = 1;
        for (int it = 0; it < n; ++it) {
            long[] dd = new long[k + 1];
            long sum = 0;
            for (int i = 0; i <= k; ++i) {
                sum = (sum + d[i]) % mod;
                dd[i] = sum;
                if (i >= it) {
                    sum = (sum + mod - d[i - it]) % mod;
                }
            }
            d = dd;
        }
//        System.err.println(Arrays.toString(d));
        long ans1 = 0;
        for (int i = 0; i <= k; ++i) {
            if (i % 2 == k % 2) {
                ans1 = (ans1 + d[i]) % mod;
            }
        }
        long[] d1 = new long[n + 1];
        d1[0] = 1;
        for (int it = 0; it < n; ++it) {
            for (int i = n; i >= 1; --i) {
                d1[i] = (d1[i] * it + d1[i - 1]) % mod;
            }
            d1[0] = 0;
        }
//        System.err.println(Arrays.toString(d1));
        long ans2 = 0;
        for (int i = 1; i <= n; ++i) {
            if (n - i <= k) {
                ans2 = (ans2 + d1[i]) % mod;
            }
        }
        out.println(ans1 + " " + ans2);
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        solve(new Input(new BufferedReader(new InputStreamReader(System.in))), out);
        out.close();
    }

    static class Input {
        BufferedReader in;
        StringBuilder sb = new StringBuilder();

        public Input(BufferedReader in) {
            this.in = in;
        }

        public Input(String s) {
            this.in = new BufferedReader(new StringReader(s));
        }

        public String next() throws IOException {
            sb.setLength(0);
            while (true) {
                int c = in.read();
                if (c == -1) {
                    return null;
                }
                if (" \n\r\t".indexOf(c) == -1) {
                    sb.append((char)c);
                    break;
                }
            }
            while (true) {
                int c = in.read();
                if (c == -1 || " \n\r\t".indexOf(c) != -1) {
                    break;
                }
                sb.append((char)c);
            }
            return sb.toString();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}




