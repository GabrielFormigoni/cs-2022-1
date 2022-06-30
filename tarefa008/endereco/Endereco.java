package endereco;

public class Endereco {
    
    private int numero;
    private String complemento;
    private int CEP;
    private Logradouro logradouro;
    private TipoEndereco tipoEndereco;


    public Endereco(int numero, String complemento, int CEP, Logradouro logradouro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.tipoEndereco = tipoEndereco;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCEP() {
        return this.CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public Logradouro getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public TipoEndereco getTipoEndereco() {
        return this.tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
    



}
