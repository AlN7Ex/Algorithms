package yandex;

import java.util.Scanner;

public class SumAB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        String s = scanner.nextLine();
        String[] s1 = s.split(" ");

        if (s1.length == 2) {
            a = Integer.parseInt(s1[0]);
            b = Integer.parseInt(s1[1]);
        }
        System.out.println(a + b);
    }
}

