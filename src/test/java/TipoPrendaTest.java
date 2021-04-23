import org.junit.jupiter.api.Test;

public class TipoPrendaTest {
    @Test
    public void remeraDeAlgodonSacoConCategoriaPrendaSuperior() {
        TipoPrenda remera = new TipoPrenda(Categoria.PARTE_SUPERIOR,"remera");
        TipoPrenda pantalon = new TipoPrenda(Categoria.PARTE_INFERIOR, "pantalon de la onda");
        TipoPrenda zapatilla = new TipoPrenda(Categoria.CALZADO,"zapatillas llanatas");
    }


}
