public class Personagem{
    //atributos eou propriedades
    private String nome;
    private int energia;
    private int fome;
    private int sono;
    //construtor padrao
    Personagem (String nome){
        this.nome = nome;
    }
    Personagem (String nome ,int energia, int fome , int sono){
        this.nome = nome;
        if(energia>=0 &&energia <=10){
            this.energia = 10;
        }
        if(fome>=0 &&fome <=10){
            this.fome = 10;
        if(sono>=0 &&sono <=10){
            this.sono = 10;
        }
    }
        
    }
    
    //comportamentos(metodo)
    void cacar(){
        if (energia >=2){
        System.out.println(nome + " cacando");
        energia =Math.min(energia - 1 , 10);
        }
        else{
        System.out.println(nome +" esta sem energia para cacar");
        }
        fome = Math.min(fome+ 1 , 10);
        sono =Math.min(sono+ 1 , 10);
    }
    void comer(){
        if (fome >= 1){
        System.out.println(nome + " comendo");
        energia =Math.min(energia + 2 , 10);
        }
        else{
        System.out.println(nome + " esta sem fome");
        fome = Math.min(fome- 1 , 10);
        energia =Math.min(energia+ 1 , 10);

        }
        
    }
    void dormir(){
        if (sono >= 1){
           System.out.println(nome + " dormindo"); 
           energia =Math.min(energia + 1 , 10);
        }
        else{
        System.out.println(nome + "esta sem sono");
        sono = Math.min(sono - 1 , 10);
        energia =Math.min(energia- 1 , 10);
    }
    }
    void exibirEstado(){
        System.out.printf(
          "%s: e: %d, f: %d, s: %d\n",
          nome,
          energia,
          fome,
          sono
        );
      }
}