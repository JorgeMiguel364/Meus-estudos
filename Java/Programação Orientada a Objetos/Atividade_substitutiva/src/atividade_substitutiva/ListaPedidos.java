package atividade_substitutiva;

import java.text.DecimalFormat;

public class ListaPedidos
{
    Pedido lista[];
    int contador;
    
    DecimalFormat dec = new DecimalFormat("0.00");
    
    // Construtor
    public ListaPedidos(int qtMaxima)
    {
        lista = new Pedido[qtMaxima];
        contador = 0;
    }
    
    // Buscar pedido
    public Pedido buscarPedido(int numPed)
    {
        
        // Procura o pedido com o código informado no parâmetro
        for(int i=0; i<contador; i++)
        {
            if(lista[i].getNumeroPedido() == numPed)
            {
                return lista[i];
            }
        }
        
        return null;
    }
    
    // Cadastrar pedido
    public void cadastrarPedido(Pedido p)
    {
        
        // Verifica se o código do pedido já existe
        
        if(buscarPedido(p.getNumeroPedido()) == null)
        {
            
            // Verifica se a lista está lotada, caso contrário, adicione o pedido a lista
            
            if(lista.length <= contador)
            {
                throw new ListaLotada();
            }
            else
            {
                lista[contador] = p;
                contador++;
            }            
        }
        else
        {
            throw new PedidoJaExiste();            
        }                       
    }
    
    public void atenderPedido(int numPed)
    {
        Pedido p;
        
        p = buscarPedido(numPed);
        
        if(p == null)
        {
            throw new Verificada();            
        }
        else
        {
            p.setFoiAtendido(true);
        }
        
        /*
        boolean naoPossuiCodigo = true;
        
        for(int i=0; i<lista.length; i++)
        {
            if(lista[i].getNumeroPedido() == numPed)
            {
                lista[i].setFoiAtendido(true);
                naoPossuiCodigo = false;
            }                       
        }
        
        if(naoPossuiCodigo == true)
            throw new Verificada();
            
            */

    }
    
    public void relatorioCliente(int codCli, boolean todos, boolean atendidos)
    {
        if(todos == true)
        {
            System.out.println("\nParâmetro todos = true:");
            
            for(int i=0; i<contador; i++)
            {
                if(lista[i].getCodigoCliente() == codCli)
                {
                    System.out.println("\nNúmero do pedido: " +lista[i].getNumeroPedido());
                    System.out.println("Código do cliente: " +lista[i].getCodigoCliente());
                    System.out.println("Código do vendedor: " +lista[i].getCodigoVendedor());
                    System.out.println("Valor: " +dec.format(lista[i].getValor()));
                
                }                
            }
        }
        else
        {
            System.out.println("\nParâmetro todos = false:");
            
            if(atendidos == true)
            {
                System.out.println("\nParâmetro atendidos = true:");                
                
                for(int i=0; i<contador; i++)
                {
                    if((lista[i].getFoiAtendido() == true) && (lista[i].getCodigoCliente() == codCli))
                    {
                        System.out.println("\nNúmero do pedido: " +lista[i].getNumeroPedido());
                        System.out.println("Código do cliente: " +lista[i].getCodigoCliente());
                        System.out.println("Código do vendedor: " +lista[i].getCodigoVendedor());
                        System.out.println("Valor: " +lista[i].getValor());
                    }
                }
            }
            else
            {
                System.out.println("\nParâmetro atendidos = false:");                                
                
                for(int i=0; i<contador; i++)
                {
                    if((lista[i].getFoiAtendido() == false) && (lista[i].getCodigoCliente() == codCli))
                    {
                        System.out.println("\nNúmero do pedido: " +lista[i].getNumeroPedido());
                        System.out.println("Código do cliente: " +lista[i].getCodigoCliente());
                        System.out.println("Código do vendedor: " +lista[i].getCodigoVendedor());
                        System.out.println("Valor: " +lista[i].getValor());
                    }
                }
                
            }
        }
    }
    
    public void pagarVendedor(int codVend, double porcent)
    {
        double valorTotal = 0;
        
        System.out.println("\nPedidos atendidos mas não pagos:");
        
        for(int i=0; i<contador; i++)
        {
            if((lista[i].getFoiAtendido() == true) && (lista[i].getCodigoVendedor() == codVend))
            {
                lista[i].setFoiPago(true);
                
                System.out.println("\nNúmero do pedido: " +lista[i].getNumeroPedido());
                System.out.println("Código do cliente: " +lista[i].getCodigoCliente());
                System.out.println("Código do vendedor: " +lista[i].getCodigoVendedor());
                System.out.println("Valor: " +lista[i].getValor());
                System.out.println("Status: pago");
                
                valorTotal =+ lista[i].getValor();                
            }
        }
        
        System.out.println("\nLucro total: " +valorTotal);
        System.out.println("A comissão a ser paga ao vendedor é de: " +(porcent * valorTotal));
    }
}
