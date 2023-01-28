package cadastroitens;

public class CodigoDuplicado extends RuntimeException
{
    public String toString()
    {
        return "\nCódigo duplicado!\n";
    }
}
