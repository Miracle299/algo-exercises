package hackerrank;

public class TimeConversion {
    private static final int TWELVE_HOURS = 12;

    static String timeConversion(String s) {
        String[] date = s.substring(0, s.length() - 2).split(":");
        if (s.contains("PM") && !date[0].equals("12")) {
            date[0] = String.valueOf(Integer.parseInt(date[0]) + TWELVE_HOURS);
        } else if (s.contains("AM") && date[0].equals("12")) {
            date[0] = "00";
        }
        return String.join(":", date);
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:39AM"));
    }
}
