package maioridade1;

public class maioridade2
{
    private String nome;
    private int idade;
    
    public maioridade2(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void imprimir()
    {
        System.out.println(
                "Nome: " +nome+ "\n"+
                "Idade: " +idade+ "\n");
        
        if (idade >= 18)
            System.out.println("Maior de idade!\n");
        else
            System.out.println("Menor de idade!\n");
    }
}
