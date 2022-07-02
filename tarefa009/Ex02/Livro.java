
public class Livro extends Produto {

    protected String autor;

    public Livro(String autor) {

        this.descricao = "Morte no Nilo, Mistério de Assassinato, publicado em 1943, por ";
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getDescricao() {

        return this.descricao + this.autor;
    }
}