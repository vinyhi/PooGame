public class Personagem{
    //atributos eou propriedades
    String nome;
    int energia=10;
    int fome=0;
    int sono=0;
    //comportamentos(metodo)
    void cacar(){
        if (energia >=2){
        System.out.println(nome + " cacando");
        energia-= 2;
        }
        else{
        System.out.println(nome +" esta sem energia para cacar");
        }
        fome = Math.min(fome+ 1 , 10);
        sono =Math.min(sono+ 1 , 10);
    }
    void comer(){
        if (fome > 0){
        System.out.println(nome + " comendo");
        energia-= 2;
        }
        else{
        System.out.println(nome + " esta sem fome");
        fome = Math.min(fome- 1 , 10);
        energia =Math.min(energia+ 1 , 10);

        }
        
    }
    void dormir(){
        if (sono > 0){
           System.out.println(nome + " dormindo"); 
           energia =Math.min(energia + 1 , 10);
        }
        else{
        System.out.println(nome + "esta sem sono");
        sono = Math.min(sono + 1 , 10);
        energia =Math.min(energia- 1 , 10);
    }
    }
}