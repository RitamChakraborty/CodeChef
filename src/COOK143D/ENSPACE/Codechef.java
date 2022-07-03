package COOK143D.ENSPACE;

import java.io.*;
import java.util.Scanner;


public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            long a = S.nextLong();
            long b = S.nextLong();
            long c = S.nextLong();
            P.println(a >= (b + 2 * c) ? "YES" : "NO");
        }

        S.close();
        P.flush();
        P.close();
    }
}
