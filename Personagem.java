public class Personagem{
    //atributos eou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamentos(metodo)
    void cacar(){
        if (energia >=2){
        System.out.println(nome + " cacando");
        energia-= 2;
        }
        else{
        System.out.println("esta sem energia para cacar");
        }
        fome = Math.min(fome+ 1 , 10);
        sono =Math.min(fome+ 1 , 10);
    }
    void comer(){
        if (fome > 0){
        System.out.println(nome + " comendo");
        energia-= 2;
        }
        else{
        fome = Math.min(fome- 1 , 10);
        energia =Math.min(energia+ 1 , 10);

        }
        
    }
    void dormir(){
        
        //System.out.println(nome + " dormindo");
    }
}