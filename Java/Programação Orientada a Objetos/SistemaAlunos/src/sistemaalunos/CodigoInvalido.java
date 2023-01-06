package sistemaalunos;

public class CodigoInvalido extends RuntimeException
{
    public String toString()
    {
        return "\nO código informado é inválido\n";
    }
}
