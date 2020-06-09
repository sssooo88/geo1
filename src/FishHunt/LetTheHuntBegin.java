package FishHunt;

public class LetTheHuntBegin {
    public static void main (String[] args){

        Food green = new Food ("green",12,true);
        Herbivorous lesh = new Herbivorous("lesh",13,6,true,false);
        Herbivorous lesh1 = new Herbivorous("lesh1",13,6,true,false);
        Predators shark = new Predators("shark",5,5,true,true);
        Predators shark1 = new Predators("shark1",5,5,true,true);

        shark.hunt(green);

    }
}
