import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HomeWorkDoubleArray {
    public static void main(String[] args) {

// Первая задача

        int sizeTwoArray = 5; //размер массива для 1 задачи
        double[][] TwoArray = new double[sizeTwoArray][sizeTwoArray];//двумерный рандомный массив
        //TwoArray мотод двумерного формирования рандомного массива. Рандом под капотом.
        //sumLeft сумма левой диагонали
        //sumRight сумма правой диагонали
        //sumLeftAndRightDiagonal вывод сумм диагоналей
        //printResponce вывод ответа по первой задаче
        printResponce(TwoArray(TwoArray),  //вывод на экран
                sumLeft(TwoArray),
                sumRight(TwoArray));

        // Третья задача

        int sizeArray2 = 5; //кол-во столбцов
        //bumpyArray - генерация значений в массиве
        //maxSizeLine - максимальное значение значений в линии
        //sumCollum - сумма в столбце
        int[][] bumpyArray = new int[sizeArray2][];//не равномерный массив
        printResponse1(bumpyArray(sizeArray2,  //вывод на экран
                bumpyArray),
                maxSizeLine(bumpyArray));

// Четвертая задача

        String st1 = "Солнце сильно сопротивлялось,но Силы Природы несомненно сильнее.Ему пришлось зайти за горизонт и Серп Луны сменил его на небосводе.";
        //ofPontsAndComMa - избавляемя от запятих и точек
        //countOfWords - считаем слова
        //printResponse2 - вывод результата
        printResponse2(countOfWords(ofPontsAndComMa(st1)));


    }

// Первая задача (тело)

    public static double[][] TwoArray(double TwoArray[][]) {

        for (int i = 0; i < TwoArray.length; i++) {
            for (int j = 0; j < TwoArray.length; j++) {
                double doubleRandom = Math.random() * 10; //рандом до десятки
                TwoArray[i][j] = doubleRandom;
            }
        }
        return TwoArray;

    }

    public static void printResponce(double TwoArray[][], double sumLeft, double sumRight) {
        System.out.println("Задача№1");
        System.out.println("Рандомный двумерный массив:");
        for (int i = 0; i < TwoArray.length; i++) {
            for (int j = 0; j < TwoArray.length; j++) {
                System.out.printf("%.2f ", (TwoArray[i][j]));
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.printf("Сумма левой диагонали = %.2f\nСумма правой диагонали = %.2f\n", sumLeft, sumRight);
        System.out.println();
    }

    public static double sumLeft(double TwoArray[][]) {
        double sum = 0;
        for (int i = 0; i < TwoArray.length; i++) {
            sum = sum + TwoArray[i][i];
        }

        return sum;
    }

    public static double sumRight(double TwoArray[][]) {
        double sum = 0;
        int i = 0;
        for (int j = TwoArray.length - 1; j > -1; j--) {
            sum = sum + TwoArray[i][j];
            ++i;
        }
        return sum;
    }

//-----------------------------------------------------------------------------------------------------------------------

    // Треться задача (тело)
    public static int[][] bumpyArray(int sizeArray2, int bumpyArray[][]) {
        for (int x = 0; x < sizeArray2; x++) {
            bumpyArray[x] = new int[(int) (Math.random() * 10)];
        }
        for (int i = 0; i < bumpyArray.length; i++) {
            for (int j = 0; j < bumpyArray[i].length; j++) {
                bumpyArray[i][j] = ((int) (Math.random() * 10));
            }
        }
        return bumpyArray;
    }

    public static int maxSizeLine(int bumpyArray[][]) {
        int maxSizeLine = 0;
        for (int i = 0; i < bumpyArray.length; i++) {
            if (maxSizeLine < (bumpyArray[i].length)) {
                maxSizeLine = (bumpyArray[i].length);
            }
        }
        return maxSizeLine;
    }

    public static int sumCollum(int index, int bumpyArray[][]) {
        int sumCollum = 0;

        for (int i = 0; i < bumpyArray.length; i++) {
            for (int j = 0; j < bumpyArray[i].length; j++) {
                if (j == index) {
                    sumCollum += bumpyArray[i][j];
                }
            }
        }
        return sumCollum;
    }

    public static void printResponse1(int bumpyArray[][], int maxSizeLine) {
        System.out.println("Задача№2");
        System.out.println("Рандомный не ровный массив:");
        for (int i = 0; i < bumpyArray.length; i++) {
            for (int j = 0; j < bumpyArray[i].length; j++) {
                System.out.print(bumpyArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < maxSizeLine; i++) {
            System.out.println("Сумма столбца № " + (i + 1) + " = " + sumCollum(i, bumpyArray));
        }
        System.out.println();
    }

//-----------------------------------------------------------------------------------------------------------------------

// Треться задача (тело)
    public static String ofPontsAndComMa(String st1) {
        String st4 = (st1.replace('.', ' '));
        st4 = (st4.replace(',', ' '));

        return st4;
    }

    public static int countOfWords(String st1) {
        char[] chars = st1.toCharArray();
        int y = 0;//count
        int x = 0;//countOfWords
        for (int index = 0; index < chars.length; index++) {
            x++;
            if (chars[index] == ' ') {
                if ((x - 1) > 2) {
                    y++;
                    x = 0;
                } else {
                    x = 0;
                }
            }
        }

        return y;
    }

    public static void printResponse2(int countOfWords) {

        System.out.println("Задача№3");
        System.out.println("Дaна String : Солнце сильно сопротивлялось,но Силы Природы несомненно сильнее.Ему пришлось зайти за горизонт и Серп Луны сменил его на небосводе.");
        System.out.println("Количество слов боле 2 символов и без точек и запятых: " + countOfWords);
    }
}






