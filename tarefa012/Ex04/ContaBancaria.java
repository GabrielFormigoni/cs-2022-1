public class ContaBancaria {
    
    private Double saldo;


    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double val) {
        this.saldo += val;
        System.out.println(val + " depositado com sucesso! \nSeu novo saldo é: " + this.saldo);
    }

    public void sacar(Double val) throws SaldoInsuficienteException{

        if(val <= this.getSaldo()) {
            this.saldo -= val;
            System.out.println(val + " retirado com sucesso!\nSeu novo saldo é: " + this.saldo);
        }

        else {
            throw new SaldoInsuficienteException("\nSaldo insuficiente!");
        }
    }
}
