public class BranchingOperations {
    public static void main(String[] args) {
        //int ste = 12;
        /*Общая форма условного оператора if в Java такая:
        if (условие) {
            действие(-я), которые выполняются, если условие истинно;
        }
        else if (условие) {
            действие(-я), которые выполняются, если условие истинно;
        }
        else {
            действие(-я), которые выполняются, если условие истинно;
        }*/
        int i = 11;
        /*
            if (i == 1){
                System.out.println(i + " test1");
            }
            else if (i == 1){
                System.out.println(i + " test2");
            } else {
                System.out.println(i + " test3");
            }
*/
        if (i > 1 && i < 29){
            System.out.println(i + " test8");
            if (i == 12){
                System.out.println(i + " test6");
            }

        } else {
            System.out.println(i + " test5");
        }


    }
}
/*
        if (i == 5 || i == 10) {
            System.out.println(i + " Test5");
        } else {
            System.out.println(i + " Test10");
        }


        /*1 % 2 == 0;*/


