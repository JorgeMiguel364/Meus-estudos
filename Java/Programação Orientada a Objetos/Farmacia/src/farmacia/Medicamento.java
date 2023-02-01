package farmacia;

public class Medicamento
{
    private String descricao;
    private double preco;
    private int codigo;
    private int qtdEstoque;
    
    public Medicamento(String descricao, double preco, int codigo, int qtdEstoque)
    {
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
        this.qtdEstoque = qtdEstoque;
    }
    
    // Getters
    public String getDescricao()
    {
        return descricao;
    }
    
    public double getPreco()
    {
        return preco;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public int getQtdEstoque()
    {
        return qtdEstoque;
    }
    
    // Setters
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public void setQtdEstoque(int qtdEstoque)
    {
        this.qtdEstoque = qtdEstoque;
    }
}
