package atividade_biblioteca;

public class Usuario
{
    private int codigo;
    private String nome;
    private String email;
    private int atrasos;
    
    // Construtor
    public Usuario(int codigo, String nome, String email)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        atrasos = 0;
    }
    
    // Getters
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    // Setters
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
}
