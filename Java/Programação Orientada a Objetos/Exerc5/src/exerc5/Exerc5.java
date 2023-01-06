package exerc5;
import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args){
        
        int val1;
        Scanner SC = new Scanner(System.in);
        Exerc5a ex5;
        
        System.out.print("Informe um valor: ");
        val1 = SC.nextInt();
        
        ex5 = new Exerc5a();
        
        if(val1 < 10)
            System.out.println(ex5.getMenor());
        else if(val1 > 10)
            System.out.println(ex5.getMaior());
        else
            System.out.println(ex5.getIgual());
    }
    
}
