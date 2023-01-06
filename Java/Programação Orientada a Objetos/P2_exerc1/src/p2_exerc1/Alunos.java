package p2_exerc1;

public class Alunos
{
    private int cod_aluno;
    private String nome_aluno;
    private double nota_final;
    private int qt_faltas;
    
    public Alunos(int cod_aluno, String nome_aluno)
    {
        this.cod_aluno = cod_aluno;
        this.nome_aluno = nome_aluno;
        this.nota_final = 0;
        this.qt_faltas = 0;
    }    
    
    /*public Alunos(int cod_aluno, String nome_aluno, double nota_final, int qt_faltas)
    {
        this.cod_aluno = cod_aluno;
        this.nome_aluno = nome_aluno;
        this.nota_final = nota_final;
        this.qt_faltas = qt_faltas;
    }*/
    
    
    public int getCod_aluno()
    {
        return cod_aluno;
    }
    
    public void registrarFalta(int codigo)
    {
        
    }
}
