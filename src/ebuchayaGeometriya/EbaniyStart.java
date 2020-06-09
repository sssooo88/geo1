package ebuchayaGeometriya;
import java.util.Arrays;
public class EbaniyStart {
    public static void main(String[] args){

        Shape x = new Ball(3,2);
        Shape r = new Cylinder(1, 1);
        Box y = new Box(3);
        SolidOfRevolution t = new SolidOfRevolution (1,2);
        Cylinder z = new Cylinder(1, 1);
        Shape f;

  /*      String st = "Test";
         st.equals(st);
         st.hashCode();
        System.out.println(x.equals(x));
        System.out.println(x.hashCode() == r.hashCode());
        System.out.println(x.getClass() == r.getClass());
        System.out.println(x.getClass() == y.getClass());
        System.out.println(r.getClass().getSuperclass());
        System.out.println(r.toString());
        System.out.println(r.hashCode());*/

  int[] preved = {1,4,2,10,9,3,7,5,8,6};

        System.out.println(preved);
        String herna = Arrays.toString(preved);
        System.out.println(herna);
        int[] preved1 = Arrays.copyOf(preved,13);
        System.out.println(Arrays.toString(preved1));

        int[] preved2 = Arrays.copyOfRange(preved,0,9);
        System.out.println(Arrays.toString(preved2));

        Arrays.sort(preved); // вносит изменения
        System.out.println((Arrays.toString(preved)));

        System.out.println(Arrays.binarySearch(preved,8));

        Arrays.fill(preved1,5); // вносит изменения
        System.out.println(Arrays.toString(preved1));

        System.out.println(Arrays.equals(preved,preved2));










    }
}
