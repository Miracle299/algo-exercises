package algo;

public class BinPow {

    public long binPow(long n, long k) {
        long result = 0;
        if (n == 0) {
            return 0;
        }
        if (k % 2 == 1) {
            return binPow(n, k - 1) * n;
        } else {
            result = binPow(n, k / 2);
            return result * result;
        }
    }
}
