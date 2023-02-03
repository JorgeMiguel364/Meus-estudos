package cadastroalunos;

public class ListaAlunos
{
    Alunos listAl[];
    int contador, i;
    
    public ListaAlunos(int qtdMax)
    {
        listAl = new Alunos[qtdMax];
        contador = 0;
    }
    
    void adicionarAluno(Alunos al)
    {
        if(contador >= listAl.length)
        {
            throw new ListaCheia();
        }
        
        for(i=0; i<contador; i++)
        {
            if(listAl[i].getRA() == al.getRA())
            {
                throw new RADuplicado();
            }
        }
        
        listAl[contador] = al;
        
        System.out.println(listAl[contador].getRA()+ " - Aluno adicionado com sucesso!");
        
        contador++;
    }
    
}
