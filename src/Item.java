public class Item {
    private int id = 0;
    private String  name;
    private double price;
    private int weight;
    private boolean active;
    private int[] properties;
    private static int nexId;
    public final String COMPANY_NAME = "upitec";

    {
        this.nexId++;
        this.id = this.nexId;


    }

    public Item( String name,double price, int weight){
        this(name,price);
        this.weight = weight;
        properties = new int[15];

    }
    public Item( String newName, double mewPrice){
        //id = newId;
        name = newName;
        price = mewPrice;
    }

    public Item(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id > 0) {
            this.id = id;
        }
    }

    public void changePrice(double newPrice){
        price = newPrice;
    }

    public int[] getProperties(){
        return this.properties.clone();
    }

    private boolean isBiggerThenZero(double number) {
        if (price > 0) {
            return true;
        } else {
            return false;
        }
    }

    public  double calculateItemAmount(double weight){
        return weight * this.price;
    }


}
