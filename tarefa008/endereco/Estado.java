package endereco;

public class Estado {
    private String sigla;
    private String nome;
    private Pais pais;


    public Estado(String sigla, String nome, Pais pais) {
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
    }


    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
