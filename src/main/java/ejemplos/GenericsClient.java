package ejemplos;
import com.info2018.generics.Docena;
import com.info2018.generics.DocenaComestible;
import com.info2018.elements.*;

public class GenericsClient {
    public static void main(String[] args) {

        Docena<Huevo> docenaDeHuevos1 = new Docena<>();
    	
        DocenaComestible<Huevo> docenaDeHuevos = new DocenaComestible<>();
        
        Huevo h = new Huevo();
        Huevo.Size b = Huevo.Size.CHICO;
        docenaDeHuevos.add(h);
        System.out.println(docenaDeHuevos);
    }
}
