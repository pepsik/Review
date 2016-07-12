package org.aleksandr.berezovyi.task5;

/**
 * Created by pepsik on 7/12/2016.
 */
public class Main {
    public int allDays = 0;
    private int weekday = 0;

    public void setNYday(int weekday) {
        this.weekday = weekday; // на листе другое название, но смысл чтобы запомнить с какого дня недели начинается год
    }

    public void setMonth(int month) {
        for (int i = 1; i < month; i++) {
            if (i == 2)
                allDays += 28;
            else if (i % 2 == 0)
                allDays += 30;
            else
                allDays += 31;
        }
    }

    public void setDay(int day) {
        allDays += day;
    }

    public int getWeekday() { // этот метод я не успел написать
        if ((allDays + 3) % 7 == 0)
            return 1;
        else
            return (allDays + 3) % 7;
    }

    public static void main(String[] args) {
        org.aleksandr.berezovyi.task5.Main task = new Main();
        task.setNYday(5);
        task.setMonth(7);
        task.setDay(12);
        System.out.println(task.getWeekday());
    }
}
