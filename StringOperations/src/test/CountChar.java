package test;
import java.util.Arrays;
import java.util.Scanner;
public class CountChar  {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(Arrays.toString(input.split(" ")));
        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0);

        int occurrenceCount = countOccurrences(input, targetChar);
        

        System.out.println("The character '" + targetChar + "' occurs " + occurrenceCount + " times.");

        scanner.close();
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}

