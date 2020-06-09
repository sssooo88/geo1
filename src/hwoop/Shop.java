package hwoop;

public class Shop {

    public static void candy(double cost, double money) {
        if ((money - cost) < 0) {
            System.out.println("Эй щегол, иди дальше колядуй, тебе на хватает " + (cost - money) + " голды");
        } else {
            System.out.println("Держи конфету, твоя здача " + (money - cost) + " голды");
        }
    }

    public static void alcohol(double cost, double money, boolean adulthood) {
        if (!adulthood) {
            System.out.println("Эй щегол, ты сильно юн для этого. Не приходи пока не выполних квест на 16 лвл");
        } else if ((money - cost) < 0) {
            System.out.println("Эй щегол, иди дальше колядуй, тебе на хватает " + (cost - money) + " голды");
        } else {
            System.out.println("Держи Пивчанский, твоя здача " + (money - cost) + " голды");
        }
    }


}
