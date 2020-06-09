public class Trials {
    public static void main(String[] args) {

        String st1 = "Солнце сильно сопротивлялось,но Силы Природы несомненно сильнее.Ему пришлось зайти за горизонт и Серп Луны сменил его на небосводе.";
        String st4 = (st1.replace('.' , ' '));
        st4 = (st4.replace(',' , ' '));


        char[] chars = st4.toCharArray();
        int y = 0;
        int x = 0;
        for (int index = 0; index < chars.length; index++) {
            x++;
            if (chars[index] == ' '){
                if ((x-1) > 2) {
                    y++;
                    x = 0;
                } else {
                    x = 0;
                }
            }
        }
        System.out.println(y);
        }
    }
