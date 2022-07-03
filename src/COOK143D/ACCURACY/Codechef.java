package COOK143D.ACCURACY;

import java.io.*;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            int a = S.nextInt();
            if (a % 3 == 0) {
                P.println("0");
            } else {
                P.println(3 - a % 3);
            }
        }

        S.close();
        P.flush();
        P.close();
    }
}
