public class PrimeCheck {

    public static void main(String[] args) {
        int number = 29; // Example number to check

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     * Checks if a given integer is a prime number.
     *
     * @param n The integer to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        // Handle edge cases: 0, 1, and negative numbers are not prime
        if (n <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        // No other even number is prime
        if (n % 2 == 0) {
            return false;
        }

        // Check for divisibility by odd numbers up to the square root of n
        // If a number has a divisor greater than its square root, it must also have a divisor smaller than its square root.
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors are found, it's prime
    }
}
