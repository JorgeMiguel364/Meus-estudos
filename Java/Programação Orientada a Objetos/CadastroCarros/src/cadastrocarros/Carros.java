package cadastrocarros;

public class Carros
{
    private String modelo;
    private int ano;
    private double preco;
    private int codigo;
    
    public Carros(String modelo, int ano, double preco, int codigo)
    {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.codigo = codigo;
    }
    
    // Getters    
    public String getModelo()
    {
        return modelo;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public double getPreco()
    {
        return preco;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    //Setters
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
}
