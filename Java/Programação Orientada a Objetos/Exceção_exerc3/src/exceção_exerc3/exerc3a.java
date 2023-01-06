package exceção_exerc3;

public class exerc3a
{
    private String nome;
    private int idade;
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void imprimir() throws IdadeInvalida1_Exception, IdadeInvalida2_Exception
    {
        System.out.println("Nome: " +nome);
        if(idade >= 18)        
            System.out.println("Cadastro realizado com sucesso!");        
        else if((idade <= 17) && (idade >= 0))
            throw new IdadeInvalida1_Exception();
        else
            throw new IdadeInvalida2_Exception();
    }
}
