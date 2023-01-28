package cadastroitens;

public class ListaItens
{
    Itens lItens[];
    int i, contador = 0;
    
    public ListaItens(int qtdMax)
    {
        lItens = new Itens[qtdMax];
    }
    
    void cadastrarItem(Itens it)
    {
        for(i=0; i<contador; i++)
        {
            if(lItens[i].getCodigo() == it.getCodigo())
            {
                throw new CodigoDuplicado();
            }
        }
        
        if(lItens.length <= contador)
        {
            throw new ListaCheia();
        }
        else
        {
            lItens[contador] = it;
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("Item: " +lItens[contador].getDescricao());
            System.out.println("Código: " +lItens[contador].getCodigo());
            System.out.print("\n");
            contador++;
        }
    }
}
