package lojabrinquedos;

public class Brinquedos
{
    private int codigo;
    private String descricao;
    private int quantidadeEstoque;
    private float preco;
    
    public Brinquedos(int codigo, String descricao, int quantidadeEstoque, float preco)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }
    
    // *********************** Setters ***********************
    public void setCodigo(int c)
    {
        this.codigo = c;
    }
    
    public void setDescricao(String d)
    {
        this.descricao = d;
    }
    
    public void setQuantidadeEstoque(int qe)
    {
        this.quantidadeEstoque = qe;
    }
    
    public void setPreco(float p)
    {
        this.preco = p;
    }
    
    // *********************** Getters ***********************
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public int getQuantidadeEstoque()
    {
        return quantidadeEstoque;
    }
    
    public float getPreco()
    {
        return preco;
    }    
}
