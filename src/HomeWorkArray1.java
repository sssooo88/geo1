 public class HomeWorkArray1 {
    public static void main(String[] args  ) {
       int [] array1 = {1,3,5,7,9,11,13,15,17,19}; //вывести массив
        for (int index = 0 ; index < array1.length ; index++){
            System.out.print(array1[index] + " ");
        }
        System.out.println("");



        int[] array2 = {8, 3, 6, -7, 1, 96, 1, 15, 54, 19}; // (2 и 3) вывести максимальное и минимальное число массива
        int min = array2[0];
        int max = array2[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int index = 0; index < array2.length; index++) {
            if (array2[index] <= min) {
                min = array2[index];
                minIndex = index; //для 4 задачи

            }
            if (array2[index] >= max) {
                max = array2[index];
                maxIndex = index; //для 4 задачи
            }


        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


        int[] swapArray1 = new int[10];  // 4 поменять местами наибольшее и наименьшие числа в массиве
        swapArray1[minIndex] = array2[minIndex];
        swapArray1[maxIndex] = array2[maxIndex];
        array2[maxIndex] = swapArray1[minIndex];
        array2[minIndex] = swapArray1[maxIndex];

        int sum = 0; // 5 среднеарифметическое
        for (int index = 0 ; index < array2.length ; index++){
            System.out.print(array2[index] + " ");
            sum = sum + array2[index]; //сумма сассива
        }
        System.out.println(" ");
        sum = sum  / array2.length; //среднее арифметическое
        System.out.println("среднее арифметическое массива = " + sum);

    }
}
