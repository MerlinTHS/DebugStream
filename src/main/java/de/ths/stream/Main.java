package de.ths.stream;

import java.util.Arrays;
import static java.lang.System.out;

public class Main {
    public static void main(final String... args) {
        final int result = Arrays.stream(args)
                .mapToInt(Integer::parseInt)
                .limit(15)
                .peek( (number) -> out.println("Adding: " + number))
                .sum();

        out.println("-".repeat(100));
        out.printf("Result is: %d\n", result);
    }
}
