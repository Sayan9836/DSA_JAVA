public class P7 {
  public static void main(String[] args) {
    int n = 36;
    if (SUMofFactors(n) == n) {
      System.out.println("It's a Perfect Number");
    } else {
      System.out.println("It is not a Perfect Number");
    }
  }

  static int SUMofFactors(int n) {
    int ans = 0;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        if (n / i == i) {
          ans += i;
        } else {
          ans += i + n / i;
        }
      }
    }
    return ans + 1;
  }
}
