package ebuchayaGeometriya;

public abstract class Shape {
    private int volume;

    public Shape (int newVolume){

        this.volume = newVolume;
    }

    public int getVolume() {

        return this.volume;
    }

@Override
public String toString(){
        return this.volume + "";
}

    @Override
    public int hashCode(){
       return this.volume * 5 / 3;
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj){
        return true;
    }
        if (obj instanceof Shape) {
            Shape s = (Shape) obj;
            if (this.volume == s.getVolume()) {
                return true;
            }
        }
        return false;
    }

    public abstract void draw ();

    //public abstract double decreaseSize(double devider);



}
