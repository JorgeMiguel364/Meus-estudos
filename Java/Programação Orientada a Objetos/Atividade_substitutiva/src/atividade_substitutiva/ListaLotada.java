package atividade_substitutiva;

public class ListaLotada extends RuntimeException
{
    public String toString()
    {
        return "A lista atingiu seu limite máximo!\n";
    }
}
