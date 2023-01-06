package p2_exerc1;

public class P2_exerc1{

    public static void main(String[] args)
    {
        Turma t1 = new Turma();
        Alunos al1 = new Alunos();
        
        try
        {
            t1.incluirAluno(new Alunos(12345, "Jorge"));
            t1.incluirAluno(new Alunos(62345, "Jorge"));
        }
        catch(RuntimeException erro)
        {
            System.out.println(erro.getMessage());
        }
        
        //t1.buscarAluno(34567);
    }
}
