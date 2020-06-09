public class HomeWork {
    public static void main(String[] args) {
        //сравнение A и B
        int A = 5;
        int B = 6;
        if (A > B) {
            System.out.println(A + " > " + B);
        } else if (B > A) {
            System.out.println(B + " > " + A);
        } else {
            System.out.println(B + " = " + A);
        }

        //ченость
        int C = 5;
        if (C % 2 == 0) {
            System.out.println(C + " - четное");
        } else {
            System.out.println(C + " - не четное");
        }

        //дробное и целове число
        double E = 328.94234;
        System.out.println("дробная часть = " + (E % 1) + " целое = " + (int) E);

        // F + G >= 15

        int F = 7;
        int G = 8;
        //в зависимости какие условия будешь ставить в очередность.
        /*if (F + G >= 15) {
            System.out.println(" F + G >= 15");
        } else if (F + G < 15) {
            System.out.println("F + G < 15");
        } else if (F - G < 0) {
            System.out.println("F + G < 0");
        } else if (G - F < 0) {
            System.out.println("G + F < 0");
        }*/

        //через вложение, вроде ты так хотела изначально

       /* if ( F + G >= 15){
            System.out.println(" F + G >= 15");
                if ( (F - G < 0) || (G - F < 0) ) {
                    System.out.println("но их разность меньше 0 ");
                }

        }else if ( F + G < 15){
            System.out.println(" <= 15");
            if ((F - G < 0) || (G - F < 0)) {
                System.out.println("но разность меньше 0");
            }

        }*/
        //если следовать букве закона (задачи) //3 варианта развития событий
        if ((F - G < 0) || (G - F < 0)) {
            System.out.println(" разница F и G  меньше 0 ");// можно было расписать в каких положениях, но в задаче не написано
        } else if (F + G >= 15) {
            System.out.println(" F + G >= 15");
        } else {
            System.out.println(" F + G <= 15");


        }
        // в порядке возрастания (сломай голову)

        int x = 8;
        int y = 3;
        int z = 2;
        if (x >= y && x >= z && y >= z) {
            System.out.println("от наименьшому к большему " + z + y + x);
        } else if (y >= x  && y >= z && x >= z) {
            System.out.println("от наименьшому к большему " + z + x + y);
        } else if (z >= x && z >= y && x >= y) {
            System.out.println("от наименьшому к большему " + y + x + z);
        } else if (x >= y && x >= z && z >= y) {
            System.out.println("от наименьшому к большему " + y + z + x);
        } else if (y >= z && y >= x && z >= x) {
            System.out.println("от наименьшому к большему " + x + z + y);
        } else if (z >= x && z >= y && y >= x) {
            System.out.println("от наименьшому к большему " + x + y + z);
        }


            //наибольшее из 3х
        int i = 453;
        int j = i / 100;
        int k = (i - (j * 100)) / 10;
        int m = i - (j * 100) - (k * 10);
            if (j >= k && j >= m) {
                System.out.println(" наибольшее число из " + i + " это " + j);
                    } else if (k >= j && k >= m) {
                        System.out.println(" наибольшее число из " + i + " это " + k);
                            } else {
                                System.out.println(" наибольшее число из " + i + " это " + m);
            }



    }
}


