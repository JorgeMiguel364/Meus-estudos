package cadastroalunos;

public class RADuplicado extends RuntimeException
{
    public String toString()
    {
        return "\nO RA informado já existe!\n";
    }
}
