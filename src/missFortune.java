import java.util.Scanner;

public class missFortune {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел от 1 до 100 через пробел, чтобы испытаться удачу : ");
        int x = 0; //счетчики
        int y = 0; //счетчики
        int z = 0; //счетчики
        int[] numbers = new int[10]; // ввод в сканер.
        int[] numbers3 = new int[10];// для вывода изначального массива при выиграше.
        int[] numbers4 = new int[10];// вывод призовых чисел
        int[] numbers5 = new int[10];// вывод призовых чисел
        int[] numbers6 = new int[10];// массив для обнуления
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt();
            if (numbers[index] < 0 || numbers[index] > 100) {
                System.out.println(numbers[index] + " - число не входит заданный диапазон, будь внимательнее. Запусти программу еще раз.");
            }
        }

        int[] numbers1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // выиграшная комбинация (харило рандомить)

        for (int index = 0; index < numbers3.length; index++) {
            numbers3[index] = numbers1[index];
        }


        for (int index1 = 0; index1 < numbers1.length; index1++) {
            for (int index = 0; index < numbers.length; index++) {
                if (index1 == index && numbers[index] == numbers1[index1]) {
                    z = ++z;
                    index1 = ++index1;
                    if (index1 == 10) {
                        break;
                    }
                } else {
                    z = 0;

                }
            }
        }


        for (int index1 = 0; index1 < numbers1.length; index1++) {
            if (x == 3)
                break;
            for (int index = 0; index < numbers.length; index++) {
                if (/*index1 == index && */numbers[index] == numbers1[index1]) {
                    if (x == 3) {
                        break;
                    }
                    x = ++x;
                    numbers4[index1] = numbers[index];// массив для вывода выиграша
                    index1 = ++index1;
                    if (index1 == 10) {
                        break;
                    }
                } else if (x == 3) {
                    break;
                } else {
                    x = 0;
                    numbers4 = numbers6;

                }
            }
        }


        for (int index1 = 0; index1 < numbers1.length; index1++) {
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] == numbers1[index1]) {
                    numbers5[index] = numbers[index];// массив для вывода выиграша
                    numbers1[index1] = 0;
                    y = ++y;
                }
            }
        }

        if (z == 10) {
            System.out.println("Выпавшие числа");
            for (int i = 0; i < numbers3.length; i++) {
                System.out.println(numbers3[i]);
            }
            System.out.println("");
            System.out.println("Выиграшная комбинация");
            for (int i = 0; i < numbers3.length; i++) {
                System.out.println(numbers3[i]);
            }
            System.out.println("");
            System.out.println("1 000 000$ твои");

        } else if (y == 10) {
            System.out.println("Выпавшие числа");
            for (int i = 0; i < numbers3.length; i++) {
                System.out.println(numbers3[i]);
            }
            System.out.println("");
            System.out.println("Выиграшная комбинация");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("");
            System.out.println("500 000$ твои");

        } else if ((x >= 3) && (x < 10)) {
            System.out.println("Выпавшие числа");
            for (int i = 0; i < numbers3.length; i++) {
                System.out.println(numbers3[i]);
            }
            System.out.println("");
            System.out.println("Выиграшная комбинация");
            for (int i = 0; i < numbers4.length; i++) {
                if (numbers4[i] > 0) {
                    System.out.println(numbers4[i]);
                }
            }
            System.out.println("");
            System.out.println("500$ твои");

        } else if ((y >= 3) && (y < 10)) {
            System.out.println("Выпавшие числа");
            for (int i = 0; i < numbers3.length; i++) {
                System.out.println(numbers3[i]);
            }
            System.out.println("");
            System.out.println("Выиграшная комбинация");
            for (int i = 0; i < numbers5.length; i++) {
                if (numbers5[i] > 0) {
                    System.out.println(numbers5[i]);
                }
            }
            System.out.println("");
            System.out.println("200$ твои");

        } else {
            System.out.println("Сорян, иди покупай новый билетик");
        }

    }
}