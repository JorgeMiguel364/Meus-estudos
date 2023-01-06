package pessoasherança;

public class Funcionario extends Pessoa
{
    private String setor;
    private boolean trab;
    
    public void mudarTrabalho()
    {
        this.trab = !this.trab;
    }
    
    public String getSetor()
    {
        return setor;
    }
    
    public void setSetor(String s)
    {
        setor = s;
    }
    
    public boolean getTrab()
    {
        return trab;
    }
    
    public void setTrab(boolean t)
    {
        trab = t;
    }
}
