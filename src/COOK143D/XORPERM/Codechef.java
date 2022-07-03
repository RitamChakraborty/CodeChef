package COOK143D.XORPERM;

import java.io.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            int n = S.nextInt();

            if (n == 3) P.println("-1");
            else if (n == 4) P.println("1 2 4 3");
            else {
                StringJoiner stringJoiner = new StringJoiner(" ", "", " ");

                for (int i = n; i >= 5; --i) {
                    stringJoiner.add(String.valueOf(i));
                }
                stringJoiner.add("1 2 4 3");
                P.println(stringJoiner);
            }
        }

        S.close();
        P.flush();
        P.close();
    }
}
