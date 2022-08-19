
public class Professor extends Person {

    private String formacao;
    private Double salario;

    public Professor(String nome, String formacao, Double salario) {

        super(nome);
        this.formacao = formacao;
        this.salario = salario;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
