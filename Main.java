import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        String input_string = console.readLine("Enter number: ");

        int hailstone = Integer.parseInt(input_string);
        int i = 0;
        do {
            System.out.println(hailstone);
            if (hailstone % 2 == 0) {
                hailstone /= 2;
            } else {
                hailstone *= 3;
                hailstone += 1;
            }
            i++;
        } while (hailstone != 1);
        System.out.println("It took " + i + " steps to complete.");
    }
}