public class Start {
    public static void main (String[] args){
        int b = 5 + 6;
        int[] arr = {1};

        Item item;
        Item agg = new Item("Agg", 13.2);

        Item apple = new Item();
        int id = apple.getId();
       // apple.setId(5);
        System.out.println(id);
        String company = apple.COMPANY_NAME;


        final Item tomato = new Item("Tomato", 15,6);
        //tomato.setId(18);
        System.out.println(tomato.getId());



       /* System.out.println(test(b));
        System.out.println(b);
        System.out.println(arr[0]);
        test1(arr);
        System.out.println(arr[0]);*/





    }

    /*public static int test(int x){
         x = x + 2;
        return x;
    }

    public static void test1(int[] arr){
        arr[0]=5;
    }*/

    }
