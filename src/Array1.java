public class Array1 {
    public static void main(String[] args) {

        int intArray[];

        int[] intArray1;

        intArray = new int[10];

        int size = 10;
        int[] intArray2 = new int[size];

        int[] intArray3 = {1, -15, 14, 41, 18};

        System.out.println(intArray3[2]);

        intArray3[2] = 100;
        System.out.println(intArray3[2]);

        int sInt = intArray3[2];
        System.out.println(sInt);

        int[] intArray4 = new int[10];
        double[] doubleArray = new double[10];
        char[] charArray = new char[10];
        boolean[] booleanArray = new boolean[10];

        System.out.println(intArray4);
        System.out.println(doubleArray);
        System.out.println(charArray);
        System.out.println(booleanArray);

        for (int index = 0; index < 10; index++) {
            System.out.print(intArray4[index] + " ");
        }
        System.out.println("");
        for (int index = 0; index < 10; index++) {
            System.out.print(doubleArray[index] + " ");
        }
        System.out.println("");
        for (int index = 0; index < 10; index++) {
            System.out.print((int) charArray[index] + " ");
        }
        System.out.println("");
        for (int index = 0; index < 10; index++) {
            System.out.print(booleanArray[index] + " ");
        }
        System.out.println("");
        for (int index = 0; index < intArray4.length; index++) {
            intArray4[index] = index;
            System.out.print(intArray4[index] + " ");
        }
        System.out.println("");

        System.out.println(intArray4.length);

        int[] intArray5 = new int[35];
        for(int index = 0; index < intArray4.length; index++){
            intArray5[index] = intArray4[index];
            System.out.print(intArray5[index] + " ");
        }
        System.out.println("\n" + intArray5[3] + " ");
        System.out.println(intArray4[3] + " ");
        intArray4[3] =126;
        intArray5[3] = -32;
        System.out.println(intArray5[3] + " ");
        System.out.println(intArray4[3] + " ");

        intArray5 = intArray4;

        System.out.println(intArray5[3] + " ");
        System.out.println(intArray4[3] + " ");

        intArray4[3] = -10;
        System.out.println(intArray5[3] + " ");
        System.out.println(intArray4[3] + " ");

        


    }
}
