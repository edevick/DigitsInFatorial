import java.math.BigInteger;

public class Factorial {
    // sumDigitsInFactorial(n) returns the sum of the digits in the number n
    static public int sumDigitsInFactorial(int n) {
        BigInteger fac = calculateFactorial(n);
        int sum = 0;
        String str = fac.toString();
        String[] strAr = str.split("");
        for (String i : strAr) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }

    //calculateFactorial(n) returns factorial of n. The result grows very fast so we need to use the BigInteger type as return value
    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
