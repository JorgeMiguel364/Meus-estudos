package lojaeletronicos;

public class IndiceDuplicado extends RuntimeException
{
    public String toString()
    {
        return "\nO código informado já existe!\n";
    }
}
