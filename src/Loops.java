public class Loops {
    public static void main(String[] args) {

/*        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*\n");

        //do...while()
        //While()
        //for(innit type var; condition; action)

        int var = 1;
        while(var > 1){
            System.out.print("*\n");
            var = var - 1;
        }
        do {
            System.out.print("*\n");
            var = var - 1;
        }while (var > 5 );*/


 /*       for (int counter = 0; counter < 10; counter++) {
            for (int counter2 = 0; counter2 < 10; counter2++) {
                if (counter2 == counter/2 - 1 )
                    System.out.println(counter);
                }
            }*/
        /*   System.out.print("\n");*/
        /*System.out.println("");*/ //или так
        /*System.out.println(var2);*/

/*        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 2) {
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 4; i++) {
            if (i > 4)
                System.out.print("*"); //пиклеивает эту строку к if или for (первую под собой)
            System.out.print("*");



//        int i = 3;
       /* int n = 3;

    for (int i = 1; i<=n; i++) {

            for (int z = 0; z < n - i; z++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }*/


        int high = 8;


        for (int x = 0; x < high; x++) {
            for (int y = 0; y <= high; y++) {
                if (y >= high - x ) {
                    System.out.print("*");

                } else {
                    System.out.print("@");
                }
            }
            for (int y = high + 1; y <= high * 2; y++) {
                if (y <= high + x) {
                    System.out.print("*");

                } else {
                    System.out.print("@");
                }
            }

            System.out.println("");
        }
    }
}


