package exerc8;

public class Paciente
{
    public String nome;
    public int idade;
    public String comorbidade;
    
    public void imprimir()
    {
        System.out.println("Nome: " +nome);
        System.out.println("Comorbidade: " +comorbidade);
        System.out.print("Idade: " +idade+ " -> ");
        
        if (idade <= 14)
            System.out.println("É uma criança.");
        else if ((idade >= 15) && (idade <= 21))
            System.out.println("É um adolescente.");
        else if ((idade >= 22) && (idade <= 64))
            System.out.println("É um adulto.");
        else
            System.out.println("É um idoso.");
        
        System.out.print("\n");
    }
}
