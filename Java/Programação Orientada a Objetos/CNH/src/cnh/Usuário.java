package cnh;

public class Usuário
{
    private int idade;
    private String nome;
    private int cnh;
    
    // Setters
    public void setIdade(int id)
    {
        if(id < 18)
        {
            System.out.println("O usuário não tem idade para dirigir!");
            System.exit(0);
        }
        else
            this.idade = id;
    }
    
    public void setNome(String nom)
    {
        this.nome = nom;
    }
    
    public void setCnh(int cnh)
    {
        this.cnh = cnh;
    }
    
    //Getters
    public int getIdade()
    {
        return this.idade;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getCnh()
    {
        return this.cnh;
    }
}
