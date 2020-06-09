import java.security.Signature;

public class TypeConversion {
    public static void main (String [] args){
        byte simpleByte = 15;
        System.out.println(simpleByte);
        int sInt = simpleByte;
        System.out.println(simpleByte);

        float sFloat = 31.123456F;
        System.out.println(sFloat);

        double sDouble = sFloat;
        System.out.println(sDouble);

        char sChar = 'A';
        System.out.println(sChar);

        sInt = sChar;
        System.out.println(sInt);

        long sLong;
        sDouble = sInt;
        System.out.println(sDouble);

        System.out.println(sInt + sDouble);
        System.out.println(sDouble + sInt);

        System.out.println(sFloat + sInt);
        sInt = 127;
        long sLong1 = 2147483647;
        System.out.println(sInt + sInt + sLong1);

        //Синтаксис:
        // (тип) переменная;

        sLong = (long)sFloat;
        System.out.println(sLong);

        simpleByte = (byte) sInt;
        System.out.println(simpleByte);

        boolean sBool = true;
        // sBool = (boolean) simpleByte; //дич, незя так.


    }
}
