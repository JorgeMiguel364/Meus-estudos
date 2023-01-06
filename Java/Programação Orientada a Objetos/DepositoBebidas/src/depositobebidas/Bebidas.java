package depositobebidas;

public class Bebidas
{
    private int codigoBebida;
    private String descricao;
    private double preco;
    
    public Bebidas(int codigoBebida, String descricao, double preco)
    {
        this.codigoBebida = codigoBebida;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    // Setters    
    public void setCodigoBebidas(int cb)
    {
        this.codigoBebida = cb;
    }
    
    public void setDescricao(String desc)
    {
        this.descricao = desc;
    }
    
    public void setPreco(double prec)
    {
        this.preco = prec;
    }
    
    // Getters    
    public int getCodigoBebidas()
    {
        return codigoBebida;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public double getPreco()
    {
        return preco;
    }
}
