package cadastro_usuario1;

public class usuario
{
    private int id;
    private String nome;
    
    // Construtor
    public usuario(int p_id, String p_nome)
    {
        id = p_id;
        nome = p_nome;
    }
    
    // Setters
    public void setId(int i)
    {
        id = i;
    }
    
    public void setNome(String n)
    {
        nome = n;
    }
    
    // Getters
    public int getId()
    {
        return id;
    }
    
    public String getNome()
    {
        return nome;
    }
}
