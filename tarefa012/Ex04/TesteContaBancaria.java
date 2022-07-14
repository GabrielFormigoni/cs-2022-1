public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1500.00);
        ContaBancaria conta2 = new ContaBancaria(1500.00);

        try{
        conta1.depositar(5000.00);

        // Da certo
        conta1.sacar(1100.00);

        // Da errado
        conta2.sacar(1800.00);

        }
        catch(SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
