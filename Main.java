import java.io.Console;
// needed for input and stuff. cool

public class Main {
    public static void main(String[] args) {
        // The Things You Need(tm)

        Console console = System.console();
        // console? console. console!
        // i'm sorry i really don't know what this actually does
        // really hope i don't need to at some point (that would be bad)

        String input_string = console.readLine("Enter number: ");
        // input!!! this is the first and last time console is used

        int hailstone = Integer.parseInt(input_string);
        // so just don't input anything that isn't an integer please thanks
        // (everything breaks if you do)

        int i = 0;
        // reset the index

        System.out.println(hailstone);
        // print the hailstone to start entirely for the sake of making it look like the desired output

        do {
            /*checking if it's even, if it's remainder is 0 then it's even 
            (if it's not then you do the else) (if it's anything else. oh no) */
            if (hailstone % 2 == 0) {
                hailstone /= 2;
                // "If even, divide by two"

            } else { // "If odd..."
                hailstone *= 3; 
                hailstone += 1;
                // "...multiply by three and add one"
            }

            System.out.println(hailstone);
            // print it down here so it prints the final output which really should be "1" all of the time
            // and if it's not. what

            i++;
            // bump up the index. because that's how it works! wow

        } while (hailstone != 1);
        // while it's not done making it one

        System.out.println("It took " + i + " steps to complete.");
        // yes i copied the wording exactly

    }
}
