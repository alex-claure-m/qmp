import org.junit.jupiter.api.Test;

public class GuardarropaTest {

    @Test
    public void agregarAGuardarropa() {
        TipoPrenda remera = new TipoPrenda(Categoria.PARTE_SUPERIOR,"remera");
        TipoPrenda pantalon = new TipoPrenda(Categoria.PARTE_INFERIOR, "pantalon de la onda");
        TipoPrenda zapatilla = new TipoPrenda(Categoria.CALZADO,"zapatillas llanatas");
        TipoPrenda buzo = new TipoPrenda(Categoria.PARTE_SUPERIOR,"buzo");

        Prenda unaPrendaPeola = new Prenda(Color.AMARILLO,Color.CYAN,TipoTela.ALGODON,remera);
        Prenda unaPrendaOff = new Prenda(Color.AMARILLO,Color.AZUL,TipoTela.LANA,buzo);
        Prenda unaPrendaTop = new Prenda(Color.ROJO,Color.VERDE,TipoTela.CUERO,zapatilla);
        Prenda unaPrendaInferior = new Prenda(Color.VERDE,Color.MAGENTA,TipoTela.CUERO,pantalon);

        Guardarropa elRoperoDeNarnia = new Guardarropa();

        elRoperoDeNarnia.agregarPrendas(unaPrendaOff);
        elRoperoDeNarnia.agregarPrendas(unaPrendaPeola);
        elRoperoDeNarnia.agregarPrendas(unaPrendaTop);
        elRoperoDeNarnia.agregarPrendas(unaPrendaInferior);
    }
}
