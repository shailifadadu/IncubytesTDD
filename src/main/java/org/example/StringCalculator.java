package org.example;

public class StringCalculator {

    public int add(String numbers) {
        // Check for null or empty input → return 0
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        // Support comma and newline as delimiters
        // Split the string using comma or newline as delimiter
        String[] parts = numbers.split(",|\n");
        int sum = 0;

        // Loop through each part and add to sum
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }

        return sum;
    }
}

