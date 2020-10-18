package hackerrank;

import java.util.Arrays;

public class FraudulentActivityNotifications {

    public static int activityNotifications(int[] expenditure, int d) {
        int sum = Arrays.stream(expenditure).limit(d).sum();
        int decreaseElementIndex = 0;
        int notifications = 0;
        int numbersOfSteps = expenditure.length - d;
        double var = 0;
        if (((double) sum / d * 10) % 10 == 5) {
            var = (double) sum / d;
        } else {
            var = sum / d;
        }
        if (expenditure[d] >= 2 * var) {
            notifications++;
        }

        for (int i = d; i < d + numbersOfSteps; i++) {
            sum = sum - expenditure[decreaseElementIndex] + expenditure[d];
            if (((double) sum / d * 10) % 10 == 5) {
                var = (double) sum / d;
            } else {
                var = sum / d;
            }
            if (expenditure[d] >= 2 * var) {
                notifications++;
            }
            decreaseElementIndex++;
        }

        return notifications;
    }

    public static void main(String[] args) {
        System.out.println(activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
        System.out.println(activityNotifications(new int[]{10, 20, 30, 40, 50}, 3));
        System.out.println(activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
    }
}
