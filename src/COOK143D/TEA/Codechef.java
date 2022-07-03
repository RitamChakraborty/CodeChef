package COOK143D.TEA;

import java.io.*;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            long x = S.nextLong();
            long y = S.nextLong();
            long z = S.nextLong();
            long result;

            if (x <= y) {
                result = z;
            } else {
                result = (x / y) * z;
                if (x % y != 0) result += z;
            }

            P.println(result);
        }

        S.close();
        P.flush();
        P.close();
    }
}