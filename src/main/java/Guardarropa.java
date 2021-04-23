import java.util.ArrayList;

public class Guardarropa {
    private ArrayList<Prenda> prenda = new ArrayList<Prenda>(); // por que guardarropa tendra muchas prendas

    public void agregarPrendas(Prenda unaPrenda){
        prenda.add(unaPrenda);
    }

}
