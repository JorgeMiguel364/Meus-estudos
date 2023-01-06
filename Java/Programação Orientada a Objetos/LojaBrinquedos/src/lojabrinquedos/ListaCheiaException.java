package lojabrinquedos;

public class ListaCheiaException extends RuntimeException
{

    public String toString()
    {
        return "\nQuantidade insuficiente no estoque\n";
    }
}
