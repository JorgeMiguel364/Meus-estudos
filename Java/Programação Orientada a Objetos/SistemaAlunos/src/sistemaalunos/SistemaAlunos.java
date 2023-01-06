package sistemaalunos;

public class SistemaAlunos
{

    public static void main(String[] args)
    {
        ListaAlunos la1 = new ListaAlunos(4);
        
        try
        {
            la1.adicionarAluno(new Alunos(365, 120044, "José Reinaldo", "Engenharia ambiental", true));
            
            //la1.imprimirAluno(365);
            //la1.imprimirAluno(654);            
            
        } catch(CodigoInvalido | ListaCheia excpt)
        {
            System.out.print(excpt);
        }
    }    
}
