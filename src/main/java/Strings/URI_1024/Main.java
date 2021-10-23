package Strings.URI_1024;

import java.io.IOException;
import java.util.Scanner;

//PROBLEM	ANSWER	LANGUAGE	TIME	DATE
//24831207		1024	Encryption	Accepted	Java	0.554	10/9/21, 5:20:59 PM
//MELHOR TEMPO: 0.048

public class Main {
    public static String encrypt(String input) {
        StringBuilder string_builder = new StringBuilder(input);
        for (int j = 0; j < input.length(); j++) {
            if (string_builder.charAt(j) >= 65 && string_builder.charAt(j) <= 122) {
                string_builder.setCharAt(j, (char) (string_builder.charAt(j) + 3));
            }
        }
        StringBuilder string_builder_2 = new StringBuilder(string_builder.reverse().toString());
        for (int i = string_builder.length()-1; i >= string_builder.length()/2; i--) {
            string_builder_2.setCharAt(i, (char) (string_builder.charAt(i) - 1));
        }
        return string_builder_2.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String output = encrypt(input);
            System.out.println(output);
        }
    }
}
