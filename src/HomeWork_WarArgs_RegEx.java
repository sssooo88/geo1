public class HomeWork_WarArgs_RegEx {
    public static void main(String[] args) {
        System.out.println(boolU('T','U','n'));
        System.out.println(divideInt(100.11,2,-2,0,2));
        String str = "+80633226958";
        boolean compare = str.matches("([+][8])?[0][0-9]{9}");
        System.out.println(compare);

    }

    public static boolean boolU(char... x) {
        boolean y = true;
        for (int index = 0 ; index < x.length; index++) {
            if (x[index] == 'U') {
                y = true;
            } else {
                y = false;
                {

                }
            }

        }
        return y;
    }

    public static int divideInt (double x,int ... y){
        int z = (int) x;
        for (int index = 0 ; index < y.length; index++) {
            if (y[index] != 0) {
                z = z / y[index];
            }

        }
        return z;

    }

}
