package FishHunt;

public class Predators extends Fish {
    public Predators(String newName, int newSize, int newSpeed, boolean newLive, boolean newItsPredator) {
        super(newName, newSize, newSpeed, newLive, newItsPredator);
    }


    public int hunt (Herbivorous x){
        if ( (x.isLive()) && (!x.isItsPredator()) && (x.getSpeed() > super.getSpeed()) ){
            System.out.println(x.getName() + " быстрее чем " + super.getName() + ", а значит осталась жива.");
        } else if ( (x.isLive()) && (!x.isItsPredator()) && (x.getSpeed() < super.getSpeed()) ) {
            super.setSize(super.getSize() + x.getSize());
            x.setLive(false);
            System.out.println(super.getName() + " сьела " + x.getName() + " и стала больше на " + (super.getSize() + x.getSize()) + ".");
        } else if (super.isLive()) {
        System.out.println(super.getName() + " нет в живых, а значить жрать не может.");
        } else if (!x.isLive()) {
        System.out.println(x.getName() + " нет в живых, а значить сьесть это нельзя.");
        } else if (x.isItsPredator()){
            System.out.println(super.getName() + " - хищник, а значит не можеть есть другого хищника - " + x.getName() + ". Корьмить хищьника только травоядными");
        }

        return super.getSize();
    }


}
