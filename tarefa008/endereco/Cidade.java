package endereco;

public class Cidade {
    
    private String nome;
    private Cidade cidade;


    public Cidade(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


}
