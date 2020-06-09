import java.security.Principal;
import java.security.PublicKey;

public class HomeWorkFriday {
    public static void main(String[] args) {

        System.out.println("Рандом = " + randomIntDouble(-20 , 40)); // харит писать финкции для переменный, 1 макс, 2 мин
    }


        public static int randomIntDouble  ( int x , int y ){
        int c = x - y;
        c = ++c;
       int b = (int) (Math.random() *  c + y);
        return b;
    }

    public static double randomIntDouble  ( double x , double y){
        double c = x - y;
        c = ++c;
        double b = (Math.random() *  c + y);
        return b;
    }

        }

