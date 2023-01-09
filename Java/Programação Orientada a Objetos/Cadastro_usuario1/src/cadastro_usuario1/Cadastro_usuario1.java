package cadastro_usuario1;

public class Cadastro_usuario1
{

    public static void main(String[] args)
    {
        lista_usuario lu1 = new lista_usuario(5);
        
        try
        {
            lu1.registrar(new usuario(168, "Renan Oliveira"));
            lu1.registrar(new usuario(689, "Marcos Henrique"));
            lu1.registrar(new usuario(664, "Luiz Prestes Filho"));
            lu1.registrar(new usuario(257, "João Pereira"));
            lu1.registrar(new usuario(639, "Gabriel de Souza Lima"));
            //lu1.registrar(new usuario(478, "Carlos da Silva"));
            //lu1.registrar(new usuario(581, "Paulo dos Santos"));
            
        }catch(lista_cheia | id_duplicado exception)
        {
            System.out.println(exception);
        }
    }
}
