import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] mtx = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mtx[i][j] = 0;
            }
        }

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            mtx[k1 - 1][k2 - 1] = 1;
        }

        int xLeft, xRight, yUp, yDown;
        for (int i = 0; i < x; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < y; j++) {
                if (mtx[i][j] == 1) {
                    stringBuilder.append("m ");
                } else {
                    if (i == 0) {
                        xLeft = 0;
                    } else xLeft = i - 1;
                    if (i + 1 >= x) {
                        xRight = i;
                    } else xRight = i + 1;
                    if (j == 0) {
                        yUp = 0;
                    } else yUp = j - 1;
                    if (j + 1 >= y) {
                        yDown = j;
                    } else yDown = j + 1;
                    int kNeighbor = 0;
                    for (int l = xLeft; l <= xRight; l++) {
                        for (int m = yUp; m <= yDown; m++) {
                            if (!(l == i && m == j) && mtx[l][m] == 1) {
                                kNeighbor++;
                            }
                        }
                    }
                    stringBuilder.append(kNeighbor + " ");
                }
            }
            System.out.println(stringBuilder.toString().trim());
        }
    }
}











