package org.aleksandr.berezovyi.task1;

/**
 * Created by pepsik on 7/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        int x = 4, y = 1;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " " + y);
    }
}
