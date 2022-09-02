
public class Calcular {

    private Double salario;
    private Double bonificacao;

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonificacao() {
        return this.bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Double calculaSalarioAnual(Double salario, Double bonificacao) {

        double soma = this.salario + this.bonificacao;

        return soma * 12;
    }
}
