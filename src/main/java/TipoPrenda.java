public class TipoPrenda {
    private Categoria categoria; //entiendo que la categoria va segun el tipo
    //tipo puede: ser camisa, zapato,pantalon,etcs
    private String nombreTipo;

    public TipoPrenda(Categoria categoria, String nombreTipo) {
        this.categoria = categoria;
        this.nombreTipo = nombreTipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

}
