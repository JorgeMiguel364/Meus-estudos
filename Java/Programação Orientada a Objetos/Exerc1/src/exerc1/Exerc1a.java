package exerc1;

public class Exerc1a
{
    private int idade2;
    private String nome2;
    
    public Exerc1a(String nome1, int idade1)
    {
        idade2=idade1;
        nome2=nome1;
    }
    
    public void imprimir()
    {
        System.out.println("Idade: " +idade2);
        System.out.println("Nome: " +nome2);
    }
}
