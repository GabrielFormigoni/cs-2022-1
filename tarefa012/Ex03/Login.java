public class Login {
    
    private String usuario;
    private String senha;


    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException{

        
        if(this.getUsuario().equals(usuario) && this.getSenha().equals(senha)) {
            System.out.println("Tudo certo!");
            return true;
        }

        else
        {
            throw new LoginInvalidoException("O usuário ou senha não são compatíveis.");
        }

    }
}
