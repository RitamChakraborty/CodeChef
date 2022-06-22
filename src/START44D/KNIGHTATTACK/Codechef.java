package START44D.KNIGHTATTACK;

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter P = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = S.nextInt();

        while (T-- > 0) {
            int x1 = S.nextInt();
            int y1 = S.nextInt();
            int x2 = S.nextInt();
            int y2 = S.nextInt();

            if (x1 == x2) {
                if (Math.abs(y2 - y1) == 2 || Math.abs(y2 - y1) == 4) {
                    P.println("YES");
                } else {
                    P.println("NO");
                }
            } else if (y1 == y2) {
                if (Math.abs(x2 - x1) == 2 || Math.abs(x2 - x1) == 4) {
                    P.println("YES");
                } else {
                    P.println("NO");
                }
            } else {
                List<Point> points1 = Arrays.asList(
                        new Point(x1 + 2, y1 + 1),
                        new Point(x1 - 2, y1 + 1),
                        new Point(x1 - 2, y1 - 1),
                        new Point(x1 + 2, y1 - 1),
                        new Point(x1 - 1, y1 + 2),
                        new Point(x1 - 1, y1 - 2),
                        new Point(x1 + 1, y1 - 2),
                        new Point(x1 + 1, y1 + 2)
                );
                List<Point> points2 = Arrays.asList(
                        new Point(x2 + 2, y2 + 1),
                        new Point(x2 - 2, y2 + 1),
                        new Point(x2 - 2, y2 - 1),
                        new Point(x2 + 2, y2 - 1),
                        new Point(x2 - 1, y2 + 2),
                        new Point(x2 - 1, y2 - 2),
                        new Point(x2 + 1, y2 - 2),
                        new Point(x2 + 1, y2 + 2)
                );
                boolean flag = false;

                for (Point i : points1) {
                    for (Point j : points2) {
                        if (i.equals(j) &&
                                i.x <= 8 &&
                                i.x >= 1 &&
                                i.y <= 8 &&
                                i.y >= 1 &&
                                j.x <= 8 &&
                                j.x >= 1 &&
                                j.y <= 8 &&
                                j.y >= 1
                        ) {
                            flag = true;
                            break;
                        }
                    }
                }

                if (flag) {
                    P.println("YES");
                } else {
                    P.println("NO");
                }
            }
        }

        S.close();
        P.flush();
        P.close();
    }
}