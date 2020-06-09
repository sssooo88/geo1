public class ArrayLesson2 {
    public static void main(String[] args) {

    int[] arr = new int[5];
        int num = 5;
        for(int i = 0; i < arr.length; i++){
            arr[i] = num;
            num++;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int index : arr){
            index = num;
            num++;
            System.out.print(index  + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();




        /*
        int size = 3;
        int num = 4;
        int arr1[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr1[i][j] = num;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();

            int arr2[][] = new int[size][size];

            for(int value[] : arr2){
                for(int value2 : value){
                    value2 = 5;
                    System.out.print(value2 + " ");
                }
                System.out.println();
            }
        }


        /*
        double sD1 = 10000.00 / 3;
        double sD2 = -20000.00 / 3;



        System.out.print(sD1);
        System.out.println(sD1);
        System.out.print("test1\ntest2\n");
        System.out.print(sD1 + " " + sD2 + "\n");
        System.out.print(sD1 + "\t" + sD2 + "\n");


        System.out.printf("%f\n", sD1);
        System.out.printf("%f%n", sD1);
        System.out.printf("%2$f%1$f", sD1, sD2);
        System.out.printf("%+f\n", sD2);
        System.out.printf("%20f\n", sD1);
        System.out.printf("%.2f\n", sD1);
        System.out.printf("sD1 = %2$+.2f sD2 = %1$.3f", sD1,sD2);
        */
    }
}
