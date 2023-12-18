import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String var = "mayur";
       String str = printHello(var);
        System.out.println("str" + str);

        Set s = new TreeSet();
        s.add("2");
        s.add("3");
        s.add("1");
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }

        new Thread(new Test()).run();
    }

    private static String printHello(String var) {
        return var;
    }
}

class Test implements Runnable{

    @Override
    public void run() {

    }
}


