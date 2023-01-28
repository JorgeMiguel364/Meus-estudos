package cadastroitens;

public class Itens
{
    private int codigo;
    private String descricao;
    
    public Itens(int codigo, String descricao)
    {
        this.codigo = codigo;
        this.descricao = descricao;
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
    
    // Getters
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
}
