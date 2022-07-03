package COOK143D.KMEX;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            int n = S.nextInt();
            int m = S.nextInt();
            int k = S.nextInt();
            int[] arr = new int[n];
            boolean result = false;
            int kCount = 0;

            for (int i = 0; i < n; ++i) {
                int num = S.nextInt();
                arr[i] = num;
                if (num == k) ++kCount;
            }

            Arrays.sort(arr);

            if (n - kCount >= m) {
                result = true;
                for (int i = 0; i < k; ++i) {
                    boolean flag = false;

                    for (int j : arr) {
                        if (i == j) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag) {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    if (m < k) result = false;
                    else result = m <= n - kCount;
                }

            }

            P.println(result ? "YES" : "NO");
        }

        S.close();
        P.flush();
        P.close();
    }
}