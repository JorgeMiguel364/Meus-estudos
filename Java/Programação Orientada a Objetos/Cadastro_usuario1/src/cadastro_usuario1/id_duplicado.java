package cadastro_usuario1;

public class id_duplicado extends RuntimeException
{
    public String toString()
    {
        return "\nO ID cadastrado já existe!\n";
    }
}
