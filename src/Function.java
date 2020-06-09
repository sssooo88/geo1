import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Function {
    public static void  main(String[] args){

        int sInt1 = 5;
        int sInt2 = 6;
        double sDouble = 12.2;
        int[] array = {1,2,3,4,5};

        printStr("sInt " + sInt1);
        printArray(array);
        printStr( "Sum = " + sum(sInt1,sInt2));
        numbPlusOne(sInt1);
        numbPlusOne(sDouble);

        printStr("sInt " + sInt1);
        printStr("numbPlusOne" + numbPlusOne(sInt1));
        printStr("sInt " + sInt1);
        }

    public static void printStr (String i) {
        System.out.println(i);
    }

    public static void printArray (int[] a){
        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]);
        }
        System.out.println();
    }

/*    public static int sumXY (int a, int b){ //это тоже верно как и ниже (это понятнее)
        int sum = a + b;
        return (sum);
    }*/
public static int sum (int a, int b){
    return a + b;
}
    public static double numbPlusOne(double a){
        return ++a;
    }

    public static int numbPlusOne(int i){
    return ++i;

    }




}
