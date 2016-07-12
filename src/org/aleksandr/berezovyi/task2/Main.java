package org.aleksandr.berezovyi.task2;

/**
 * Created by pepsik on 7/12/2016.
 */
public class Main {

    public int getFloor(int apartment) {
        // на листке упоминается проверка на кратность 36, если это последний этаж
        // требуется дополнительное условие
        if (apartment % 36 == 0)   //нет на листе
            return 9;               //нет на листе
        return apartment % 36 / 4 + 1;
    }

    //подьезд
    public int getEntrance(int apartment) {
        // на листке упоминается проверка на кратность 36, если это последний этаж
        // посему нужно добавить дополнительное условие
        if (apartment % 36 == 0)  //нет на листе
            return apartment / 36;//нет на листе
        return apartment / 36 + 1;
    }

    public void print(int apartament) {
        System.out.println("Этаж - " + getFloor(apartament));
        System.out.println("Подьезд - " + getEntrance(apartament));
    }

    public static void main(String[] args) {
        System.out.println("Введите этаж ");
        new Main().print(37);
    }
}
