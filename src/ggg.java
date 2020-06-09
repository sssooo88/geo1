import java.util.ArrayList;
import java.util.Collections;

public class ggg {
    public static ArrayList dete (ArrayList t, String word){
        Object [] array = t.toArray();
        for (Object x : array){
            if (x == word){
                t.remove(x);
            }
        }
        return t;
    }

    public static ArrayList order (ArrayList t){
        ArrayList<String> test4 = new ArrayList<>(t);
        Collections.reverse(test4);
        t.addAll(test4);
        return t;
    }

    public static int countHighlander (ArrayList t){
        Object [] array = t.toArray();
        for (Object x : array){
            if (t.indexOf(x) != t.lastIndexOf(x)){
                t.remove(t.lastIndexOf(x));
            }
        }
        int count = t.size();
        return count;
    }

    public static ArrayList highlander (ArrayList t){
        Object [] array = t.toArray();
        for (Object x : array){
            if (t.indexOf(x) != t.lastIndexOf(x)){
                t.remove(t.lastIndexOf(x));
            }
        }
        return t;
    }

    public static ArrayList abc (ArrayList t, String word){ // считерил )))

        t.add(word);
        Collections.sort(t);

        return t;
    }
}
