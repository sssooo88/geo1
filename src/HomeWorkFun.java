public class HomeWorkFun {
    public static void main(String[] args) {
        compareNumber(4, 3); //сравнение A и B
        parity(5); //четность
        treugolnichek(8); //треугольник
        int[] array2 = {8, 3, 6, -7, 1, 96, 1, 15, 54, 19};
        printStr("минимальный порядковый индекс массива = " + arrayMin(array2));
        printStr("минимальный порядковый индекс массива = " + arrayMax(array2));
        printArray(Swap(array2));
        
    }

    public static void printStr(String i) {//принт одиночный
        System.out.println(i);
    }

    public static void printArray (int[] a){//принт одиночный массива
        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]);
        }
        System.out.println();
    }

    public static void compareNumber(int a, int b) { //сравнение A и B
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }

    public static void parity(int c) { //четность
        if (c % 2 == 0) {
            System.out.println(c + " - четное");
        } else {
            System.out.println(c + " - не четное");
        }
    }

    public static void treugolnichek(int high) { //треугольник
        //int high = 7;
        for (int x = 0; x < high; x++) {
            for (int y = high; y >= x; y--) {
                if (y == x) {
                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }


            }
            for (int y = 1; y <= x * 2; y++) {
                if (y == x * 2) {
                    System.out.print("*");
                } else if (x == high - 1) {
                    for (y = 0; y <= high * 2 - 3; y++) {
                        System.out.print("*");
                    }

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
    }

    public static int arrayMin(int[] array2) { //мин. индекс массива
        int min = array2[0];
        int minIndex = 0;
        for (int index = 0; index < array2.length; index++) {
            if (array2[index] <= min) {
                min = array2[index];
                minIndex = index;

            }
        }
        
        return minIndex;
    }

    public static int arrayMax(int[] array2) { //макс. индекс массива
        int max = array2[0];
        int maxIndex = 0;
        for (int index = 0; index < array2.length; index++) {
            if (array2[index] >= max) {
                max = array2[index];
                maxIndex = index;

            }
        }

        return maxIndex;
    }

    public static int[] Swap(int[] array2) { //поменять местами макс и мин значения в массиве
        int min = array2[arrayMin(array2)];
        array2[arrayMin(array2)] = array2[arrayMax(array2)];
        array2[arrayMax(array2)] = min;

        return array2;
    }


}

