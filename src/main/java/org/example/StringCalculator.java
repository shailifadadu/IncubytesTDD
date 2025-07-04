package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0; // Return 0 for empty input
        }

        // Support comma and newline as delimiters
        String[] parts = numbers.split(",|\n");
        int sum = 0;

        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part); // Convert and add
            }
        }

        return sum;
    }
}

