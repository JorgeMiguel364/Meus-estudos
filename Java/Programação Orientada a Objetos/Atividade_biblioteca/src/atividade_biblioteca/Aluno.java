package atividade_biblioteca;

public class Aluno extends Usuario
{
    private int RA;
    
    // Construtor
    public Aluno(int codigo, String nome, String email, int RA)
    {
        super(codigo, nome, email);
        this.RA = RA;
    }
    
    // Getters    
    public int getRA()
    {
        return this.RA;
    }
    
    // Setters
    public void setRA(int RA)
    {
        this.RA = RA;
    }
}
