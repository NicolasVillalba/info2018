package ejemplos;

import com.info2018.generics.ComestibleDozen;
import com.info2018.elements.*;

public class GenericsClient {
    public static void main(String[] args) {

        ComestibleDozen<Egg> dozenDeEggs = new ComestibleDozen<>();
        Egg h = new Egg();
        h.getDoubleYolk();
        dozenDeEggs.add(h);
        System.out.println(dozenDeEggs);
    }
}
