package tecelagem_meucodigo;

public class Venda extends Funcionario
{
    private double venda = 0;
    
    public void registrarVenda(double valor)
    {
        venda += valor;
    }
}
