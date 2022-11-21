package yandex;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RocsAndJewerly {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("input.txt");
        FileWriter output = new FileWriter("output.txt");

        Scanner scanner = new Scanner(input);

        String J = scanner.nextLine();
        String S = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (J.indexOf(ch) >= 0) {
                ++count;
            }
        }

        output.write(Integer.toString(count));

        input.close();
        output.close();

        System.out.println(count);
    }
}
