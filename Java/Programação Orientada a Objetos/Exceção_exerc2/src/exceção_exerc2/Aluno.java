package exceção_exerc2;

public class Aluno extends Pessoa
{
    private int ID_aluno;
    
    public void setID_aluno(int ID)
    {
        ID_aluno = ID;
    }
    
    public int getID_aluno()
    {
        return ID_aluno;
    }
    
    public void AdicionarAluno(String nome, int idade, int CPF, int RG, int ID_aluno)
    {
        setNome(nome);
        setIdade(idade);
        setCPF(CPF);
        setRG(RG);
        this.ID_aluno = ID_aluno;
    }
    
    public void RemoverAluno(int ID_aluno) throws Exception
    {
        if ()
        {
            
        }
    }
}
