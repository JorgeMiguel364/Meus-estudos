package escola;

public class Alunos
{
    private String nome;
    private int RG;
    private int RA;
    private String turno;
    private String status;
   
    /*private boolean ativo;
    private boolean suspenso;
    private boolean egresso;
    private boolean desistente;*/
    
    public Alunos()
    {
        
    }
    
    public Alunos(String nom, int rg, int ra, String turn)
    {
        this.nome = nom;
        this.RG = rg;
        this.RA = ra;
        this.turno = turn;
        this.status = "Ativo";
    }
    
    public void trancar()
    {
        if(status != "Ativo")
            System.out.println("Trancar - Erro! Só é possível alterar para suspenso alunos ativos!");
        else
            status = "Suspenso";
    }
    
    public void destrancar()
    {
        if(status != "Suspenso")
            System.out.println("Destrancar - Erro! Só é possível alterar para ativo alunos suspensos!");
        else
            status = "Ativo";
    }
    
    public void formar()
    {
        if(status != "Ativo")
            System.out.println("Formar - Erro! Só é possível alterar para egresso alunos ativos!");
        else
            status = "Egresso";
    }
    
    public void desistir()
    {
        if((status == "Ativo") || (status == "Suspenso"))
            status = "Desistente";
        else
            System.out.println("Desistir - Erro! Só é possível alterar para desistente alunos ativos ou suspensos!");
    }
    
    public void imprimir()
    {
        System.out.println("\n- Aluno -");
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("RA: " +RA);
        System.out.println("Turno: " +turno);
        System.out.println("Status: " +status+ "\n");
    }
}
