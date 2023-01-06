package p2_exerc1;

public class Turma
{
    private String nomecurso;
    private int quantidade_aulas;
    private Alunos lista_alunos[] = new Alunos[20];
    private int var_aux = 0;
    
    private int i;
    
    /*
    public Turma()
    {
        
    }*/
    
    public int buscarCod(int cod)
    {
        for(i=0; i<var_aux; i++)
        {
            if(cod == lista_alunos[i].getCod_aluno())
            {
                return i;
            }            
        }
        return -1;
    }
    
    public void incluirAluno(Alunos al1)
    {
        if(var_aux >= lista_alunos.length)
        {
            throw new RuntimeException("A quantidade de alunos máxima são de 20!");
        }
        else if (buscarCod(al1.getCod_aluno()) > -1)
        {
            throw new RuntimeException("Os dois códigos são iguais!");
        }
        
        lista_alunos[var_aux] = al1;
        var_aux++;
    }
    
    Alunos buscarAluno(int codigo)
    {
        
    }
}
