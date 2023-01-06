
package exerc7;

public class Bicicleta{
    
    String cor;
    String tamanho;
    float preco;
    boolean farol;
    boolean freio;
    
    void status()
    {
        System.out.println("Cor: " +this.cor);
        System.out.println("Tamanho: " +this.tamanho);
        System.out.println("Preço: " +this.preco);
        System.out.println("Possui farol?: " +this.farol);
        System.out.println("Possui freio?: " +this.freio);
    }
    
    void andar()
    {
        System.out.println("Pedalando...");
    }
    
    void frear()
    {
        if (this.freio == false)
            System.out.println("A bicicleta não possui freios!");
        else
            System.out.println("Freando...");
    }
}
