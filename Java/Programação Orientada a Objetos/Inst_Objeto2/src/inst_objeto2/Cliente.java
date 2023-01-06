package inst_objeto2;

public class Cliente
{
    
    final int RGmax = 9999;
    final int CPFmax = 9999;
        
    // ----------------- Atributos -----------------
    private String nome;
    private String genero;
    private int RG;
    private int CPF;
    private int idade;
    
    // ----------------- Construtor -----------------
    public Cliente(String nome, String genero, int RG, int CPF, int idade)
    {
        this.nome = nome;
        this.genero = genero;
        this.RG = RG;
        this.CPF = CPF;
        this.idade = idade;
        
        if(RG > RGmax)
        {
            throw new RuntimeException("O RG não pode ultrapassar o valor de " +RGmax);
        }
        else if (CPF > CPFmax)
        {
            throw new RuntimeException("O CPF não pode ultrapassar o valor de " +CPFmax);
        }
    }

    
    // ----------------- Getters -----------------
    public String getNome()
    {
        return this.nome;
    }
    
    public String getGenero()
    {
        return this.genero;
    }
    
    public int getRG()
    {
        return this.RG;
    }
    
    public int getCPF()
    {
        return this.CPF;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    // ----------------- Setters -----------------
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public void setGenero(String g)
    {
        this.genero = g;
    }
    
    public void setRG(int rg)
    {
        this.RG = rg;
    }
    
    public void setCPF(int cpf)
    {
        this.CPF = cpf;
    }
    
    public void setIdade(int i)
    {
        this.idade = i;
    }
    
    // ----------------- Métodos -----------------
    public void imprimir()
    {
        System.out.println("Nome: " +this.getNome());
        System.out.println("Gênero: " +this.getGenero());
        System.out.println("RG: " +this.getRG());
        System.out.println("CPF: " +this.getCPF());
        System.out.println("Idade: " +this.getIdade());
        
        System.out.println("\n---------------------------------\n");
    }
}
