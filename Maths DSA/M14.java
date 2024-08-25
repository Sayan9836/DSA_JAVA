public class M14 {
    // sieve of erathonenis
    public static void main(String[] args) {
        int n = 37;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
    }

    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    primes[j] = true;
                }

            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

}

//O(n*log(log(n)))