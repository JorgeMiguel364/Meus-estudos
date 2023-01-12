package lojaeletronicos;

public class ListaEletronicos
{
    private Eletronicos listaEletronicos[];
    private int contador;
    
    public ListaEletronicos(int qtdMax)
    {
        listaEletronicos = new Eletronicos[qtdMax];
        contador = 0;
    }
    
    void adicionarEletronicos(Eletronicos eletr)
    {
        // Testa se o código informado pelo usuário já existe ou não
        for(int i=0; i<contador; i++)
        {
            if(listaEletronicos[i].getCodigo() == eletr.getCodigo())
            {
                throw new IndiceDuplicado();
            }
        }
        
        if(contador >= listaEletronicos.length)
        {
            throw new ListaCheia();
        }
        else
        {
            listaEletronicos[contador] = eletr;
            System.out.println("\nItem adicionado com sucesso! - " +eletr.getCodigo());
            contador++;
        }
    }
    
    void retirarEletronicos(int indic, int qtd)
    {
        for(int i=0; i<contador; i++)
        {
            if(listaEletronicos[i].getCodigo() == indic)
            {
                if(listaEletronicos[i].getQtdEstoque() > qtd)
                {
                    listaEletronicos[i].setQtdEstoque(listaEletronicos[i].getQtdEstoque() - qtd);
                    System.out.println("\n" +qtd+ " itens removidos com sucesso! - " +listaEletronicos[i].getCodigo());
                }
                else
                {
                    listaEletronicos[i].setQtdEstoque(0);
                    System.out.println("\nItens zerados! - " +listaEletronicos[i].getCodigo());
                }
                return;
            }
        }
        
        throw new IndiceInvalido();
    }
    
    void incrementarEletronicos(int indic, int qtd)
    {
        for (int i=0; i<contador; i++)
        {
            if(listaEletronicos[i].getCodigo() == indic)
            {
                listaEletronicos[i].setQtdEstoque(listaEletronicos[i].getQtdEstoque() + qtd);
                System.out.println("\n" +qtd+ " itens incrementados com sucesso! - " +listaEletronicos[i].getCodigo());
                return;
            }
        }
        
        throw new IndiceInvalido();
    }
    
    void imprimirEletronicos(int indic)
    {
        for(int i=0; i<contador; i++)
        {
            if(listaEletronicos[i].getCodigo() == indic)
            {
                System.out.println("\nCódigo: " +listaEletronicos[i].getCodigo());
                System.out.println("Descrição: " +listaEletronicos[i].getDescricao());
                System.out.println("Quantidade: " +listaEletronicos[i].getQtdEstoque());
                System.out.println("Preço: " +listaEletronicos[i].getPreco());
                return;
            }
        }
        
        throw new IndiceInvalido();
    }
    
    void relatorioGeral()
    {
        for(int i=0; i<contador; i++)
        {
            System.out.println("\nCódigo: " +listaEletronicos[i].getCodigo());
            System.out.println("Descrição: " +listaEletronicos[i].getDescricao());
            System.out.println("Quantidade: " +listaEletronicos[i].getQtdEstoque());
            System.out.println("Preço: " +listaEletronicos[i].getPreco());
        }
    }
}
