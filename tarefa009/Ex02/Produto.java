
public class Produto {

    protected String nomeLoja;
    protected Double preco;
    protected String descricao;


    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return "Produto de informática";
    }
}