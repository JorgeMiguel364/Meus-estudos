package cadastroalunos;

public class CadastroAlunos
{

    public static void main(String[] args)
    {
        ListaAlunos la1 = new ListaAlunos(4);
        
        try
        {
            la1.adicionarAluno(new Alunos("José Marcos", 648219));
            la1.adicionarAluno(new Alunos("Carla Borges", 692507));
            la1.adicionarAluno(new Alunos("Renan da Silva", 74692));
            
            la1.adicionarAluno(new Alunos("Bryan Nascimento", 648219));
            
        }catch(RADuplicado | RAInvalido | ListaCheia excp)
        {
            System.out.print(excp);
        }
    }
}
