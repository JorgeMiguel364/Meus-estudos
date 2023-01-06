package sistemaalunos;

public class Alunos
{
    private int codigo;
    private int RA;
    private String nome;
    private String curso;
    private boolean cursando;
    
    public Alunos(int codigo, int RA, String nome, String curso, boolean cursando)
    {
        this.codigo = codigo;
        this.RA = RA;
        this.nome = nome;
        this.curso = curso;
        this.cursando = cursando;
    }
    
    // ---------------- Setters ----------------
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public void setRA(int RA)
    {
        this.RA = RA;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
    public void setCursando(boolean cursando)
    {
        this.cursando = cursando;
    }
    
    // ---------------- Getters ----------------
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public int getRA()
    {
        return this.RA;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getCurso()
    {
        return this.curso;
    }
    
    public boolean getCursando()
    {
        return this.cursando;
    }
}
