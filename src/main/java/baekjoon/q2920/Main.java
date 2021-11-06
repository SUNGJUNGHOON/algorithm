package baekjoon.q2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scale = new int[8];
        String a = "";

        for (int i = 0; i < scale.length; i++) {
            scale[i] = scanner.nextInt();
        }

        for (int i = 0; i < scale.length - 1; i++) {
            if (scale[i + 1] == scale[i] + 1) {
                a = "ascending";
            }

            else if (scale[i + 1] == scale[i] - 1) {
                a = "descending";
            }

            else {
                a = "mixed";
                break;
            }
        }
        System.out.println(a);
    }
}
