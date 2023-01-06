package tecelagem_meucodigo;

public class Administrativo extends Funcionario
{
    private int faltas = 0;
    
    public void registrarFalta()
    {
        faltas++;
    }
}
