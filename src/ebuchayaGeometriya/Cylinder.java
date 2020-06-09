package ebuchayaGeometriya;

public class Cylinder extends SolidOfRevolution {
    private int height;

    public  Cylinder(int newRadius, int newHeight){
          super (3*newRadius*newRadius*newHeight,newRadius);
        newHeight = this.height;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)){
            return false;
        }else if(obj instanceof Cylinder) {
            Cylinder x = (Cylinder) obj;
            if (this.height == x.height){
                return true;
            }
        }
        return false;
    }
}
