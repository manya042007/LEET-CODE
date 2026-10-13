class Solution {
    public int commonFactors(int a, int b) {

        // Find GCD using Euclid's Algorithm
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        // a is now the GCD
        int count = 0;

        // Count factors of GCD
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        return count;
    }
}