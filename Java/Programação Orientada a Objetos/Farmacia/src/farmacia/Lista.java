package farmacia;

import java.text.DecimalFormat;

public class Lista
{
    Medicamento lista[];
    int contador, i;
    
    DecimalFormat dec = new DecimalFormat("0.00");
    
    public Lista(int capacidadeMax)
    {
        lista = new Medicamento[capacidadeMax];
        contador = 0;
    }
    
    void adicionarMedic(Medicamento med)
    {
        for(i=0; i<contador; i++)
        {
            if(med.getCodigo() == lista[i].getCodigo())
            {
                throw new CodigoDuplicado();
            }
        }
        
        if(lista.length <= contador)
        {
            throw new ListaCheia();
        }
        else
        {
            lista[contador] = med;
            
            System.out.println(lista[contador].getCodigo()+ " - Medicamento adicionado com sucesso!");
            contador++;
        }
    }
    
    void retirarUnidades(int codigo, int qtd)
    {
        for(i=0; i<contador; i++)
        {
            if(lista[i].getCodigo() == codigo)
            {
                if(qtd >= lista[i].getQtdEstoque())
                {
                    lista[i].setQtdEstoque(0);
                    System.out.println(lista[i].getCodigo()+ " - Medicamento zerado!");
                }
                else
                {
                    lista[i].setQtdEstoque(lista[i].getQtdEstoque() - qtd);
                    System.out.println(lista[i].getCodigo()+ " - " +qtd+ " item(s) zerado(s)!");
                }
                
                return;
            }
        }
        
        throw new CodigoInexistente();
    }
    
    void acrescentarUnidades(int codigo, int qtd)
    {
        for(i=0; i<contador; i++)
        {
            if(lista[i].getCodigo() == codigo)
            {
                lista[i].setQtdEstoque(lista[i].getQtdEstoque() + qtd);
                System.out.println(lista[i].getCodigo()+ " - " +qtd+ " item(s) acrescentado(s)!");
                return;
            }
        }
        
        throw new CodigoInexistente();
    }
    
    void imprimirMedicamento(int codigo)
    {
        for(i=0; i<contador; i++)
        {
            if(lista[i].getCodigo() == codigo)
            {
                System.out.println("\n- Imprimir medicamento -\n");
                System.out.println("Código: " +lista[i].getCodigo());
                System.out.println("Descrição: " +lista[i].getDescricao());
                System.out.println("Preço: " +dec.format(lista[i].getPreco()));
                System.out.println("Quantidade em estoque: " +lista[i].getQtdEstoque());
                System.out.println();
                
                return;
            }
        }
        
        throw new CodigoInexistente();
    }
    
    void imprimirGeral()
    {
        if(contador == 0)
        {
            throw new ListaZerada();
        }
        
        for(i=0; i<contador; i++)
        {
            if(i == 0)
            {
                System.out.println("\n- Impressão geral -\n");
            }
            
            System.out.println("Código: " +lista[i].getCodigo());
            System.out.println("Descrição: " +lista[i].getDescricao());
            System.out.println("Preço: " +dec.format(lista[i].getPreco()));
            System.out.println("Quantidade em estoque: " +lista[i].getQtdEstoque());
            System.out.println();
        }
        
        return;
    }
}
