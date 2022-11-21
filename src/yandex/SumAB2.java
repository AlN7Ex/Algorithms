package yandex;

import java.io.*;
import java.util.Scanner;

public class SumAB2 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("input.txt");
        FileWriter out = new FileWriter("output.txt");
        Scanner scanner = new Scanner(in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String s = Integer.toString(a + b);

        out.write(s);

        in.close();
        out.close();
    }
}
