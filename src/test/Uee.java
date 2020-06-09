package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Uee {
    public static void main(String[] args) {
        ArrayList<String> cats =  new ArrayList<>();
        System.out.println(cats.size());
        cats.add("test1");
        System.out.println(cats.size());
        cats.add(0,"test2");
        System.out.println(cats.size());
        System.out.println(cats);



        for (String  s : cats) {
            System.out.println(s);
        }
        ArrayList<String> temp =  new ArrayList<>();
        temp.add("temp1");
        temp.add("temp2");
        cats.addAll(temp); // добавление в конец списка
        System.out.println(cats);

        cats.addAll(0,temp); // добавление в на удазанный индекс, отстальные сдвигает вправую сторону.
        System.out.println(cats);

        System.out.println(cats.size());

        ArrayList<String> dogs = new ArrayList<>();
        dogs.ensureCapacity(3);
        System.out.println("dog size = " + dogs.size());

        ArrayList<String> snake = new ArrayList<>(3);
        System.out.println("snake size = " + snake.size());

        String [] guses = new String[3];
        System.out.println("guses size = " + guses.length);

        temp.trimToSize();
        System.out.println(cats.get(3));
        cats.set(3,"myaw");
        System.out.println(cats.get(3));
        cats.remove(3);
        System.out.println(cats.get(3));

        cats.remove("test1");
        System.out.println(cats);

        ArrayList<Integer> test = new ArrayList<>();
        }

    }


