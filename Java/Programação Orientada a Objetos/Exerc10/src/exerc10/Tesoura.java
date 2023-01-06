package exerc10;

public class Tesoura
{
    private String cor;
    private String tamanho;
    private String modelo;
    
    public void setCor(String c)
    {
        this.cor = c;
    }
    
    public void setTamanho(String t)
    {
        this.tamanho = t;
    }
    
    public void setModelo(String m)
    {
        this.modelo = m;
    }
    
    public void imprimir()
    {
        System.out.println("Cor: " +this.cor);
        System.out.println("Tamanho: " +this.tamanho);
        System.out.println("Modelo: " +this.modelo);
    }
}
