public class Personagem{
    //atributos eou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamentos(metodo)
    void cacar(){
        System.out.println(nome + " cacando");
    }
    void comer(){
        System.out.println(nome + " comendo");
    }
    void dormir(){
        System.out.println(nome + " dormindo");
    }
}