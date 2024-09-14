public class Primes {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            if (isPrime(n)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // n делится без остатка на i
                return false;
            }
        }
        return true;
    }    
}