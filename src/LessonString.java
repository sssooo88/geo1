public class LessonString {
    public static void main(String[] args) {
        /*String  example = "";
        String  exampl1 = new String();

        String s1 = "Test ";
        String s2 = "1";
        String sum = s1 + s2;
        System.out.println(sum);

        int sInt = 12;
        String  st = "My age is ";
        System.out.println(st + sInt);
        sum = st + sInt;
        System.out.println(sum);

        s1 = s1.concat(s2);
        System.out.println(s1);

        exampl1 = null;
        s1 = s1 + exampl1;
        System.out.println(s1);*/

        String string1 = "Upitec";
        System.out.println(string1);

    /*    int i = string1.length();
        System.out.println(i);

        System.out.println(string1.isEmpty());

        System.out.println(string1.toLowerCase());

        System.out.println(string1.toUpperCase());
        String s2 = (string1.replace("i","c"));
        System.out.println(string1.replace("i","c"));
        System.out.println(s2.charAt(4));

        System.out.println(s2.indexOf("c"));
        System.out.println(s2.indexOf('c',3));
        System.out.println(s2.lastIndexOf('c'));

        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2,4));

        string1 = "    " + string1;
        System.out.println(string1);
        System.out.println(string1.trim());

        System.out.println(string1.endsWith("tec"));

        String st0 = new String("Cat");

        String st1 = "cat";
        String st2 = "Cat";
        boolean bool = st0 == st1;
        System.out.println(bool);
        System.out.println(st0.equals(st1));
        System.out.println( st2 == st1);
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st0));

        char[] string1Array = string1.toCharArray();
        System.out.println("Char array:" + string1Array);
        System.out.println("Char array:");
        for (int index = 0; index < string1Array.length; index++) {
            System.out.println("Element [" + index + "]: " + string1Array[index]);
        }

        //for(type name_el : array)

    *//*    for(char element : string1Array){

            if(element == 't'){
                break;
            }
            System.out.println("Element = " + element);
        }
*//*
        st0 = String.copyValueOf(string1Array);
        System.out.println(st0);*/

        String str = "Test1 Test2 Test3 Test4";
        //public String[] split(String regex)
        System.out.println(str);

        for (String s : str.split("T")) {
            if (s.length() != 0) {
                System.out.println(s);

            }

        }

        String line = "aaabccdddc";
        System.out.println( line.chars().distinct().count());

    }
}