import java.util.Objects;

public class Prenda {
    //
    private Color colorPrimero;
    private Color colorSecundario;
    private TipoTela tipoTela;
    private TipoPrenda tipoPrenda;

    public Prenda(Color colorPrimero, Color colorSecundario, TipoTela tipoTela, TipoPrenda tipoPrenda) {
        this.colorPrimero = Objects.requireNonNull(colorPrimero, "si o si debe tener color secundario");;
        this.tipoTela = Objects.requireNonNull(tipoTela,"si o si debe tener tipo de tela");
        this.tipoPrenda = Objects.requireNonNull(tipoPrenda,"no puede no tener tipo de prenda");
    }

    public Color getColorPrimero() {
        return colorPrimero;
    }

    public TipoTela getTipoTela() {
        return tipoTela;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}
