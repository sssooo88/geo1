package hwoop;

public class Item {

   private String goods;
   private double cost;


    public Item(String newGoods, double newCost){
        this.goods = newGoods;
        this.cost = newCost;
    }

    public String getGoods(){
        return this.goods;
    }

    public void setGoods(String goods){
        if (goods != null){
            this.goods = goods;
        }
    }

    public double getCost(){
        return this.cost;
    }

    public void setCost(int cost){
        if (cost > 0){
            this.cost = cost;
        }
    }



    /*public  void setBeer(boolean adult, double money) {
        int mBeer = 15; //стоимость пивка
        if (adult = false) {
            System.out.println("Проваливай щегол!!! Не возвращайся пока не выполниш квест на 16лвл");
        } else if ((money - mBeer) < 0) {
            System.out.println("Иди пофарми еще голды, небе не хватает " + "= " + ((double) (mBeer - money)));
        } else {
            System.out.println("Держи свою бутылку и сдачу в " + ((double) (money - mBeer)) + " золотых");


        }

    }*/
}
