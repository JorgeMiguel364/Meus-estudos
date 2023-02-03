package cadastroalunos;

public class RAInvalido extends RuntimeException
{
    public String toString()
    {
        return "\nO RA informado é inválido!\n";
    }
}
