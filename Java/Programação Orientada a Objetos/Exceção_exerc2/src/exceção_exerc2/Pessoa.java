package exceção_exerc2;

public class Pessoa
{
    private String nome;
    private int idade;
    private int CPF;
    private int RG;
    
    // Nome
    public void setNome(String NM)
    {
        nome = NM;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    // Idade
    public void setIdade(int ID)
    {
        idade = ID;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    // CPF    
    public void setCPF(int CPF)
    {
        this.CPF = CPF;
    }
    
    public int getCPF()
    {
        return CPF;
    }
    
    // RG
    public void setRG(int RG)
    {
        this.RG = RG;
    }
    
    public int getRG()
    {
        return RG;
    }
}
