package lojabrinquedos;

public class IndiceInvalidoException extends RuntimeException
{   
    public String toString()
    {
        return "\nCódigo interno inválido\n";
    }
}
