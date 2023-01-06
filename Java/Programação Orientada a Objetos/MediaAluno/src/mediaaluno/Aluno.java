package mediaaluno;

public class Aluno
{
    double p1, p2, media;
    
    public Aluno(double p1_a, double p2_a)
    {
        this.p1 = p1_a;
        this.p2 = p2_a;
        media = 0;
    }
    
    public void Status()
    {
        media = (p1 + p2)/2;
        
        System.out.printf("Primeira nota: %.1f \n", p1);
        System.out.printf("Segunda nota: %.1f \n", p2);
        System.out.printf("Média: %.1f. Situação: ", media);
        
        if(media < 5)
            System.out.println("Reprovado!");
        else if (media == 6)
            System.out.println("Em recuperação!");
        else
            System.out.println("Aprovado!");
    }
}
