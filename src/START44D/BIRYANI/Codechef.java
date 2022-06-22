package START44D.BIRYANI;

import java.io.*;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            P.println(S.nextInt() * S.nextInt());
        }

        S.close();
        P.flush();
        P.close();
    }
}
