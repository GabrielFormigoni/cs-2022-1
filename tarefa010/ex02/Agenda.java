
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agenda {
    
    private ArrayList<Contato> contatos = new ArrayList<Contato>();



    public ArrayList<Contato> getContatos() {
        return this.contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void addContatos(Contato contato) {
        contatos.add(contato);
    }

    public void inclusaoContato() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do contato.");
        String email = JOptionPane.showInputDialog(null, "Informe o email do contato.");

        contatos.add(new Contato(nome, email));
    }

    public void exclusaoContato() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do contato que será excluído ");

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {

                contatos.remove(contatos.get(i));
                JOptionPane.showMessageDialog(null, "Contato " + nome + " excluído !!!");
            }
        }
    }

    public void consultaContato() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do contato que será consultado ");

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                JOptionPane.showMessageDialog(null, contatos.get(i).consulta());
            }
        }
    }

    public void listaContatos() {
        String retorno = "";

        for (int i = 0; i < contatos.size(); i++) {
            retorno = retorno + "Contato " + (i + 1) + " : \n" + contatos.get(i).consulta();
        }

        JOptionPane.showMessageDialog(null, retorno);
    }

}
