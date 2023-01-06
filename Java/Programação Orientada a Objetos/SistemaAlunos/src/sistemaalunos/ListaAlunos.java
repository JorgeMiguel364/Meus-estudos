package sistemaalunos;

public class ListaAlunos
{
    Alunos lista[];
    int contador;
    
    public ListaAlunos(int qtMaxima)
    {
        lista = new Alunos[qtMaxima];
        contador = 0;
    }
    
    int adicionarAluno(Alunos aluno)
    {
        if(lista.length <= contador)
        {
            throw new ListaCheia();
        }
        else
        {
            lista[contador] = aluno;
            contador++;
            return contador - 1;
        }
    }
    
    void imprimirAluno(int codigo)
    {
        for(int i=0; i<contador; i++)
        {
            if(lista[i].getCodigo() == codigo)
            {
                System.out.println("\nCódigo: " +lista[i].getCodigo());
                System.out.println("RA: " +lista[i].getRA());
                System.out.println("Nome: " +lista[i].getNome());
                System.out.println("Curso: " +lista[i].getCurso());
                
                System.out.print("Cursando? ");
                if(lista[i].getCursando() == true)
                {
                    System.out.println("Sim");
                }
                else
                {
                    System.out.println("Não");
                }
                
                return;
            }
        }
        
        throw new CodigoInvalido();
    }
}
