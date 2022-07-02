
public class Mouse extends Produto {

    protected String tipo;

    public Mouse(String tipo) {

        this.descricao = "Mouse ótico, Saída USB. 1600 dpi, ";
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {

        return this.descricao + this.tipo;
    }
}