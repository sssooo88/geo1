package FishHunt;

public class Fish {
    private String name;
    private int size;
    private boolean live;
    private int speed;
    private boolean itsPredator;

    public Fish (String newName, int newSize, int newSpeed, boolean newLive, boolean newItsPredator){

        this.name = newName;
        this.size = newSize;
        this.speed = newSpeed;
        this.live = newLive;
        this.itsPredator = newItsPredator;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed){
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public String  getName() {
        return this.name;
    }

    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }
    public boolean isLive(){
            return this.live;
        }

    public void setLive(boolean live){
                this.live = live;
            }

    public boolean isItsPredator(){
        return this.itsPredator;
    }

    public void setItsPredator(boolean itsPredator){
        this.itsPredator = itsPredator;
    }

    public int hunt (Food x){
        if ( (live) && (!itsPredator) && (x.isLive()) ){
            System.out.println(name + " сьела " + x.getName() + " и его размер тепарь " + (size + x.getSize()) + ".");
            size = (size + x.getSize());
            x.setLive(false);
        } else if ( (live) && (itsPredator) && (x.isLive()) ) {
            System.out.println(x.getName() + " эту дрянь " + name + " есть не будут. Хищника необходимо кормить травоядными рыбами.");
        }else if (!live) {
            System.out.println(name + " нет в живых, а значить жрать не может.");
        }else if (!x.isLive()) {
            System.out.println(x.getName() + " нет в живых, а значить жрать не может.");
        }
        return size;
    }

}


