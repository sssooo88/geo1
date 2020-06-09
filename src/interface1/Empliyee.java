package interface1;

public class Empliyee extends Person implements  Comparable <Empliyee>{

    public Empliyee(String newName, int newAge) {
        super(newName, newAge);
    }

    @Override
    public int compareTo(Empliyee o) {
       /* if (o instanceof Empliyee){
        Empliyee newEmp = (Empliyee) o;
        if (super.age < newEmp.age) {
            return -1;
        } else if (super.age < newEmp.age) {
            return 1;
        } else {

            return 0;
        }
        }
        return -1;*/

        return Integer.compare(super.age, o.age);

    }
}
