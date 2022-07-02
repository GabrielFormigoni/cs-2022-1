import java.util.ArrayList;
import javax.swing.JOptionPane;
 
 public class ProdutoTeste {

    public static void main(String[] args) {

        ArrayList<Produto> carrinho = new ArrayList<Produto>();

        int opcoes = 0;
        String tipo, autor; 

            while (opcoes != 3) {

                opcoes = Integer.parseInt(JOptionPane.showInputDialog(null,
                "----------------------------------------------------\n"
                + "| Digite 1 para adicionar um mouse ao carrinho:\n"
                + "| Digite 2 para adicionar um livro ao carrinho:\n"
                + "| Digite 3 para sair:\n"
                +"----------------------------------------------------"
                ));


                if(opcoes == 1) {
                    tipo = JOptionPane.showInputDialog("Entre com o tipo do mouse:");
                    carrinho.add(new Mouse(tipo));
                }

                if(opcoes == 2) {
                    autor = JOptionPane.showInputDialog("Entre com o autor do livro:");
                    carrinho.add(new Livro(autor));
                }
        }

            for(int i = 0; i < carrinho.size(); i++){
                JOptionPane.showMessageDialog(null, carrinho.get(i).getDescricao());

            }
    }
 }