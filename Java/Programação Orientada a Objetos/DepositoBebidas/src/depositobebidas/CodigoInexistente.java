package depositobebidas;

public class CodigoInexistente extends RuntimeException
{
    public String toString()
    {
        return "\nCódigo inexistente!\n";
    }
}
