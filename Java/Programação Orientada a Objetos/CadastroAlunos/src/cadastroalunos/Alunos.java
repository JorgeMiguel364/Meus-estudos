package cadastroalunos;

public class Alunos
{
    private String nomeAluno;
    private int RA;
    
    public Alunos(String nomeAluno, int RA)
    {
        this.nomeAluno = nomeAluno;
        this.RA = RA;
    }
    
    // Getters    
    public String getNomeAluno()
    {
        return nomeAluno;
    }
    
    public int getRA()
    {
        return RA;
    }
    
    // Setters
    public void setNomeAluno(String nomeAluno)
    {
        this.nomeAluno = nomeAluno;
    }
    
    public void setRA(int RA)
    {
        this.RA = RA;
    }
}
