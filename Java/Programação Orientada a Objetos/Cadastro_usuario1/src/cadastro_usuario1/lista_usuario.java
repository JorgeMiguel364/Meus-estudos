package cadastro_usuario1;

public class lista_usuario
{
    usuario lista[];
    int contadorAux;
    
    public lista_usuario(int qtd_maxima)
    {
        lista = new usuario[qtd_maxima];
        contadorAux = 0;
    }
    
    public void verificarId(int id)
    {
        for(int i=0; i<contadorAux; i++)
        {
            if(lista[i].getId() == id)
            {
                throw new id_duplicado();
            }
        }
    }
    
    public void registrar(usuario us)
    {
        if(contadorAux >= lista.length)
        {
            throw new lista_cheia();
        }
        
        verificarId(us.getId());
        
        lista[contadorAux] = us;
        
        System.out.println("Código: " +lista[contadorAux].getId());
        System.out.println("Nome: " +lista[contadorAux].getNome());
        System.out.println("Cadastro realizado com êxito!\n");
        
        contadorAux++;        
    }
}
