package org.aleksandr.berezovyi.task3;

/**
 * Created by pepsik on 7/12/2016.
 */
public class Main {

    int getNOD(int x, int y) {
        int i = 0, max = 1;

        if (x > y)
            i = y;
        else
            i = x;

        for (int j = 1; j < i + 1; j++) {
            if (x % j == 0 && y % j == 0)
                max = j;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Main().getNOD(31, 15));
    }
}
