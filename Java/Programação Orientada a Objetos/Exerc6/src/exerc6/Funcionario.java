package exerc6;

public class Funcionario
{
    String nome;
    String cargo;
    String setor;
    int idade;
    float salario;
    
    void imprimir()
    {
        System.out.println("Nome: "+this.nome);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Setor: "+this.setor);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salario: "+this.salario);
    }
}
