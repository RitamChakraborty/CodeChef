package START44D.JOGGING;

import java.io.*;
import java.util.Scanner;

public class Codechef {
    private static long power(long x) {
        long res;
        long mod = 1000000007L;

        if (x == 0) res = 1;
        else if (x == 1) res = 2;
        else {
            res = power(x / 2);
            if (x % 2 == 0)
                res = (res * res) % mod;
            else
                res = (((res * res) % mod) * 2) % mod;
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            int n = S.nextInt() - 1;
            long x = S.nextInt();
            P.println((x * power(n)) % 1000000007L);
        }

        S.close();
        P.flush();
        P.close();
    }
}
