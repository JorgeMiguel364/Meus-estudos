package exceção_exerc1;

public class Exceção_exerc1{

    public static void main(String[] args)
    {
        exerc1a e1 = new exerc1a();
        e1.setPreco(40);
        e1.setValor_a_pagar(37);
        
        try
        {
            e1.pagar();
        }catch(Exception exc)
        {
            System.out.println("Seu dinheiro é insuficiente para pagar!");
        }
    }
}
