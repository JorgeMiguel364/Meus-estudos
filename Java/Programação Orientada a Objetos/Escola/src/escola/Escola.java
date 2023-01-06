package escola;

public class Escola{

    public static void main(String[] args)
    {
        Alunos a1 = new Alunos("João Lima", 2678924, 1703683, "Diurno");
        //a1.trancar();
        a1.formar();
        a1.desistir();
        a1.imprimir();
        
        Funcionários f1 = new Funcionários();
        f1.setNome("José Alves");
        f1.setQt_horas(12);
        f1.setRg(481270367);
        f1.setSal_hora(20);
        f1.imprimir();
        
        Professores p1 = new Professores("Edson Arantes da Silva", 1231245, 30.6, 9, "Humanas");
        p1.imprimir();   
    }
}
