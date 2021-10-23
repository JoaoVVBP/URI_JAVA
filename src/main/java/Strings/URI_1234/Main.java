package Strings.URI_1234;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    //URI1234
    //Um pouco ineficiente

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            char[] output = new char[input.length()];

            int last = '\0';

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    output[i] = input.charAt(i);
                } else if (last == '\0' && input.charAt(i) != ' ') {
                    output[i] = input.toUpperCase().charAt(i);
                    last = output[i];
                } else if (last <= 90 && last >= 65 && input.charAt(i) <= 90 && input.charAt(i) >= 65) {
                    char c = input.charAt(i);
                    int buffer = c + 32;
                    output[i] = (char) buffer;
                    last = output[i];
                } else if (last <= 122 && last >= 97 && input.charAt(i) <= 122 && input.charAt(i) >= 97) {
                    char c = input.charAt(i);
                    int buffer = c - 32;
                    output[i] = (char) buffer;
                    last = output[i];
                } else {
                    output[i] = input.charAt(i);
                    last = output[i];
                }
            }
            System.out.println(new String(output));
        }
    }

}
