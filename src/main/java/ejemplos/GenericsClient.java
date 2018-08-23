package ejemplos;
import com.info2018.generics.Docena;
import com.info2018.elements.*;

public class GenericsClient {
    public static void main(String[] args) {

        Docena<Huevo> docenaDeHuevos = new Docena<>();
        docenaDeHuevos.add(new Huevo());
        System.out.println(docenaDeHuevos);
    }
}
