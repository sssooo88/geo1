package FishHunt;

public class Food {
    public String name;
    public int size;
    public boolean live;

    public Food (String newName, int newSize, boolean newLive){
        this.name = newName;
        this.size = newSize;
        this.live = newLive;

    }

    public String getName() {
            return this.name;
        }

    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
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





}
