package array_exerc1;

public class exerc1a
{
    private String nome_turma;
    private int qt_alunos = 0, var_aux = 0;
    private String[] lista_alunos;
    
    // nome_turma
    public String getNome_turma()
    {
        return this.nome_turma;
    }
    
    public void setNome_turma(String NT)
    {
        this.nome_turma = NT;
    }
    
    // qt_alunos
    public int getQt_alunos()
    {
        return this.qt_alunos;
    }
    
    public void setQt_alunos(int QtA)
    {
        this.qt_alunos = QtA;
        lista_alunos = new String[qt_alunos];
    }
    
    // lista_alunos  
    public String getLista_alunos()
    {
        return this.lista_alunos[var_aux];
    }
    
    public void setLista_alunos(String LA)
    {
        this.lista_alunos[var_aux] = LA;
    }
    
    // var_aux
    public void setVar_aux(int VX)
    {
        if(VX > qt_alunos)
        {
            System.out.println(VX+ " - O valor máximo de posições do array são de " +qt_alunos+ " unidades!");
        }else{
            
            this.var_aux = VX;
        }
    }
    
    public void imprimir()
    {
        System.out.println("Nome da turma: " +nome_turma);
        System.out.println("Quantidade de alunos: " +qt_alunos);
        System.out.println("Lista de alunos:\n");
        
        //for(var_aux=0; var_aux<lista_alunos.length; var_aux++)
        for(var_aux=0; lista_alunos[var_aux] != null; var_aux++)
        {
            System.out.println((var_aux+1)+ " - " +lista_alunos[var_aux]);
        }
        
        System.out.println();
    }
}
