public class HomeWork2 {
    public static void main(String[] args) {
/*        // -5 до 5
        int Loop1 = -5;
        while (Loop1 <= 5) {
            System.out.print(Loop1 + " ");
            Loop1++;
        }

        System.out.print("\n");

        // 10 до -10
        int Loop2 = 10;
        while (Loop2 >= -10){
            System.out.print(Loop2 + " ");
            Loop2--;
        }

        System.out.print("\n");

        //Switch

        int Friends = 3;
        switch (Friends) {
            case 1: //Максимка
                System.out.println("Пивчанский");
                break;
            case 2: //Артем
                System.out.println("Кофэ с молочком");
                break;
            case 3: //Юля
                System.out.println("Кофэ без сахара");
                break;
            case 4: //Антон
                System.out.println("Апельсиновый фрешь");
                break;
            case 5: //Степан
                System.out.println("Зеленый чай с мелисой");
                break;
            default:
                System.out.println("Сладкий Бубалех");
        }*/
/*        for (int counter = 0; counter < 10; counter++) {
            for (int counter2 = 0; counter2 < 10; counter2++) {

                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }*/
        int rectangle = 10;
        //1-й вариант Треугольника
        for (int i = 0; i <= rectangle; i++) {

            //Левое пустое пространство
            for (int j = rectangle; j > i; j--) {
                System.out.print("@");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++) { //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = rectangle; j > i; j--) {
                System.out.print("@");
            }

            System.out.println("*" + i);
        }
    }
}
