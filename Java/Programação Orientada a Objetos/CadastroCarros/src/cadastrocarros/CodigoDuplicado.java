package cadastrocarros;

public class CodigoDuplicado extends RuntimeException
{
    public String toString()
    {
        return "\nO código informado já existe!\n";
    }
}
