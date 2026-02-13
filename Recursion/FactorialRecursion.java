package Recursion;

class FactorialRecursion {

    // recursive method
    static int factorial(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

        System.gc();
    }

//     factorial(5)
// → 5 * factorial(4)
// → 5 * (4 * factorial(3))
// → 5 * (4 * (3 * factorial(2)))
// → 5 * (4 * (3 * (2 * factorial(1))))
// → 5 * 4 * 3 * 2 * 1
// → 120

}
