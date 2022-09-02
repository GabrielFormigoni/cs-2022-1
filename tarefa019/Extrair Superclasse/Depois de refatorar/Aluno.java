
public class Aluno extends Person {

    private String curso;

    public Aluno(String nome, String curso) {

        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
