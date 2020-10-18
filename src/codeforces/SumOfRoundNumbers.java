package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void sumOfRoundNumbers(int number) {
        List<Integer> list = new ArrayList<>();
        if (number < 0) {
            System.out.println(-1);
            return;
        }
        int factor = 1;
        int counter = 0;
        while (true) {
            int val = number % 10;
            number = number / 10;
            if (val != 0) {
                counter++;
                list.add(val * factor);
                factor *= 10;
                continue;
            }
            factor *= 10;
            if (number == 0) {
                break;
            }
        }
        System.out.println(counter);
        for (Integer val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            int val = scanner.nextInt();
            sumOfRoundNumbers(val);
        }
    }
}