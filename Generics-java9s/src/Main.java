import bounded.Liquid;
import com.java9s.tutorials.java.generics.Glass;
import com.java9s.tutorials.java.generics.Juice;
import inhertanceAndSubType.WineGlass;

/**
 * @author pankaj
 */
public class Main {

    public static void main(String[] args) {

        Glass<Juice> glass = new WineGlass<Juice>();
        Glass<Liquid> liquidGlass = new WineGlass<Juice>();


    }

}
