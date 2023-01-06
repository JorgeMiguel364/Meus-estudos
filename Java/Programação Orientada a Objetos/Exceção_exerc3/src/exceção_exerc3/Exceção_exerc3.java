package exceção_exerc3;

public class Exceção_exerc3
{
    public static void main(String[] args)
    {
        exerc3a a1 = new exerc3a();
        a1.setNome("Mateus Alves Henrique");
        a1.setIdade(19);
        
        try
        {
            a1.imprimir();
        }
        catch(IdadeInvalida1_Exception excp1)
        {
            System.out.println(excp1);
        }
        catch(IdadeInvalida2_Exception excp2)
        {
            System.out.println(excp2);
        }
    }
}
