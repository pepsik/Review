package org.aleksandr.berezovyi.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepsik on 7/12/2016.
 */
public class Main {
    public List<Integer> list = new ArrayList<>();

    public Main() {
        list.add(0); //нет на листе
        list.add(1);
        list.add(1);
    }

    public int fibb(int N) {
        for (int i = 2; i < N + 1; i++) {
            list.add(list.get(i - 1) + list.get(i));
        }
        return list.get(N);
    }

    public static void main(String[] args) {
        System.out.println(new Main().fibb(10));
    }
}
