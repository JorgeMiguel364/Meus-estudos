package tecelagem_meucodigo;

public class Funcionario
{
    private String nome;
    private int RG;
    private double salario_base;
    
    public void Funcionario(String nome, int RG, double salario_base)
    {
        this.nome = nome;
        this.RG = RG;
        this.salario_base = salario_base;
    }
    
    // Nome
    public void setNome(String nomeP)
    {
        nome = nomeP;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    // RG
    public void setRG(int RGP)
    {
        RG = RGP;
    }
    
    public int getRG()
    {
        return RG;
    }
    
    // Salário base
    public void setSalario_base(double salario_baseP)
    {
        salario_base = salario_baseP;
    }
    
    public double getSalario_base()
    {
        return salario_base;
    }
    
    // ***********************************************
    
    public double salarioLiquido()
    {
        return salario_base;
    }
    
    public void hollerith()
    {
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("");
    }
    
    public void novoMes()
    {
        
    }
}
