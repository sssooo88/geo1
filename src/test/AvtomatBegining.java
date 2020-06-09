package test;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class AvtomatBegining {
    public static void main(String[] args) {

        ArrayList<String> test1 =  new ArrayList();
        test1.add("64");
        test1.add("66");
        test1.add("77");
        test1.add("64");
        test1.add("78");
        test1.add("64");
        test1.add("77");
        test1.add("");
        test1.add("1");


        ArrayList<String> test2 =  new ArrayList();
        test2.add("64");
        test2.add("66");
        test2.add("77");
        test2.add("64");
        test2.add("78");
        test2.add("64");
        test2.add("77");
        test2.add("");
        test2.add("1");


        ArrayList<String> test3 =  new ArrayList();
        test3.add("64");
        test3.add("66");
        test3.add("77");
        test3.add("64");
        test3.add("78");
        test3.add("64");
        test3.add("77");
        test3.add("");
        test3.add("1");

        ArrayList<String> test4 =  new ArrayList();
        test4.add("a");
        test4.add("c");
        test4.add("d");
        test4.add("e");
        test4.add("f");
        test4.add("x");

        ArrayList<String> test5 =  new ArrayList();
        test5.add("64");
        test5.add("66");
        test5.add("77");
        test5.add("64");
        test5.add("78");
        test5.add("64");
        test5.add("77");
        test5.add("");
        test5.add("1");


        System.out.println("Оригинальный массив = " + test1);
        System.out.println("Удалить все сущетвующие значения = " + dete(test2,"64"));
        System.out.println("Равномерный массив = " + order(test5));
        System.out.println("Колво уникальных значений = " + countHighlander(test3));
        System.out.println("Массив после удаления повторений = " + highlander(test1));
        System.out.println("По алфавиту с добавлением = " + abc(test4,"h"));
        System.out.println(highlanderNull());


        //Collections.sort(listStrings) упорядочить лист по порядку
        //Collections.sort(listStrings, Collections.reverseOrder()); упорядочить в обратном порядке

        
        /*ArrayList<String> test2 = new ArrayList<>(test1);

        System.out.println(test1);
        System.out.println(test1.size());

        LinkedHashSet<String> test3 = new LinkedHashSet<>(test1);
        ArrayList<String> test4 = new ArrayList<>(test3);

        System.out.println(test1);
        System.out.println(test3);
        System.out.println(test4);*/ // тесты с преобразованием (в функции не получится, так как сылка живет только в функции)




    }

    public static ArrayList dete (ArrayList t, String word){
        Object [] array = t.toArray();
        for (Object x : array){
            if (x == word){
                t.remove(x);
            }
        }
        return t;
    }

    public static ArrayList order (ArrayList t){
        ArrayList<String> test4 = new ArrayList<>(t);
        Collections.reverse(test4);
        t.addAll(test4);
        return t;
    }

    public static int countHighlander (ArrayList t){
        Object [] array = t.toArray();
        for (Object x : array){
            if (t.indexOf(x) != t.lastIndexOf(x)){
                t.remove(t.lastIndexOf(x));
            }
        }
        int count = t.size();
        return count;
    }

    public static ArrayList highlander (ArrayList t){
        Object [] array = t.toArray();
        for (Object x : array){
            if (t.indexOf(x) != t.lastIndexOf(x)){
                t.remove(t.lastIndexOf(x));
            }
        }
        return t;
    }

    public static ArrayList abc (ArrayList t, String word){ // считерил )))

        t.add(word);
        Collections.sort(t);

        return t;
    }


    //-------------------------------------------------

    //Гавнотесты

    public static boolean highlanderPositive (){
        ArrayList<String> test2 =  new ArrayList();
        test2.add("64");
        test2.add("66");
        test2.add("77");
        test2.add("64");
        test2.add("78");
        test2.add("64");
        test2.add("77");
        test2.add("");
        test2.add("1");

        highlander(test2);

        ArrayList<String> test3 =  new ArrayList();
        test3.add("64");
        test3.add("66");
        test3.add("77");
        test3.add("78");
        test3.add("");
        test3.add("1");

        return test2.equals(test3);
    }

    public static boolean highlanderNegative (){
        ArrayList<String> test2 =  new ArrayList();
        test2.add("64");
        test2.add("66");
        test2.add("77");
        test2.add("64");
        test2.add("78");
        test2.add("64");
        test2.add("77");
        test2.add("");
        test2.add("1");

        highlander(test2);

        ArrayList<String> test3 =  new ArrayList();
        test3.add("64");
        test3.add("66");
        test3.add("77");
        test3.add("77");
        test3.add("");
        test3.add("1");

        return !test2.equals(test3);
    }

    public static boolean highlanderNull (){
        ArrayList<String> test2 =  new ArrayList();
        test2.add("64");
        test2.add("66");
        test2.add("77");
        test2.add("64");
        test2.add("78");
        test2.add("64");
        test2.add("77");
        test2.add("");
        test2.add("1");

        highlander(test2);

        ArrayList<String> test3 =  new ArrayList();


        return !test2.equals(test3);
    }




}


