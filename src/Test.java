public class Test {
    public static  void main(String[]args) {
        byte simpleByte = -128;
        System.out.println("simpleByte = " + simpleByte);

        short simpleShort = 32767;
        System.out.println("simpleShort = " + simpleShort);


        char simpleChar1 = 122;
        char simpleChar2 = 'A';
        System.out.println("simpleChar1 = " + simpleChar1);
        System.out.println("simpleChar2 = " + simpleChar2);


        System.out.println("simpleChar1 - simpleChar2 = " + (simpleChar1 - simpleChar2));
        System.out.println("simpleChar1 - simpleChar2 = " + (char)(simpleChar1 - simpleChar2));

        int simpleInt = 2147483647;

        System.out.println("simpleInt = " + simpleInt);

        long simpleLong = 9223372036854775807L; // Постфикс l или L обозначает литералы типа long
        System.out.println("simpleLong = " + simpleLong);

        //        float	4 байт	от 1.4e-45f до 3.4e+38f . Две особенности этого типа: при инициализации
//       обязательно использовать постсуфикс F и количество знаков после запятой: 7
        float simpleFloat = 3.141592655897932F;
        System.out.println("simpleFloat = " + simpleFloat);

//        double	8 байт	от 4.9e-324 до 1.7e+308. Особенность этого типа количество знаков после запятой: 15
        double simpleDouble = 3.141592635897932;
        System.out.println("simpleDouble = " + simpleDouble);

        //        boolean	1 байт(в массивах), 4 байт (не в массивах используется int)	true (истина) или false (ложь)*/
        boolean simpleBoolean = false;
        System.out.println("simpleBoolean = " + simpleBoolean);

        final int NEW_INT = 15;
        //NEW_INT = 16;

        int num1 = 1;
        System.out.println("num1 = " + (num1 + 1));
        int num2 = 1;
        System.out.println("num2 = " + (++num2));
        int num3 = 1;
        System.out.println("num3 = " + (num3++));
        System.out.println("num3 = " + (num3));

        System.out.println("num1 = " + (num1 - 1));
        System.out.println("num2 = " + (--num2));
        System.out.println("num3 = " + (num3--));
        System.out.println("num3 = " + (num3));


        boolean truth = true;
        System.out.println("truth = " + !(!truth));

        num1 = 5;
        num2 = 3;
        System.out.println("num1 / num2 = " + (num1 / num2)); //деление до целого числа
        System.out.println("num1  num2 = " + (num1 * num2));
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 % num2 = " + (num1 % num2)); //деление по модулю (остаток)

        double double1 = 3.123;
        double double2 = 0.00;
        // При обычном делении действуют теже правила + округление
        System.out.println("double1 / double1 = " + (double1 / double1));
        // При делении на 0 положительного числа получается положительная бесконечность
        System.out.println("double1 / double2 = " + (double1 / double2));
        // При делении на 0 отрицательного числа получается отрицательная бесконечность
        System.out.println("-double1 / double2 = " + (-double1 / double2));
        // При делении 0 на 0 получается NaN - not a number
        System.out.println("double2 / double2 = " + (double2 / double2));

        //        логические:
        boolean lying = false;
//        ||, если а истинно то b не проверяется
        System.out.println("truth || lying = " + (truth || lying));
//        &&, если а ложно то не b проверяется в любом случае
        System.out.println("truth && lying = " + (truth && lying));
//        >, >=,
//        <, <=,
//        ==, !=, равно, не равно
        System.out.println("num1 == num2 = " + (num1 == num2));
        System.out.println("num1 != num2 = " + (num1 != num2));
//         &, если а ложно то b проверяется в любом случае
        System.out.println("truth & lying = " + (truth & lying));
//         | если а истинно то b проверяется в любом случае
        System.out.println("truth | lying = " + (truth | lying));

          /* Тернарная операция. (логический оператор)
        ?:
        условие? выражение, которое нужно выполнить если условие истинно : выражение, которое нужно выполнить если
        условие ложно*/

        System.out.println("truth ? num1 - num2 : num1 + num2 RESULT: " + (truth ? num1 - num2 : num1 + num2));
        System.out.println("!truth ? num1 - num2 : num1 + num2 RESULT: " + (!truth ? num1 - num2 : num1 + num2));
    }
}
