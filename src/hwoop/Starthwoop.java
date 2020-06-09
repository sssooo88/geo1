package hwoop;

import ebuchayaGeometriya.Shape;

public class Starthwoop {

    public static void main (String[] args){
        EmpCustomer SanekShuraAleksandr = new EmpCustomer ("SanekShuraAleksandr", 100500, 11.2);
        System.out.println(SanekShuraAleksandr.getName());
        Customer petia = new Customer("Petia", 15,22.5);
        Item beer = new Item("Beer", 20.1);

        Shop.alcohol(beer.getCost(), petia.getMoney(), petia.isAdulthood());



    }
}
