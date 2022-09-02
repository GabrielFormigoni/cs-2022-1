public class LoginTeste {
    public static void main(String[] args) {

        Login login1 = new Login("Gilmar", "123456");
        Login login2 = new Login("Gilmar", "123456");
    
        try {
        login2.fazerLogin("Gilmar", "123456");
        login1.fazerLogin("Gilmar", "casoErrado");        
        }
        catch(LoginInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    
}
