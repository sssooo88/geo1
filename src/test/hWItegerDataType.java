package test;

import java.util.ArrayList;
import java.util.Scanner;

public class hWItegerDataType {
    public static void main(String[] args) {

        ArrayList<Integer> test1 = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите только целые числа. Если вы хотете вывести числа на экран, введите слово stop. ");


        while (sc.hasNext()) {

            if (!sc.hasNextInt()) { // если ввели дич
                String x = sc.next(); // переменная
                String z = "stop"; // наше стоп плово (если вы нимаете о чем я)
                if (z.equals(x.toLowerCase())) { // если стоп слово сработа
                    if (test1.size() == 0) {
                        System.out.println("Вы ничего не ввели, перезапустите программу и начните снова.");
                        test1.clear();
                        sc.close();
                        break;

                    } else { //вывод и удаление простыч чисел
                        System.out.print("Ваши (православные) числа : ");
                        for (int i = 0 ; i < test1.size(); i ++) {
                            if(isPrime(test1.get(i))) {
                                System.out.println(test1.get(i));
                                test1.remove(i);
                                i = -1; // костыль (вернуться на шаг назад при удалении элемента)
                            }
                        }
                        sc.close();
                        break;
                    }

                } else {
                    System.out.println("Вы допустили ошибку при вводе чисел. Попробуйте снова.");
                }
            } else {
                test1.add(Integer.valueOf(sc.next())); // Добавление элемента
            }
        }

            System.out.println(test1); //проверка
    }

    public static boolean isPrime(Integer n) {// ебучие простые числа
        if (n == 2) return true;
        if (n % 2 ==0) return false;
        for(Integer i = 3; i * i <= n; i +=2 ) {
            if( n % i == 0)
                return false;
        }
        return true;
    }

}


