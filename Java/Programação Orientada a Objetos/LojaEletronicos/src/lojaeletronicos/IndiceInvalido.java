package lojaeletronicos;

public class IndiceInvalido extends RuntimeException
{
    public String toString()
    {
        return "\nO índice informado não existe!\n";
    }
}
