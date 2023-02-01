package farmacia;

public class CodigoInexistente extends RuntimeException
{
    public String toString()
    {
        return "\nO código informado não existe!\n";
    }
}
