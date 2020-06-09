package ebuchayaGeometriya;

public class SolidOfRevolution extends Shape {
private int radius;

public SolidOfRevolution(int newVolume, int newRadius){
    super(newVolume);
    this.radius = newRadius;

}
 public int getRadius (){
    return this.radius;

   }

   @Override
    public void draw(){
       System.out.println(super.getVolume() + " " + radius);
   }


}
