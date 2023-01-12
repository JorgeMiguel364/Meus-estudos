package lojaeletronicos;

public class Eletronicos
{
    private int codigo;
    private String descricao;
    private int qtdEstoque;
    private double preco;
    
    // Construtor
    public Eletronicos(int codigo, String descricao, int qtdEstoque, double preco)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }
    
    // Setters
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void setQtdEstoque(int qtdEstoque)
    {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    // Getters
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public String getDescricao()
    {
        return this.descricao;
    }
    
    public int getQtdEstoque()
    {
        return this.qtdEstoque;
    }
    
    public double getPreco()
    {
        return this.preco;
    }
}
