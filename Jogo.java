import javax.swing.TransferHandler.TransferSupport;

public class Jogo{

    public static void main (String[]args  )throws Exception{
        var personagem = new Personagem();
        personagem.nome ="joseph";
        while (true){
            personagem.cacar();
            personagem.comer();
            personagem.dormir(); 
            System.out.printf("fome %d energia %d sono %d ",personagem.fome, personagem.energia, personagem.sono);
            System.out.println("\n************");
            Thread.sleep(5000);
           
            
        }
    }
}