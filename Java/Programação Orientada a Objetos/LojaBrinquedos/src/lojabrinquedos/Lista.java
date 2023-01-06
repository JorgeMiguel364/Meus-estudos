package lojabrinquedos;

public class Lista
{
    Brinquedos list[];
    int cont;
    
    public Lista(int qtMaxima)
    {
        list = new Brinquedos[qtMaxima];
        cont = 0;
    }
    
    int adicionarBrinquedos(Brinquedos bq)
    {
        if(list.length <= cont)
        {
            throw new ListaCheiaException();
        }
        else
        {
            list[cont] = bq;
            cont++;
            return cont-1;
        }
    }
    
    void retirarUnidades(int codInter, int qtd)
    {
        for(int i=0; i<cont; i++)
        {
            if(list[i].getCodigo() == codInter)
            {
                if(list[i].getQuantidadeEstoque() < qtd)
                {
                    throw new QuantidadeInsuficienteException();
                }
                else
                {
                    list[i].setQuantidadeEstoque(list[i].getQuantidadeEstoque() - qtd);
                    return;
                }
            }
        }
        throw new IndiceInvalidoException();
    }
    
    void acrescentarBrinquedos(int codInter, int qtd)
    {
        for(int i=0; i<cont; i++)
        {
            if(list[i].getCodigo() == codInter)
            {
                list[i].setQuantidadeEstoque(list[i].getQuantidadeEstoque() + qtd);
                return;
            }
        }
        throw new IndiceInvalidoException();
    }
    
    void imprimirBrinquedo(int codInter)
    {
        for(int i=0; i<cont; i++)
        {
            if(list[i].getCodigo() == codInter)
            {
                System.out.println("\nCódigo: " +list[i].getCodigo());
                System.out.println("Descrição: " +list[i].getDescricao());
                System.out.println("Quantidade em estoque: " +list[i].getQuantidadeEstoque());
                System.out.println("Preço: " +list[i].getPreco());
                return;
            }
        }
        
        throw new IndiceInvalidoException();
    }
    
    void relatorioGeral()
    {
        for(int i=0; i<cont; i++)
        {
            System.out.println("\nCódigo: " +list[i].getCodigo());
            System.out.println("Descrição: " +list[i].getDescricao());
            System.out.println("Quantidade em estoque: " +list[i].getQuantidadeEstoque());
            System.out.println("Preço: " +list[i].getPreco());
        }
    }
}
