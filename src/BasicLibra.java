import java.util.ArrayList;


public class BasicLibra {
    public static void main(String[] args){

        Math.random();

        System.out.println(Math.random());
        /*Схема диапазона: [a;b). То есть нижняя граница а, верхняя b. Тогда для генерации вещественных чисел в заданном
        диапазоне нужно записать следующее:
        ( Math.random() * (b-a) ) + a
        Где (b-a) - размер диапазона
        + a - смещение от 0;
        */

        double sDouble;
  /*      for (int i = 0; i < 5 ; i++){
            sDouble = Math.random() * 5;
            System.out.println("sDouble * 5 = " + sDouble);
        }

        for (int i = 0; i < 5 ; i++){
            sDouble = Math.random() + 10;
            System.out.println("sDouble + 10) = " + sDouble);
        }*/

        for (int i = 0; i < 5 ; i++){
            sDouble = Math.random() * 5 + 10;
            System.out.println("sDouble * 5 + 10) = " + sDouble);
        }

        int sInt;
        for (int i = 0; i < 5 ; i++) {
            sInt = (int) (Math.random() *  60 - 20);
            System.out.println("sInt = " + sInt);
        }



        double sD1 = 3.9;
        System.out.println(Math.round(sD1));
        System.out.println(Math.floor(sD1));
        System.out.println(Math.ceil(sD1));

    }
}
