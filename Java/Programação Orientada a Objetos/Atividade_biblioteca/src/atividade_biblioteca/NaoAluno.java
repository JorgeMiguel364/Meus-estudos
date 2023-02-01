package atividade_biblioteca;

public class NaoAluno extends Usuario
{
    private int RG;
    private int tel;
    
    // Construtor
    public NaoAluno(int codigo, String nome, String email, int RG, int tel)
    {
        super(codigo, nome, email);
        this.RG = RG;
        this.tel = tel;
    }
    
    // Getters
    public int getRG()
    {
        return this.RG;
    }
    
    public int getTel()
    {
        return this.tel;
    }
    
    // Setters
    public void setRG(int RG)
    {
        this.RG = RG;
    }
    
    public void setTel(int tel)
    {
        this.tel = tel;
    }
}
