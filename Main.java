//Nessa atividade nos tivemos que fazer um "Chat" utilizando o comando JOptionPane
import javax.swing.JOptionPane;


public class Simpq {

    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Digite seu nome");
       JOptionPane.showMessageDialog(null, "Bem vindo, "+nome);
       String idade = JOptionPane.showInputDialog("Digite sua idade");
       String msg = "Que legal "+nome+", você tem "+idade+" anos";
       JOptionPane.showMessageDialog(null, msg);
       String rl = JOptionPane.showInputDialog("Qual o contrário de papelada?");
       if(rl.equals("pavestida")){
            JOptionPane.showMessageDialog(null, "Acertou!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Errou!");
        }
    }  
}
