package hackerrank;

public class BeautifulBinaryString {
    public static int beautifulBinaryString(String b) {
        StringBuilder sb = new StringBuilder(b);
        int counter = 0;
        if (!b.contains("010")) {
            return 0;
        }
        while (sb.toString().contains("010")) {
            int index = sb.indexOf("010");
            sb.setCharAt(index + 2, '1');
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        beautifulBinaryString("0101010");
    }
}
