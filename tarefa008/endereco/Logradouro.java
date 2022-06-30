package endereco;

public class Logradouro {
  


    private String nome;
    private TipoLogradouro Tipologradouro;


    public Logradouro(String nome, TipoLogradouro Tipologradouro) {
        this.nome = nome;
        this.Tipologradouro = Tipologradouro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipologradouro() {
        return this.Tipologradouro;
    }

    public void setTipologradouro(TipoLogradouro Tipologradouro) {
        this.Tipologradouro = Tipologradouro;
    }

}
