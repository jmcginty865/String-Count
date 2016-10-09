package mcginty.jennifer.stringCount;

import java.util.Scanner;

/**
 * Created by nosec on 9/30/2016.
 */
public class Sentence {
    Scanner scanner = new Scanner(System.in);

    public String countMe = scanner.nextLine();

    String[] inputArray = new String[countMe.length()];

    public int charCount() {
        int i = 0;
        while (i < countMe.length()) {
            inputArray[i] = countMe.valueOf(countMe.charAt(i));
            i++;
        }

        return i;
    }

}