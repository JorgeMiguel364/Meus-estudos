package exceção_exerc3;

public class IdadeInvalida1_Exception extends Exception
{
    @Override
    public String toString()
    {
        return "Só é permitido o cadastro de usuários acima de 18 anos!";
    }
}
