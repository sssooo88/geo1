public class RexEx {
    public static void main(String[] args){
        /*String str1 = "Cat";
        String str2 = new String("Cat");
        boolean compare = str1.equals((str2));
        System.out.println(compare);
        boolean compare1 =  str1.equals("[a-zA-Z]{3}");//Только буквы и цифры
        System.out.println(compare1);
        boolean compare2 = str1.matches("[a-zA-Z]{3}"); // строгое совпадение
        System.out.println(compare2);*/

        String str3 = "qwerty1";
        boolean compare3 = str3.matches("\\p{L}{5}]");// === (x == "S" | x == "S" | x == "Q" |x== "W"| x == "E") // любой из символов (через или) и 1 букву, x? 1 один раз x ничего, x* -ничего или боее(только жти символы в строке)
        System.out.println(compare3);
        // точка . любой символ





    }
}
