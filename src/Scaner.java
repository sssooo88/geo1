import javax.print.attribute.standard.Sides;
import java.util.Scanner;

public class Scaner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Word: ");
        String word = sc.next();
        System.out.println("Word :" + word);
        String line = sc.nextLine();
        System.out.println("Line :" + line);

        if (sc.hasNextInt())
        {
            int sInt = sc.nextInt();
            System.out.println("Int :" + sInt);
        } else {
            word = sc.next();
            System.out.println("Word :" + word);
        }

        sc.close();

     /*   double sDouble = sc.nextDouble();
        System.out.println("Doublr :" + sDouble);*/




    }
}
