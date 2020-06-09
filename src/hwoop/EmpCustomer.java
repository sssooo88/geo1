package hwoop;

public class EmpCustomer extends Customer {

private boolean working;
private double discount;
private String position;

 public EmpCustomer(String newName, int newAge, double newMoney){

     super(newName, newAge, newMoney);
     this.working = working;
     this.discount = discount;
     this.position = position;

 }

    @Override
    public void setAge(int age) {
        super.setAge(age + 10);
    }
}
