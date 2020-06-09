package hwoop;

import javax.naming.Name;

public  class Customer {

    private String name;
    private int age;
    private double money;
    private boolean adulthood;

    public Customer(String newName, int newAge, double newMoney) {
        this.name = newName;
        this.age = newAge;
        this.money = newMoney;
        setAdulthood();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
        setAdulthood();

    }

    public double getMoney(){
        return this.money;
    }

    public void setMoney(double money){
        if (money > 0){
            this.money = money;
        }
    }

    public boolean isAdulthood(){
        return this.adulthood;
    }

    private void setAdulthood(){
        if (this.age >= 16){
            this.adulthood = true;
        } else {
            this.adulthood = false;
        }
    }

}
