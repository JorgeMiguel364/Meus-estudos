package exerc11;

public class Moto
{
    private String modelo;
    private int ano;
    private String cor;
    
    // Getters
    public String getModelo()
    {
        return this.modelo;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    //Setters
    public void setModelo(String m)
    {
        this.modelo = m;
    }
    
    public void setAno(int a)
    {
        this.ano = a;
    }
    
    public void setCor(String c)
    {
        this.cor = c;
    }
    
    /*
    public void Imprimir()
    {
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ano: " +this.ano);
        System.out.println("Cor: " +this.cor);
    }*/
}
