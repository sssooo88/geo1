package ebuchayaGeometriya;

public class Box extends Shape{

    private Shape shape;

    public Box (int volume){
        super(volume);
    }

    public Box (int volume, Shape x) {
        super(volume);
        if (add(x)){
            this.shape = x;
        }
    }


    public boolean add (Shape x) {
       /* if (super.getVolume() > x.getVolume()) {
            return true;
        } else {
            return false;
        }*/
       return super.getVolume() > x.getVolume();
    }

    public void setShape (Shape x) {
        if (super.getVolume() > x.getVolume()) {
           this.shape = x;
        }
    }

    public Shape getShape(){
        return this.shape;
    }

    @Override
    public void draw(){
        System.out.println(super.getVolume() + " " + this.shape);
    }





}
