package exerc8;

public class Exerc8{

    public static void main(String[] args)
    {
        Paciente p1 = new Paciente();
        p1.nome = "José Eusébio da Silva";
        p1.idade = 31;
        p1.comorbidade = "Pressão alta";
        p1.imprimir();
        
        Paciente p2 = new Paciente();
        p2.nome = "Luis Amando de Souza";
        p2.idade = 69;
        p2.comorbidade = "Câncer";
        p2.imprimir();
    }
    
}
