
import javax.swing.JOptionPane;


public class AgendaTeste {
    
    public static void main(String[] args)  {

    	 Agenda app = new Agenda();
    	 
         int opcoes = 0;

             while (opcoes != 5) {

                 opcoes = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "----------------------------------------------------\n"
                 + "| Digite 1 para adicionar um contato:\n"
                 + "| Digite 2 para consultar um contato:\n"
                 + "| Digite 3 para excluir um contato:\n"
                 + "| Digite 4 para listar os contatos: \n"
                 + "| Digite 5 para sair:\n"
                 +"----------------------------------------------------"
                 ));
                 
                 if(opcoes == 1) {
                	 app.inclusaoContato();
                 }

                 if(opcoes == 2) {
                	 app.consultaContato();
                 }

                 if(opcoes == 3) {
                	 app.exclusaoContato();
                 }
                 
                 if(opcoes == 4) {
                	 app.listaContatos();
                 }


             }
    }
}

