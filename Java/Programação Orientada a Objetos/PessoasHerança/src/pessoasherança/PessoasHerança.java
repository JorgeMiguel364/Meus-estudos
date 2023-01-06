package pessoasherança;

public class PessoasHerança
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("João");
        p2.setNome("Luis");
        p3.setNome("Roberto");
        p4.setNome("Carlos");
        
        p1.setSexo("M");
        p2.setSexo("M");
        p4.setIdade(31);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
