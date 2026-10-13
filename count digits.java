class Solution {

    public int countDigits(int num) {

        // Keep a copy for extracting digits.
        int remainingNumber = num;

        // Stores how many digits evenly divide the original number.
        int divisibleDigitCount = 0;

        while (remainingNumber > 0) {

            // Extract the last digit.
            int currentDigit = remainingNumber % 10;

            // Check whether the current digit divides
            // the original number without a remainder.
            if (num % currentDigit == 0)
                divisibleDigitCount++;

            // Remove the last digit.
            remainingNumber /= 10;
        }

        return divisibleDigitCount;
    }
}