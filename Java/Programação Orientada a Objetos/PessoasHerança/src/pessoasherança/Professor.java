package pessoasherança;

public class Professor extends Pessoa
{
    private String espec;
    private float sal;
    
    public void ReceberAum(float aum)
    {
        this.sal += aum;
    }
    
    public String getEspec()
    {
        return espec;
    }
    
    public void setEspec(String e)
    {
        this.espec = e;
    }
    
    public float getSal()
    {
        return sal;
    }
    
    public void setSal(float s)
    {
        this.sal = s;
    }
}
