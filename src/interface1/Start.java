package interface1;


import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Empliyee emp[] = {new Empliyee("Vasia", 38),new Empliyee("Kolya", 27),
                new Empliyee("Dusia", 28)};

        Arrays.sort(emp); // нужно эмплиментировать

        //System.out.println(Arrays.toString(emp)); так работает только для objekt и примеивов.

        for(Empliyee e : emp){
            System.out.println(e.age + " " + e.name);
        }

    }
}
