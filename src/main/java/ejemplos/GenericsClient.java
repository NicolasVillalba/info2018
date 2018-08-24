package ejemplos;
import com.info2018.generics.Docena;
import com.info2018.generics.DocenaComestible;
import com.info2018.elements.*;

public class GenericsClient {
    public static void main(String[] args) {
    	
        DocenaComestible<Huevo> docenaDeHuevos = new DocenaComestible<>();
        Huevo h = new Huevo();
        h.getDobleYema();
        docenaDeHuevos.add(h);
        System.out.println(docenaDeHuevos);
    }
}
