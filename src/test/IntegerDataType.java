package test;

import java.util.ArrayList;

public class IntegerDataType {
    public static void main(String[] args){

        ArrayList<Integer> intList = new ArrayList<>();
        int i = 300;
        Integer i1 = 300;
        intList.add(i);
        //list.add(Integer.valueOf(i));
        intList.add(i1);
        System.out.println(intList);
        i = i1;
        /*i1++;*/
        System.out.println(i1);
        int z = 300;
        Integer z1 = 300;

        System.out.println(z==i);
        System.out.println(z1==i1);
        System.out.println(z1.equals(i1));

        //z = z + z1; //хуйня так как z1 = null

        String s = "10";
        int y = Integer.parseInt(s);// читстый int (работа быстрее), ,без функционала
        System.out.println(y);

        s = "ff";
        y = Integer.parseInt(s,16);// 16 Ричная система
        System.out.println(y);

        s = "10";
        y = Integer.valueOf(s); //Integer сылочная переменная (дохуя функций сверху)
        System.out.println(y);

        //z1.intValue(); // преобразование в int

        System.out.println(Integer.toString(z,16)); ;// 16 Ричная система











    }
}
